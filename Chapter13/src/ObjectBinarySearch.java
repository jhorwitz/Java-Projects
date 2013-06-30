
public class ObjectBinarySearch {

	public static int search(Object[] array, String search, int location){
		System.out.println("Examining " + location);
		if(search.compareTo(array[location].toString()) == 0){
			return location;
		}else if(search.compareTo(array[location].toString()) > 0){
			return search(array, search, location + location/2);
		}else{
			return search(array, search, location/2);
		}
	}
	
}
