import java.util.Scanner;
public class NewCohort{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("What is your name?");
		String name1 = input.nextLine();
		System.out.print("What is your name?");
		String name2 = input.nextLine();
		System.out.print("What is your name?");
		String name3 = input.nextLine();
		System.out.print("What is your score?");
		int Score1 = input.nextInt();
		System.out.print("What is your score?");
		int Score2 = input.nextInt();
		System.out.print("What is your score?");
		int Score3 = input.nextInt();

		if (Score1> Score2 && Score1 > Score3){
			System.out.printf ("the highest number is %s%n" ,Score1);
		}
		
		if (Score2> Score1 && Score2 > Score3){
			System.out.printf ("the highest number is %s%n" ,Score2);
		}

		if (Score3> Score1 && Score3 > Score2){
			System.out.printf ("the highest number is %s%n" ,Score3);
		}
	}
}