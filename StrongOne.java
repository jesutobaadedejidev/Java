import java.util.Scanner;
public class StrongOne{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

int v3 = number / 100;
int v4 = (number % 100)/10;
int v5 = number % 10;

int total3 = 1;
for(int count = v3; count > 0; count--){ 
 total3 = total3 * count;
}
int total1 = 1;
for(int count1 = v4; count1 > 0; count1--){ 
 total1 = total1 * count1;
}
int total2 = 1;
for(int count2 = v5; count2 > 0; count2--){ 
 total2 = total2 * count2;
}
int sumTotal = total3 + total1 + total2;

System.out.print(sumTotal);
/*if (sumTotal == number){
System.out.print("The number is a Strong Number:");
} else {
System.out.print("The number is not a Strong Number:");
}*/
}

}