import java.util.Scanner;
	public class Appp{
		public static void main(String[] args){
			Scanner input = new Scanner (System.in);
			System.out.print("Enter your name: ");
			String name = input.next();
			System.out.printf("Hello %s, Welcome to your personal assistant. %n", name );
			System.out.print("Enter your age: ");
			int age = input.nextInt();
			if(age < 13){
			System.out.println("You are a young explorer!");
			}
			if(age >= 13 && age <= 19){
			System.out.println("Teen life is fun, enjoy it!");
			}
			else if(age >= 20 && age <= 59){
			System.out.println("Adulting can be challenging, stay strong");
			}
			else{
			System.out.println("Wisdom looks good on you");
			}
			System.out.print("Are you happy, sad, excited or tired?: ");
			String mood = input.next();
			if (mood.equals("happy")){
			System.out.println("Keep smiling!");
			}
			else if(mood.equals("sad")){
			System.out.println("Cheer up! Tomorrow is a new day");
			}
			else if(mood.equals("excited")){
			System.out.println("Awesome! Enjoy your energy!");
			}
			else if(mood.equals("tired")){
			System.out.println("Rest well and recharge!");
			}
			else{
			System.out.println("Invalid");
			}
			int guess = 7;
			System.out.print("Guess a number: ");
			int number = input.nextInt();
			if (number == guess){
			System.out.println("Wow! You guessed it!");
			}
			else{
			System.out.println("Try again next time");
			}
			System.out.print("Enter your want , either happy, sad, excited or tired: ");
			String want = input.next();
			if(want.equals("happy")){
			System.out.println("Go out and play a sport you like");
			}
			else if(want.equals("sad")){
			System.out.println("Take a short walk outside and get some fresh air");
			}
			else if(want.equals("excited")){
			System.out.print("Share your excitement by helping someone");
			}
			else if(want.equals("tired")){
			System.out.print("Have a short nap or rest to recharge");
			}
			else{
			System.out.print("Invalid");
			}
		}
	}