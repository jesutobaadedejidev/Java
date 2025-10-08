import java.util.Scanner;
	public class AverageValid{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			float [] scores = new float [10];
			float sum = 0;
			float average = 0;
			for(int i=0; i < 10; i++){
				System.out.print("Enter a new number: ");
				int score = input.nextInt();
				if (score >= 0 && score <= 100){
				sum += score;
				average = sum/i;
				}
			}
			System.out.print(average);
		}
	}