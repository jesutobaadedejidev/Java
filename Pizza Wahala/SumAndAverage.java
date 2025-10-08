import java.util.Scanner;
	public class SumAndAverage{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			float [] scores = new float [10];
			float sum = 0;
			float average = 0;
			for(int i=0; i < 10; i++){
				System.out.print("Enter a new number: ");
				scores [i] = input.nextInt();
				sum += scores[i];
				average = sum/10;
			}
			System.out.print("Sum is: "+ sum + "and Average is: "+  average);
		}
	}