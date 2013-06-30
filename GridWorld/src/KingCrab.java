import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class KingCrab extends CrabCritter{
	
	private boolean moveAway(Actor actor){
		ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(actor.getLocation());
		for(Location loc:locs){
			int x1 = loc.getRow();//gets rows and columns for each location
			int y1 = loc.getCol();
			int x2 = getLocation().getRow();
			int y2 = getLocation().getCol();
			int distance = (int)Math.floor(Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1)) + .5);//uses pythagrean theorem to get find distance. adds .5 so it can round down every time and still round correctly
			if(distance > 1){
				actor.moveTo(loc);
				return true;
			}
		}
			return false;
	}
	
	public void processActors(ArrayList<Actor> actors){
		for(Actor actor:actors){
			if(!moveAway(actor)){
				actor.removeSelfFromGrid();
			}
		}
	}

}
