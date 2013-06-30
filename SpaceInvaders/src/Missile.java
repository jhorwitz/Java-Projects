import java.awt.Graphics;

/*
 * Represents a single missile fired by the player's base
 * 
 * Most commonly used methods
 *    draw
 *    move
 *    getX  getY
 * 
 */
class Missile {
	
	private final String BULLET_ICON = "missile.gif";
	private final int deltaY = 8;

	// current position of the missile
	private int x;
	private int y;
	
	// object representing the missile image
	private final Sprite SPRITE;	

	// constructor
	public Missile( int initialX, int initialY) {
		x = initialX;
		y = initialY;
		SPRITE = SpriteStore.get().getSprite(BULLET_ICON);
	}
	
	public void draw(Graphics g) {
		SPRITE.draw(g, x, y);
	}
	
	public int getHeight() {
		return SPRITE.getHeight();
	}

	public int getWidth() {
		return SPRITE.getWidth();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void move() { 
		y -= deltaY;
	}

}