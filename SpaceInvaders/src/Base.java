import java.awt.Graphics;

/*
 * Player's base that they can move and use to shoot missiles.
 */
class Base {

	// Image used for base on screen
	private final String BASE_ICON = "base.gif";
	
	// amount for base to move (in pixels)
	private final int deltaX = 7;

	// current position on screen
	private int x;
	private final int y;

	// object representing base image
	private Sprite sprite;

	// constructor
	public Base(int initialX, int initialY) {
		x = initialX;
		y = initialY;
		sprite = SpriteStore.get().getSprite(BASE_ICON);
	}
	
	public void draw(Graphics window) {
		sprite.draw(window, x, y);
	}

	public int getHeight() {
		return sprite.getHeight();
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return sprite.getWidth();
	}

	public void moveLeft() {
		x = x - deltaX;
	}

	public void moveRight() {
		x = x + deltaX;
	}

}