
import java.util.Scanner;

public class TimeConverter {

	/*
	 * Converts hours to minutes
	 * PRE: hour >= 0
	 * POST: NONE
	 */
	public static void hourToMin(int hour){
		int min = hour * 60;
		System.out.println(hour + " hours is " + min + " minutes.");
	}
	
	/*
	 * Converts days to hours
	 * PRE: day >= 0
	 * POST: NONE
	 */
	public static void dayToHour(int day){
		int hour = day * 24;
		System.out.println(day + " days is " + hour + " hours.");
	}
	
	/*
	 * Converts minutes to hours
	 * PRE: min >= 0
	 * POST: NONE
	 */
	public static void minToHour(int min){
		double hour = (min / 60.0);
		System.out.println(min + " minutes is " + hour + " hours.");
	}
	
	/*
	 * Converts hours to days
	 * PRE: hour >= 0
	 * POST: NONE
	 */
	public static void hourToDay(int hour){
		double day = (hour / 24);
		System.out.println(hour + " hours is " + day + " days.");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice, min, hour, day;
		System.out.println("Chose a number: \n1) Convert minutes to hours. \n2) Convert hours to minutes. \n3) Convert hours to days. \n4) Convert days to hours.");
		choice = in.nextInt();
		
		if(choice == 1){
			System.out.println("Enter the number of minutes: ");
			min = in.nextInt();
			minToHour(min);
		}else if(choice == 2){
			System.out.println("Enter the number of hours: ");
			hour = in.nextInt();
			hourToMin(hour);
		}else if(choice == 3){
			System.out.println("Enter the number of hours: ");
			hour = in.nextInt();
			hourToDay(hour);
		}else{
			System.out.println("Enter the number of days: ");
			day = in.nextInt();
			dayToHour(day);
		}

	}

}
