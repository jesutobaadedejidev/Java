import java.util.Scanner;
public class Swap{
		        public static void main(String []args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter any integer: ");
			int a = input.nextInt();
			
  
			System.out.print("Enter the second integer ");
			int b = input.nextInt();
			
    			
		        a = b + a;
			b = a -b;
			a = a- b;

		        System.out.printf ("a is %d%n and b = %d", a,b);
		}
	}