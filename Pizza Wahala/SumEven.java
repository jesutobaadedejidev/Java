import java.util.Scanner;
	public class SumEven{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			float [] scores = new float [10];
			float sum = 0;
			for(int i=0; i < 10; i++){
				System.out.print("Enter a new number: ");
				scores [i] = input.nextInt();
				if (scores[i] % 2 == 0){
				sum += scores[i];
				}
			}
			System.out.print(sum);
		}
	}