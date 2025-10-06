import java.util.Scanner;
	public class SquareNum{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num = input.nextInt();
			for(int num1 = num ; num <= num1; num= num1+num);{
			System.out.print(num);
			}
		}
	}