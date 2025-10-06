import java until.scanner
public class NewCohort{
	public static void main (string [] args){
		scanner input = new scanner (system.in)
		int firstNumber = 46
		int secondNumber = 72
		int thirdNumber = 82

		if firstNumber> secondNumber & firstNumber > thirdNumber{
			system out print ("the highest number is" %s%n firstNumber)
		}
		
		if secondNumber> firstNumber & secondNumber > thirdNumber{
			system out print ("the highest number is" %s%n secondNumber)
		}

		if thirdNumber> secondNumber & thirdNumber > firstNumber{
			system out print ("the highest number is" %s%n thirdNumber)
		}
	}
}