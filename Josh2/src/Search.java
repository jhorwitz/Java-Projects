
public class Search {

	public static int linear(int[] array, int num_to_find){ 
		//to call, use Search.linear(blahblahblah)

		int index = 0;
		
		while((array[index] != num_to_find) && (index < array.length - 1)){
			index++;
		}
		
		if(array[index] == num_to_find){
			return index;
		}else{
			return -1;
		}
		
	}
	
	public static int linear(String[] array, String str_to_find){
		
		int index = 0;
		
		while(!(array[index].equals(str_to_find)) && (index < array.length - 1)){
			index++;
		}
		
		if(array[index].equals(str_to_find)){
			return index;
		}else{
			return -1;
		}
	}

}