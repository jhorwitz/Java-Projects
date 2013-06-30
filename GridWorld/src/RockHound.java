import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import java.util.ArrayList;

public class RockHound extends Critter {

	/*
	 * modifies the processActors method of Critter to include rocks
	 * PRE: actors is and ArrayList of Actor objects
	 * POST: none
	 */
    public void processActors(ArrayList<Actor> actors){ //process actors method was taken from the Critter class and modified to include rocks
        for (Actor a : actors){
            if (!(a instanceof Critter))
                a.removeSelfFromGrid();
        }
    }
	
}
