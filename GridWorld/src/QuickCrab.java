import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter{
	
	public ArrayList<Location> getMoveLocations(){
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid g = getGrid();
		Location loc = getLocation();
		Location loc2 = getLocation();
		Location temp = loc.getAdjacentLocation(getDirection() + 90);
		Location temp2 = loc2.getAdjacentLocation(getDirection() + 270);
		
		if(g.isValid(temp) && g.get(temp) == null){
			loc = temp.getAdjacentLocation(getDirection() + 90);
			if(g.isValid(loc) && g.get(loc) == null){
				locs.add(loc);
			}
		}
		
		if(g.isValid(temp2) && g.get(temp2) == null){
			loc2 = temp2.getAdjacentLocation(getDirection() + 270);
			if(g.isValid(loc2) && g.get(loc2) == null){
				locs.add(loc2);
			}
		}
		
		if(locs.size() == 0){
			return super.getMoveLocations();
		}else{
			return locs;
		}
	}

}
