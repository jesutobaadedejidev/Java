import java.util.Scanner;
	public class SumTen{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			int [] scores = new int [10];
			int sum = 0;
			for(int i=0; i < 10; i++){
				System.out.print("Enter a new number: ");
				scores [i] = input.nextInt();
				sum += scores[i];
			}
			System.out.print(sum);
		}
	}