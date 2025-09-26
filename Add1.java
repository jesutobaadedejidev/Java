import java.util.Scanner;
	public class Add1{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			int sum = num + 1;
			System.out.print(sum);
		}
	}