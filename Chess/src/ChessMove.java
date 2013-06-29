

public class ChessMove {

	private ChessPiece piece;
	private ChessPosition from;
	private ChessPosition to;
	private ChessPiece captured;
	
	public ChessMove(ChessPiece piece, ChessPosition from, ChessPosition to, ChessPiece captured) {
		this.piece = piece;
		this.from = from;
		this.to = to;
		this.captured = captured;
	}

	public ChessPiece getPiece() {
		return piece;
	}
	
	public ChessPosition getFrom() {
		return from;
	}

	public ChessPosition getTo() {
		return to;
	}
	
	public ChessPiece getCaptured() {
		return captured;
	}
	
	public boolean pieceWasCaptured() {
		return (captured != null);
	}
	
	@Override
	public String toString() {
		String result;
		try{
			piece = (King) piece;
			if(from.getX() == 4 && to.getX() == 2){
				result = piece.getOwner().getName() + " Castled Queenside";
			}else if(from.getX() == 4 && to.getX() == 6){
				result = piece.getOwner().getName() + " Castled Kingside";
			}else{
				result =  piece.getOwner().getName() + "'s " + piece.toString() + " moved from " + from.toString() + " to " + to.toString();
				
				if (pieceWasCaptured()) {
					result += " capturing " + captured.getOwner().getName() + "'s " + captured.toString();
				}
			}
			return result;
		}catch(Exception e){
			result =  piece.getOwner().getName() + "'s " + piece.toString() + " moved from " + from.toString() + " to " + to.toString();
				
			if (pieceWasCaptured()) {
				result += " capturing " + captured.getOwner().getName() + "'s " + captured.toString();
			}
			return result;
		}
		
	}
}
