

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.BorderFactory;

public class GameController implements
		java.util.Observer, MouseListener, ActionListener{

	private BoardModel board;
	private BoardView view;
	private ChessPlayer player1;
	private ChessPlayer player2;
	private ArrayList<ChessMove> log;
	private boolean white_to_move;
	private ChessPiece piece;

	public GameController(ChessPlayer player1, ChessPlayer player2) {
		white_to_move = true;
		this.player1 = player1;
		this.player2 = player2;
		board = new BoardModel();
		view = new BoardView(this);
		log = new ArrayList<ChessMove>();
		piece = null;

		new Rook(player1, this, new ChessPosition(0, 0));
		new Knight(player1, this, new ChessPosition(1, 0));
		new Bishop(player1, this, new ChessPosition(2, 0));
		new Queen(player1, this, new ChessPosition(3, 0));
		new King(player1, this, new ChessPosition(4, 0));
		new Bishop(player1, this, new ChessPosition(5, 0));
		new Knight(player1, this, new ChessPosition(6, 0));
		new Rook(player1, this, new ChessPosition(7, 0));

		for (int i = 0; i < 8; i++) {
			new Pawn(player1, this, new ChessPosition(i, 1));
		}

		new Rook(player2, this, new ChessPosition(0, 7));
		new Knight(player2, this, new ChessPosition(1, 7));
		new Bishop(player2, this, new ChessPosition(2, 7));
		new Queen(player2, this, new ChessPosition(3, 7));
		new King(player2, this, new ChessPosition(4, 7));
		new Bishop(player2, this, new ChessPosition(5, 7));
		new Knight(player2, this, new ChessPosition(6, 7));
		new Rook(player2, this, new ChessPosition(7, 7));

		for (int i = 0; i < 8; i++) {
			new Pawn(player2, this, new ChessPosition(i, 6));
		}
		view.update(new Observable(), new Object());
	}

	public ChessPlayer getPlayer1() {
		return player1;
	}

	public ChessPlayer getPlayer2() {
		return player2;
	}

	public BoardModel getBoard() {
		return board;
	}

	public int getLogSize() {
		return log.size();
	}

	public boolean whiteToMove() {
		return white_to_move;
	}

	public void changeTurns() {
		white_to_move = !white_to_move;
	}

	public ChessMove[] getMoves(int n) {
		int logSize = getLogSize();
		ChessMove[] moves;

		if (getLogSize() == 0 || n == 0 || Math.abs(n) > getLogSize()) {
			moves = new ChessMove[logSize];
			for (int i = 0; i < logSize; i++) {
				moves[i] = log.get(i);
			}
			return moves;
		}

		if (n > 0) {
			moves = new ChessMove[n];
			for (int i = 0; i < n; i++) {
				moves[i] = log.get(i);
			}
			return moves;

		} else {
			moves = new ChessMove[Math.abs(n)];

			int logIndex = logSize - (Math.abs(n));

			for (int i = 0; i < Math.abs(n); i++) {
				moves[i] = log.get(logIndex);
				logIndex++;
			}

			return moves;

		}
	}

	public void undo() {
		if (getLogSize() > 0) {
			ChessMove previousMove = log.get(getLogSize() - 1);
			ChessPiece piece = previousMove.getPiece();
			ChessPosition originalPosition = previousMove.getFrom();
			ChessPosition destination = previousMove.getTo();
			ChessPiece captured = previousMove.getCaptured();

			log.remove(getLogSize() - 1);

			board.removePieceFrom(destination);
			board.placePieceAt(piece, originalPosition);
			changeTurns();

			if (captured != null) {
				board.placePieceAt(captured, destination);
				view.update(new Observable(), new Object());
			} else {
				view.update(new Observable(), new Object());
			}

			try {
				piece = (King) piece;
				if (originalPosition.getX() == destination.getX() + 2) {
					piece = board.getPieceAt(new ChessPosition(3, destination
							.getY()));
					board.removePieceFrom(new ChessPosition(3, destination
							.getY()));
					board.placePieceAt(piece,
							new ChessPosition(0, destination.getY()));
				} else if (originalPosition.getX() == destination.getX() - 2) {
					piece = board.getPieceAt(new ChessPosition(5, destination
							.getY()));
					board.removePieceFrom(new ChessPosition(5, destination
							.getY()));
					board.placePieceAt(piece,
							new ChessPosition(7, destination.getY()));
				}
				view.update(new Observable(), new Object());
			} catch (Exception e) {

			}
		}
	}

	public void update(Observable o, Object arg) {
		ChessMove move = (ChessMove) arg;
		log.add(move);
		view.update(new Observable(), new Object());

	}
	
	/*
	 * Determines if the mouse has clicked on a piece or a square and then either moves the piece to the empty square or "picks up" the piece that has been clicked on.
	 * PRE: the mouse has been clicked somewhere on the board.
	 * POST: The game has been updated to reflect any changes made to the board.
	 */
	public void mouseClicked(MouseEvent e) {
		BoardSpot spot = (BoardSpot)e.getComponent();
		if(piece == null){
			piece = getBoard().getPieceAt(spot.getPosition());
			if(piece != null){
				spot.setBackground(Color.YELLOW);
			}
		}else{
			try {
				piece.moveTo(spot.getPosition());
				changeTurns();
				piece = null;
				view.changeTurns();
			} catch (IllegalMove e1) {
				piece = null;
				System.out.println("Illegal Move");
			}
			view.update(new Observable(), new Object());
		}
	}

	/*
	 * Highlights a border on a square when the mouse enters it
	 */
	public void mouseEntered(MouseEvent e) {
		BoardSpot spot = (BoardSpot)e.getComponent();
		spot.setBorder(BorderFactory.createLineBorder(Color.RED));
		
	}

	/*
	 * Removes the highlighted border on the square when the mouse leaves it.
	 */
	public void mouseExited(MouseEvent e) {
		BoardSpot spot = (BoardSpot)e.getComponent();
		spot.setBorder(null);
		
	}

	public void mousePressed(MouseEvent e) {
		
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void actionPerformed(ActionEvent e){
        undo();
        view.changeTurns();
    }
	
	public BoardView getView(){
		return view;
	}

}