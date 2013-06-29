

import javax.swing.JFrame;

public class Chess {

	public static void main(String[] args) {

		ChessPlayer p1 = new ChessPlayer("White");
		ChessPlayer p2 = new ChessPlayer("Black");

		GameController game = new GameController(p1, p2);
		
		JFrame main_frame = new JFrame();
		main_frame.setTitle("Chess Game");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main_frame.setContentPane(game.getView());
		main_frame.pack();
		main_frame.setVisible(true);
		
	}
}
