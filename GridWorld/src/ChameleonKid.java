import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonDarkCritter{

	/*
	 * gets the locations in front of and behind the ChameleonKid
	 * PRE: directions is an array of the directions forwards and backwards
	 * POST: returns an ArrayList of the valid locations on the grid in front of and behind ChameleonKid
	 */
    public ArrayList<Location> getValidAdjacentLocations(int[] directions){
    	ArrayList<Location> locs = new ArrayList<Location>(); //taken from the Abstract Grid class down to next comment
        for (int i : directions){
            Location neighborLoc = getLocation().getAdjacentLocation(getDirection() + i);
            if(getGrid().isValid(neighborLoc))
                locs.add(neighborLoc);
        }
        return locs; //taken from Abstract Grid class
    }
    
    /*
     * gets the actors in front of and behind the ChameleonKid
     * PRE: none
     * POST: returns a list of the actors in those locations
     */
    public ArrayList<Actor> getActors(){
    	ArrayList<Actor> actors = new ArrayList<Actor>();
    	int[] directions = {0, 180};
    	for(Location location : getValidAdjacentLocations(directions)){
          Actor square = getGrid().get(location);
          if (square != null){
            actors.add(square);
          }
    	}
        return actors;
    }
    
	
}
