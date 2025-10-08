import java.util.Scanner;
	public class OnlyValid{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			float [] scores = new float [10];
			float sum = 0;
			for(int i=0; i < 10; i++){
				System.out.print("Enter a new number: ");
				int score = input.nextInt();
				if (score >= 0 && score <= 100){
				sum += score;
				}
			}
			System.out.print(sum);
		}
	}