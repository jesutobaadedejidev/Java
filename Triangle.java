import java.util.Scanner;
	public class Triangle{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the first side: ");
			int a = input.nextInt();
			System.out.print("Enter the second side: ");
			int b = input.nextInt();
			System.out.print("Enter the third side: ");
			int c = input.nextInt();
			if (a == b && a == c){
			System.out.print("Equilateral");
			}
			else if(a == b || a == c || b == c){
			System.out.print("Isosceles");
			}
			else{
			System.out.print("Scalene");
			}
		}
	}