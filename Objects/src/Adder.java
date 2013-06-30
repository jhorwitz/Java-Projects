import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AdderPlayer player = new AdderPlayer();
		AdderProblem problem = new AdderProblem();
		int answer;
		
		do{
		System.out.println(problem.getProblem());
		answer = in.nextInt();
		
		if(problem.checkAnswer(answer)){
			player.addPoints(5);
		}else if(answer == 999){
			System.out.println("Your score is: " + player.getPoints());
		}else{
			System.out.println("Wrong answer. Enter another answer: ");
			answer = in.nextInt();
			if(problem.checkAnswer(answer)){
				player.addPoints(3);
			}else if(answer == 999){
				System.out.println("Your score is: " + player.getPoints());
			}else{
				System.out.println("Wrong answer. Enter another answer: ");
				answer = in.nextInt();
				if(problem.checkAnswer(answer)){
					player.addPoints(1);
				}else if(answer == 999){
					System.out.println("Your score is: " + player.getPoints());
				}else{
					System.out.println("Wrong answer.");
				}
			}
		}
		
		problem.newProblem();
		
		}while(answer != 999);
		
	}

}
