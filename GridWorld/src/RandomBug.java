import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class RandomBug extends Bug
{
    private int maxLength;
    private int steps = 0;
    private int length = (int)((maxLength - 1) * Math.random() + 1);

    /**
     * Constructs a bug that moves a random number of spaces in a random direction
     * @param length the side length
     */
    public RandomBug(int length)
    {
        maxLength = length;
        setDirection((int)(360 * Math.random()));
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < length && canMove())
        {
        	move();
        	steps++; 
        }
        else
        {
        	setDirection((int)(360 * Math.random()));
        	length = (int)((maxLength - 1) * Math.random() + 1);
        	steps = 0;
        }
    }
}