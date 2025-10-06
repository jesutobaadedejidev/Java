import java.util.Scanner;
public class Acceleration{
	public static void main(String []args){
		Scanner input= new Scanner (System.in);
		System.out.print("Enter the starting velocity: ");
		int v = input.nextInt();
		System.out.print("Enter the ending velocity: ");
		int v1 = input.nextInt();
		System.out.print("Enter the time: ");
		int t = input.nextInt();
		int a = (v1-v)/t;
		System.out.printf("The average acceleration is %d%n", a);
	}
}