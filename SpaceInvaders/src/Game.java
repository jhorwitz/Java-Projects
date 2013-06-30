// Game - this is the central class around which the Space Invaders
// project is built. It contains some methods you will have to
// modify and you will have to add some methods. Additionally,
// it contains methods for handling the details of the graphics.
// Do not change the definition or call to any method whose name
// begins with 'graphics'.  Do not change any code below the
// 'BELOW HERE LIE DRAGONS' line.
//
// Birds eye view of the structure of this class
// class Game
//    constants
//    variables
//    methods you will use and modify - in alphabetical order
//       Game - constructor
//       drawAllObjects
//       initializeAllObjects
//       moveAllObjects
//       playGame
//    graphics methods (and classes)
//       
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends Canvas {

	private static final long serialVersionUID = 1L;
	public final int SCREEN_WIDTH = 800;
	public final int SCREEN_HEIGHT = 600;
	
	public final int PAUSE_INTERVAL = 15;

	private Base base;
	private Missile missile;
	private Alien alien;
	private Graphics2D window;
	private BufferStrategy strategy;
	private boolean gameRunning = true;
	private boolean waitingForKeyPress = true;
	private boolean leftCursorCurrentlyPressed = false;
	private boolean rightCursorCurrentlyPressed = false;
	private boolean fireCurrrentlyPressed = false;
	private boolean stopCurrentlyPressed = false;
	final String FIRE_MISSILE_WAV = "FireMissile.wav";
	final Sound FIRE_MISSILE = SoundStore.get().getSound(FIRE_MISSILE_WAV);
	final String LOSES_WAV = "loser.wav";
	final Sound LOSES = SoundStore.get().getSound(LOSES_WAV);

	/*
     * Constructor
	 * Create a new game that is ready to play
	 */
	public Game() {
		graphicsInitialization();
		initializeAllObjects();
	}

	private void drawAllObjects() {
		base.draw(window);
		missile.draw(window);
		alien.draw(window);
	}

	private void fireMissile() {
		if (fireCurrrentlyPressed && missile.getY() <= 0){
			FIRE_MISSILE.playSound();
			System.out.println("fire missile");
			missile = new Missile(base.getX() + 10,SCREEN_HEIGHT - 45);
		}
	}

	private void initializeAllObjects() {
		final int BASE_X_POSITION = SCREEN_WIDTH / 2;
		final int BASE_Y_POSITION = SCREEN_HEIGHT - 30;
		base = new Base(BASE_X_POSITION, BASE_Y_POSITION);
		missile = new Missile(BASE_X_POSITION + 10, BASE_Y_POSITION - 20);
		alien = new Alien(SCREEN_WIDTH / 2, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

	}

	private boolean isBaseOnLeftEdge() {
		final int LEFT_BOUNDARY = 5;
		if(base.getX() < LEFT_BOUNDARY){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean isBaseOnRightEdge() {
		final int RIGHT_BOUNDARY = SCREEN_WIDTH - 40;
		if(base.getX() > RIGHT_BOUNDARY){
			return true;
		}else{
			return false;
		}
	}

	private void moveAllObjects() {
		if(alien.isHit(missile)){
			System.out.println("Player wins.");
			gameRunning = false;
		}else if(alien.wins()){
			LOSES.playSound();
			System.out.println("Alien wins.");
			gameRunning = false;
		}else{	
			if (moveBaseLeft()) {
				base.moveLeft();
			} else if (moveBaseRight()) {
				base.moveRight();
			}
			if(!stopCurrentlyPressed){
				alien.move();
			}
			missile.move();
		}
	}

	private boolean moveBaseLeft() {
		if(moveLeftCommand() && !isBaseOnLeftEdge()){
			return true;
		}else{
			return false;
		}
	}

	private boolean moveBaseRight() {
		if (moveRightCommand() && !isBaseOnRightEdge()){
			return true;
		}else{
			return false;
		}
	}

	public void playGame() {
		while (gameRunning) {
			moveAllObjects();
			fireMissile();
			graphicsUpdateStartOfLoop();
			drawAllObjects();
			graphicsUpdateEndOfLoop();
		}
	}

	public boolean moveLeftCommand() {
		return leftCursorCurrentlyPressed && !rightCursorCurrentlyPressed;
	}

	public boolean moveRightCommand() {
		return !leftCursorCurrentlyPressed && rightCursorCurrentlyPressed;
	}

	public void graphicsUpdateEndOfLoop() {

		window.dispose();
		strategy.show();

		// pause for a bit. Note: this should run at about
		// 100 fps but on windows this might vary each loop due to
		// a bad implementation of timer
		try {
			Thread.sleep(PAUSE_INTERVAL);
		} catch (Exception e) {
		}

	}

	public void graphicsUpdateStartOfLoop() {

		// Get hold of a graphics context for the accelerated
		// surface and blank it out
		window = (Graphics2D) strategy.getDrawGraphics();
		window.setColor(Color.black);
		window.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
	}

	public void graphicsInitialization() {

		// Create a frame to contain our game
		JFrame container = new JFrame("Space Invaders");

		// Get the content of the frame and set up the resolution of the
		// game
		JPanel panel = (JPanel) container.getContentPane();
		panel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		panel.setLayout(null);

		// Setup our canvas size and put it into the content of the frame
		setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
		panel.add(this);

		// Tell AWT not to bother repainting our canvas since we're
		// going to do that ourself in accelerated mode
		setIgnoreRepaint(true);

		// Make the window visible
		container.pack();
		container.setResizable(false);
		container.setVisible(true);

		// Add a listener to respond to the user closing the window. If they
		// do we'd like to exit the game
		container.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// Request the focus so key events come to us
		requestFocus();

		// Create the buffering strategy which will allow AWT
		// to manage our accelerated graphics
		createBufferStrategy(2);
		strategy = getBufferStrategy();

		// Add a key input system (defined below) to our canvas
		// so we can respond to key pressed
		addKeyListener(new KeyInputHandler());
	}

	/*
	 * A class to handle keyboard input from the user. The class handles both
	 * dynamic input during game play, i.e. left/right and shoot, and more
	 * static type input (i.e. press any key to continue)
	 *
	 */
	private class KeyInputHandler extends KeyAdapter {
		/*
		 * The number of key presses we've had while waiting for an "any key"
		 * press
		 */
		private int pressCount = 1;

		/*
		 * Notification from AWT that a key has been pressed. Note that a key
		 * being pressed is equal to being pushed down but *NOT* released. Thats
		 * where keyTyped() comes in.
		 * 
		 * @param e
		 *            The details of the key that was pressed
		 */
		public void keyPressed(KeyEvent e) {
			if (waitingForKeyPress) {
				return;
			}

			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftCursorCurrentlyPressed = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightCursorCurrentlyPressed = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				fireCurrrentlyPressed = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				stopCurrentlyPressed = true;
			}
		}

		/*
		 * Notification from AWT that a key has been released.
		 * 
		 * @param e
		 *            The details of the key that was released
		 */
		public void keyReleased(KeyEvent e) {
			if (waitingForKeyPress) {
				return;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftCursorCurrentlyPressed = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightCursorCurrentlyPressed = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				fireCurrrentlyPressed = false;
			}
		}

		/*
		 * Notification from AWT that a key has been typed. Note that typing a
		 * key means to both press and then release it.
		 * 
		 * @param e
		 *            The details of the key that was typed.
		 */
		public void keyTyped(KeyEvent e) {
			if (waitingForKeyPress) {
				if (pressCount == 1) {
					waitingForKeyPress = false;
					pressCount = 0;
				} else {
					pressCount++;
				}
			}

		}
	}

}