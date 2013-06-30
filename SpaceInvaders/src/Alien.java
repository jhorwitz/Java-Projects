import java.awt.Graphics;

/**
 * A single alien in the Space Invaders game.
 */
class Alien {

	// Image used for base on screen
	private final String ALIEN_ICON = "alien.gif";
	
	// object representing base image
	private final Sprite SPRITE;
		
	// amount for alien to move (in pixels)
	private final int deltaY = 40;
	private final int deltaX = 7;
	private final int SCREEN_WIDTH;
	private final int SCREEN_HEIGHT;
	final String EXPLOSION_WAV = "bomb.wav";
	final String BEEP_WAV = "beep.wav";
	final Sound EXPLOSION = SoundStore.get().getSound(EXPLOSION_WAV);
	final Sound BEEP = SoundStore.get().getSound(BEEP_WAV);

	// current position on screen
	private int x;
	private int y;

	/*
	 * Create a new alien object
	 */
	public Alien(int initialX, int initialY, int screenWidth, int screenHeight) {
		x = initialX;
		y = initialY;
		SCREEN_WIDTH = screenWidth;
		SCREEN_HEIGHT = screenHeight;
		SPRITE = SpriteStore.get().getSprite(ALIEN_ICON);
	}
	
	public boolean isHit(Missile missile){
		if(missile.getX() >= getX() && missile.getX() <= getX() + getWidth()
				&& missile.getY() >= getY() && missile.getY() <= getY() + getHeight()){
			EXPLOSION.playSound( );
			return true;
		}else{
			return false;
		}
	}

	public boolean wins(){
		if(getY() >= SCREEN_HEIGHT - 40){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * return true if value is an odd number, otherwise return false
	 */
	public static boolean isOdd(int c){
		if(c % 2 == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getHeight() {
		return SPRITE.getHeight();
	}

	public int getWidth() {
		return SPRITE.getWidth();
	}
	
	
	public void draw(Graphics window) {
		SPRITE.draw(window, x, y);
	}

	public void move() {
		if(getX() <= 0){
			BEEP.playSound();
			y += deltaY;
			x += 1;
		}else if(getX() >= SCREEN_WIDTH - getWidth()){
			BEEP.playSound();
			y += deltaY;
			x -= 1;
		}else if(isOdd((getY() / deltaY) + 1)){
			moveRight();
		}else{
			moveLeft();
		}
	}
	
	public void moveLeft(){
		x -= deltaX;
	}
	
	public void moveRight(){
		x += deltaX;
	}
	
}