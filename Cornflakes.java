/* peudocode
- ask user to enter a number
- store the number in a variable
- continously multiply the store number by 1 up to 12 
- display the result of each of the multiplication
*/

import java.util.Scanner;

public class Cornflakes {
public static void main(String[] arge) { 
	
	System.out.print("Enter a number 1-12:");
	Scanner input = new Scanner(System.in);	
	
	int number = input.nextInt();

	int multiNumber = 0;
	int result = 0;
	int counter = 0;
	while (counter < 12){
	multiNumber +=1;
	result = number * multiNumber;
	counter ++;
	System.out.printf("%d %d = %d %n", number, multiNumber, result);
	}

	  }
	     }
	
	
