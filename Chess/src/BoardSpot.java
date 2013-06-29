

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;


public class BoardSpot extends JLabel{
	
	ChessPosition position;
	
	/*
	 * Constructor
	 * PRE: label is a string representing the piece in this spot on the board and position is the
	 * 		ChessPosition object representing the location of this spot on the board.
	 * POST: A board spot object has been created with a label and position and background color.
	 */
	public BoardSpot(String label, ChessPosition position){
		super(label);
		this.position = position;
		
		//in order to determine if the square is odd or even for coloring the squares.
		int x = position.getX(), y = position.getY();
		
		setPreferredSize(new Dimension(40,40));
		
		//set the color to either blue or light gray depending on the x and y.
		if((x + y) % 2 == 0){
			setBackground(Color.BLUE);
		}else{
			setBackground(Color.LIGHT_GRAY);
		}
		
	}
	
	/*
	 * Returns the position of the BoardSpot object.
	 * PRE: NONE.
	 * POST: the position has been returned.
	 */
	public ChessPosition getPosition(){
		return position;
	}

}
