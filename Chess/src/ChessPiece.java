

import javax.swing.ImageIcon;

public abstract class ChessPiece extends java.util.Observable{

	private ChessPlayer owner;
	private GameController game;
	private ChessPosition position;
	protected char mark;
	protected ImageIcon img;
	
	protected ChessPiece(ChessPlayer owner, GameController game, ChessPosition init_position) {
		this.owner = owner;
		this.game = game;
		this.position = null;
		
		game.getBoard().placePieceAt(this, init_position);
		addObserver(game);
	}
	
	public ChessPlayer getOwner() {
		return owner;
	}
	
	public GameController getGame() {
		return game;
	}
			
	public ChessPosition getPosition() {
		return position;
	}
	
	public ImageIcon getIcon(){
		return img;
	}
	
	public void setPosition(ChessPosition destination) {
		position = destination;
	}
		
	protected boolean isPointDiagonal(ChessPosition start, ChessPosition end) {

		if (start.getX() == end.getX())
			return false;

		if (start.getY() == end.getY())
			return false;

		if ((Math.abs((end.getY() - start.getY()))) != (Math
				.abs((end.getX() - start.getX())))) {
			return false;

		} else
			return true;
	}

	protected boolean lineOfSight(ChessPosition start, ChessPosition end) {
		int dx = 0;
		int dy = 0;

		if (start.getY() < end.getY()){
			dy = 1;
		}if (start.getX() < end.getX()){
			dx = 1;
		}if (start.getY() > end.getY()){
			dy = -1;
		}if (start.getX() > end.getX()){
			dx = -1;
		}

		int x = start.getX();
		int y = start.getY();
		ChessPosition position = new ChessPosition(x += dx, y += dy);

		while (!position.equals(end)) {
			if (getGame().getBoard().getPieceAt(position) != null) {
				return false;
			}

			x += dx;
			y += dy;
			position = new ChessPosition(x, y);
		}

		return true;
	}

	public void moveTo(ChessPosition destination) throws IllegalMove {

		if (getPosition().equals(destination)) {
			throw new IllegalMove(this, position, destination);
		}
		
		if(game.whiteToMove() && getOwner().getName() == "Black"){
			throw new IllegalMove(this, position, destination);
		}else if(!game.whiteToMove() && getOwner().getName() == "White"){
			throw new IllegalMove(this, position, destination);
		}

		if (getGame().getBoard().getPieceAt(destination) == null) {
			
			ChessMove move = new ChessMove(this, this.getPosition(), destination, getGame().getBoard().getPieceAt(destination));
			getGame().getBoard().removePieceFrom(this.getPosition());
			getGame().getBoard().placePieceAt(this, destination);
			setChanged();
			notifyObservers(move); 
			
		}else if (getGame().getBoard().getPieceAt(destination) != null) {

			if (getGame().getBoard().getPieceAt(destination).getOwner() == this.getOwner()) {
				throw new IllegalMove(this, position, destination);
			}else {
				ChessMove move = new ChessMove(this, this.getPosition(), destination, getGame().getBoard().getPieceAt(destination));
				getGame().getBoard().removePieceFrom(this.getPosition());
				getGame().getBoard().removePieceFrom(destination);
				getGame().getBoard().placePieceAt(this, destination);
				setChanged();
				notifyObservers(move); 
			}

		}

	}
	
	public char getMark() {
		return mark;
	}
	
}

class Rook extends ChessPiece {
	private boolean has_moved;
	
	public Rook(ChessPlayer owner, GameController game, ChessPosition init_position) {
		super(owner, game, init_position);
		has_moved = false;
		if (owner == game.getPlayer1()) {
			mark = 'r';
			img = new ImageIcon(getClass().getResource("wr.gif"));
		} else {
			mark = 'R';
			img = new ImageIcon(getClass().getResource("br.gif"));
		}
	}
	
	public void moveTo(ChessPosition destination) throws IllegalMove {

		if (!lineOfSight(this.getPosition(), destination)) {
			throw new IllegalMove(this, this.getPosition(), destination);
		}

		if (destination.getX() != this.getPosition().getX()
				&& destination.getY() != this.getPosition().getY()) {
			throw new IllegalMove(this, this.getPosition(), destination);
		}else{
			super.moveTo(destination);
			has_moved = true;
		}
	}
	
	public boolean hasMoved(){
		return has_moved;
	}
	
	public String toString(){
		return "Rook";
	}
}

class Bishop extends ChessPiece {
	public Bishop(ChessPlayer owner, GameController game, ChessPosition init_position) {
		super(owner, game, init_position);
		if (owner == game.getPlayer1()) {
			mark = 'b';
			img = new ImageIcon(getClass().getResource("wb.gif"));
		} else {
			mark = 'B';
			img = new ImageIcon(getClass().getResource("bb.gif"));
		}
	}
	
	public void moveTo(ChessPosition destination) throws IllegalMove {

		if (!this.isPointDiagonal(this.getPosition(), destination) || !lineOfSight(getPosition(), destination)) {
			throw new IllegalMove(this, this.getPosition(), destination);
		}else{
			super.moveTo(destination);
		}
	}
	
	public String toString(){
		return "Bishop";
	}
}

class Knight extends ChessPiece {
	public Knight(ChessPlayer owner, GameController game, ChessPosition init_position) {
		super(owner, game, init_position);
		if (owner == game.getPlayer1()) {
			mark = 'n';
			img = new ImageIcon(getClass().getResource("wn.gif"));
		} else {
			mark = 'N';
			img = new ImageIcon(getClass().getResource("bn.gif"));
		}
	}
	
	public void moveTo(ChessPosition destination) throws IllegalMove{
		
		/*
		 * knights can move to 8 spaces: 2 spaces up on either side, 1 space up and 2 spaces to either side,
		 * 2 spaces down on either side, and 1 space down and 2 spaces to either side. This statement determines
		 * if the move is to one of those 8 squares.
		 */
		if(((getPosition().getX() == destination.getX() + 1 || getPosition().getX() == destination.getX() - 1)
				&& (getPosition().getY() == destination.getY() + 2 || getPosition().getY() == destination.getY() - 2))
				|| ((getPosition().getX() == destination.getX() + 2 || getPosition().getX() == destination.getX() - 2)
				&& (getPosition().getY() == destination.getY() + 1 || getPosition().getY() == destination.getY() - 1))){
			super.moveTo(destination);
		}else{
			throw new IllegalMove(this, getPosition(), destination);
		}
	}
	
	public String toString(){
		return "Knight";
	}
}

class Queen extends ChessPiece {
	public Queen(ChessPlayer owner, GameController game, ChessPosition init_position) {
		super(owner, game, init_position);
		if (owner == game.getPlayer1()) {
			mark = 'q';
			img = new ImageIcon(getClass().getResource("wq.gif"));
		} else {
			mark = 'Q';
			img = new ImageIcon(getClass().getResource("bq.gif"));
		}
	}
	
	public void moveTo(ChessPosition destination) throws IllegalMove {
		if (!lineOfSight(this.getPosition(), destination)) {
			throw new IllegalMove(this, this.getPosition(), destination);
		}else {
			super.moveTo(destination);
		}
	}
	
	public String toString(){
		return "Queen";
	}
}

class King extends ChessPiece {
	private boolean has_moved;
	public King(ChessPlayer owner, GameController game, ChessPosition init_position) {
		super(owner, game, init_position);
		has_moved = false;
		if (owner == game.getPlayer1()) {
			mark = 'k';
			img = new ImageIcon(getClass().getResource("wk.gif"));
		} else {
			mark = 'K';
			img = new ImageIcon(getClass().getResource("bk.gif"));
		}
	}
	
	public void moveTo(ChessPosition destination) throws IllegalMove{
		
		if((destination.getX() == getPosition().getX() + 2 || destination.getX() == getPosition().getX() - 2) && destination.getY() == getPosition().getY()){
			
			if(has_moved){
				throw new IllegalMove(this, getPosition(), destination);
			}else if(destination.getX() > getPosition().getX()){
				try{
					Rook rook = (Rook) getGame().getBoard().getPieceAt(new ChessPosition(destination.getX() + 1, destination.getY()));
					if(rook.hasMoved()){
						throw new IllegalMove(this, getPosition(), destination);
					}
				}catch(Exception e){
					throw new IllegalMove(this, getPosition(), destination);
				}
				
			}else if(destination.getX() < getPosition().getX()){
				try{
					Rook rook = (Rook) getGame().getBoard().getPieceAt(new ChessPosition(destination.getX() - 2, destination.getY()));
					if(rook.hasMoved()){
						throw new IllegalMove(this, getPosition(), destination);
					}
				}catch(Exception e){
					throw new IllegalMove(this, getPosition(), destination);
				}
			}
			
			if(destination.getX() > getPosition().getX() && (getGame().getBoard().getPieceAt(destination) != null
					|| getGame().getBoard().getPieceAt(new ChessPosition(destination.getX() - 1, destination.getY())) != null)){
				throw new IllegalMove(this, getPosition(), destination);
			}else{
				if(destination.getX() > getPosition().getX()){
					ChessPlayer owner = getGame().getBoard().getPieceAt(new ChessPosition(7, destination.getY())).getOwner();
					getGame().getBoard().removePieceFrom(new ChessPosition(7, destination.getY()));
					new Rook(owner, getGame(), new ChessPosition(5, destination.getY()));
				}else{
					ChessPlayer owner = getGame().getBoard().getPieceAt(new ChessPosition(0, destination.getY())).getOwner();
					getGame().getBoard().removePieceFrom(new ChessPosition(0, destination.getY()));
					new Rook(owner, getGame(), new ChessPosition(3, destination.getY()));
				}
				super.moveTo(destination);
			}
			
		}else if(Math.abs(getPosition().getX() - destination.getX()) > 1 
				|| Math.abs(getPosition().getY() - destination.getY()) > 1){
			
			throw new IllegalMove(this, getPosition(), destination);
			
		}else{
			
			super.moveTo(destination);
			has_moved = true;
			
		}
	}
	
	public String toString(){
		return "King";
	}
}

class Pawn extends ChessPiece {
	public Pawn(ChessPlayer owner, GameController game, ChessPosition init_position) {
		super(owner, game, init_position);
		if (owner == game.getPlayer1()) {
			mark = 'p';
			img = new ImageIcon(getClass().getResource("wp.gif"));
		} else {
			mark = 'P';
			img = new ImageIcon(getClass().getResource("bp.gif"));
		}
	}
	
	public void moveTo(ChessPosition destination) throws IllegalMove{
		
		//player 1's pawns will behave differently than player 2's pawns
		if(mark == 'p'){
			
			//pawns can move 2 spaces on their first move, but only if they are not blocked
			if(getPosition().getY() == 1 
					&& (destination.getY() == 2 || (destination.getY() == 3 && getGame().getBoard().getPieceAt(new ChessPosition(destination.getX(), 2)) == null)) 
					&& getPosition().getX() == destination.getX() 
					&& getGame().getBoard().getPieceAt(destination) == null){
				super.moveTo(destination);
				
			}else if(destination.getY() == getPosition().getY() + 1 
					&& destination.getX() == getPosition().getX() 
					&& getGame().getBoard().getPieceAt(destination) == null){
				super.moveTo(destination);
				
			//in the case of a pawn taking another piece, it moves diagonally only
			}else if(destination.getY() == getPosition().getY() + 1 
					&& (destination.getX() == getPosition().getX() + 1 || destination.getX() == getPosition().getX() - 1) 
					&& getGame().getBoard().getPieceAt(destination) != null
					&& getGame().getBoard().getPieceAt(destination).getOwner() != getOwner()){
				super.moveTo(destination);
				
			}else{
				throw new IllegalMove(this, getPosition(), destination);
			}
			
		//same behavior for opponent's pawns, but in reverse
		}else{
			if(getPosition().getY() == 6 
					&& (destination.getY() == 5 || (destination.getY() == 4 && getGame().getBoard().getPieceAt(new ChessPosition(destination.getX(), 5)) == null)) 
					&& getPosition().getX() == destination.getX() 
					&& getGame().getBoard().getPieceAt(destination) == null){
				super.moveTo(destination);
				
			}else if(destination.getY() == getPosition().getY() - 1 
					&& destination.getX() == getPosition().getX() 
					&& getGame().getBoard().getPieceAt(destination) == null){
				super.moveTo(destination);
				
			//take a piece diagonally
			}else if(destination.getY() == getPosition().getY() - 1 
					&& (destination.getX() == getPosition().getX() + 1 || destination.getX() == getPosition().getX() - 1) 
					&& getGame().getBoard().getPieceAt(destination) != null
					&& getGame().getBoard().getPieceAt(destination).getOwner() != getOwner()){
				super.moveTo(destination);
				
			}else{
				throw new IllegalMove(this, getPosition(), destination);
			}
		}
	}
	
	public String toString(){
		return "Pawn";
	}
}