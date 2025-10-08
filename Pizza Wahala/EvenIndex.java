import java.util.Scanner;
	public class EvenIndex{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			float [] scores = new float [10];
			float sum = 0;
			for(int i=0; i < 10; i++){
				System.out.print("Enter a new number: ");
				scores [i] = input.nextInt();
				if (i % 2 == 1){
				sum += scores[i];
				}
			}
			System.out.print(sum);
		}
	}