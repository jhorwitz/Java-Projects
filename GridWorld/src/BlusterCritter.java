import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.awt.Color;

public class BlusterCritter extends Critter{
	private static final double DARKENING_FACTOR = 0.05;// darkening factor of 5%
	private static final double LIGHTENING_FACTOR = 1.05;// lightening factor of 5%
	private int c;
	
    public BlusterCritter() {
    	c = 2;
    }

    public BlusterCritter(int c){
    	this.c = c;
    }

   public ArrayList<Actor> getActors(){
	   ArrayList<Actor> actors = new ArrayList<Actor>();
	   Location loc = getLocation();
	   for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++){//overrides the Abstract Grid code, goes through the row thats 2 above and below the critter
   			for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++){// goes through each column(in each row) that is near the critter
   				Location space = new Location(r,c);
   				if(getGrid().isValid(space)){
   					Actor a = getGrid().get(space);
   					if(a != null){
   						actors.add(a);
   					}
   				}
   			}
   		}
   		return actors;
   }
   
   public void processActors(ArrayList<Actor> actors){
	   int n = actors.size();
	   if (n == 0){
		   return;
	   }else if(n < c){
		   Color c = getColor();
		   int red = (int) (c.getRed() * (LIGHTENING_FACTOR));
		   int green = (int) (c.getGreen() * (LIGHTENING_FACTOR));
		   int blue = (int) (c.getBlue() * (LIGHTENING_FACTOR));
		   if(blue > 225){
			   blue = 225;
		   }if(green > 225){
			   green = 225;
		   }if(red > 225){
			   red = 225;
		   }setColor(new Color(red, green, blue));
	   }else if(n >= c){
		   Color c = getColor();
		   int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
		   int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
		   int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
		   setColor(new Color(red, green, blue));
	   }
   }

}