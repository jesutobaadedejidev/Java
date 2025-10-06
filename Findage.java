import java.util.Scanner;
 
   public class Findage{
        public static void main(String[] args){
 	Scanner input = new Scanner(System.in);
   	
	System.out.print("enter the first name:");
	String name1 = input.nextLine();
	System.out.print("enter the age: ");
	int age1 = input.nextInt();
	
	System.out.print("enter the second name:");
	String name2 = input.next();
	System.out.print("enter the age: ");
	int age2 = input.nextInt();
	
        System.out.print("enter the third name:");
	String name3 = input.next();
	System.out.print("enter the age: ");
	int age3 = input.nextInt();
        
        if age1 <= age2 && age1 <= age3) {
            youngestName = name1;
        } if (age2 <= age1 && age2 <= age3) {
            youngestName = name2;
        }  {
            youngestName = name3;
        }

       
        if (age1 >= age2 && age1 >= age3) {
            oldestName = name1;
        }  if (age2 >= age1 && age2 >= age3) {
            oldestName = name2;
        }  {
            oldestName = name3;
        }

        System.out.println("The youngest person is: " + youngestName);
        System.out.println("The oldest person is: " + oldestName);
	

          }

              }  
   