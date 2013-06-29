

import java.util.*;
import java.awt.*;

import javax.swing.*;


public class BoardView extends JPanel implements java.util.Observer {
	
	//Object fields encapsulated by ChessGameView
	private GameController game;
	private JPanel pane;
	private JLabel p1;
	private JLabel p2;
	private JLabel blank;
	private JLabel a, b, c, d, e, f, g, h, one, two, three, four, five, six, seven, eight;
	private JButton undo;
	private BoardSpot[][] spots;
	
	/*
	 * CONSTRUCTOR
	 * Opens a JPanel with labels for player 1, player 2, and a chess board.
	 * PRE: game is the ChessGame object being modeled and observed by this ChessGameView object.
	 * POST: A JPanel has been initialized and the ChessGameView object has been created.
	 */
	public BoardView(GameController game) {
		//initialize object fields
		this.game = game;
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		this.spots = new BoardSpot[8][8];
		
		//create the JLabel for player 2
		p2 = new JLabel("Black");
		p2.setOpaque(true);
		p2.setHorizontalAlignment(SwingConstants.CENTER);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 15;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.ipadx = 10;
		c.ipady = 10;
		c.weightx = 0.5;
		c.weighty = 0.5;
		this.add(p2, c);
		
		//Displays the chess board and pieces here.
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				spots[i][j] = new BoardSpot(this.getName(), new ChessPosition(j, (7 - i)));
				c.fill = GridBagConstraints.BOTH;
				c.ipadx = 15;
				c.ipady = 15;
				c.gridx = j + 3;
				c.gridy = i + 1;
				
				try{
					ImageIcon img = game.getBoard().getPieceAt(new ChessPosition(j, (7 - i))).getIcon();
	                spots[i][j].setIcon(img);
	            }catch(NullPointerException e){
	            	spots[i][j].setIcon(new ImageIcon());
	            }
				
				spots[i][j].setOpaque(true);
				
				this.spots[i][j].addMouseListener(game);
				this.add(spots[i][j], c);
				this.spots[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				
				
			}
		}
		
		a = new JLabel("a");
		a.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 3;
		c.gridy = 9;
		c.ipadx = 10;
		c.ipady = 10;
		this.add(a, c);
		
		b = new JLabel("b");
		b.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 4;
		this.add(b, c);
		
		this.c = new JLabel("c");
		this.c.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 5;
		this.add(this.c, c);
		
		d = new JLabel("d");
		d.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 6;
		this.add(d, c);
		
		e = new JLabel("e");
		e.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 7;
		this.add(e, c);
		
		f = new JLabel("f");
		f.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 8;
		this.add(f, c);
		
		g = new JLabel("g");
		g.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 9;
		this.add(g, c);
		
		h = new JLabel("h");
		h.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 10;
		this.add(h, c);
		
		one = new JLabel("1");
		one.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridx = 2;
		c.gridy = 8;
		this.add(one, c);
		
		two = new JLabel("2");
		two.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 7;
		this.add(two, c);
		
		three = new JLabel("3");
		three.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 6;
		this.add(three, c);
		
		four = new JLabel("4");
		four.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 5;
		this.add(four, c);
		
		five = new JLabel("5");
		five.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 4;
		this.add(five, c);
		
		six = new JLabel("6");
		six.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 3;
		this.add(six, c);
		
		seven = new JLabel("7");
		seven.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 2;
		this.add(seven, c);
		
		eight = new JLabel("8");
		eight.setHorizontalAlignment(SwingConstants.CENTER);
		c.gridy = 1;
		this.add(eight, c);
		
		//create the JLabel for player 1
		p1 = new JLabel("White");
		p1.setOpaque(true);
		p1.setHorizontalAlignment(SwingConstants.CENTER);
		p1.setBorder(BorderFactory.createLineBorder(Color.RED));
		p1.setBackground(Color.YELLOW);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 15;
		c.gridy = 9;
		this.add(p1, c);
		
		blank = new JLabel("        ");
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		this.add(blank, c);
		
		//create the JButton for the undo button
		undo = new JButton("Undo");
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 6;
		c.gridy = 10;
		c.gridwidth = 2;
		c.gridheight = 1;
		this.add(undo, c);
		undo.addActionListener(game);
	}

	/*
	 * Updates the image displayed on the JPanel when observable objects call the notifyObservers() method.
	 * PRE: Accepts parameters from the notifyObserver method.
	 * POST: The board has been updated to reflect the change to the board.
	 */
	public void update(Observable o, Object arg) {
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if((j + i) % 2 == 0){
					spots[j][7 - i].setBackground(Color.BLUE);
				}else{
					spots[j][7 - i].setBackground(Color.LIGHT_GRAY);
				}
				if(game.getBoard().getPieceAt(new ChessPosition(j, (7 - i))) != null){
					ImageIcon img = game.getBoard().getPieceAt(new ChessPosition(j, (7 - i))).getIcon();
	                spots[i][j].setIcon(img);
	            }else{
	            	spots[i][j].setIcon(new ImageIcon());
	            }
			}
		}
	}
	
	public void changeTurns(){
		if(p1.getBorder() != null){
			p1.setBorder(null);
			p1.setBackground(null);
			p2.setBorder(BorderFactory.createLineBorder(Color.RED));
			p2.setBackground(Color.YELLOW);
		}else{
			p2.setBorder(null);
			p2.setBackground(null);
			p1.setBorder(BorderFactory.createLineBorder(Color.RED));
			p1.setBackground(Color.YELLOW);
		}
	}
	
	public JButton getUndo(){
		return undo;
	}
}