public class Kata{
	public static boolean isOdd(int num){
			if (num % 2 != 0){
			return true;	
		}
		return false;
	}

	public static Boolean isLeapYear(int year){
		if (year % 4 == 0){
			if(year % 100 != 0){
			return true;
			}
		}
		if(year % 4 == 0 && year % 100 == 0 ){
			if( year % 400 == 0 ){
			return true;
			}
		}
		return false;
	}

	public static Boolean isEven(int num){
		if (num % 2 == 0){
		return true;
		}
		return false;	
	}

	public static Boolean isPrime(int num){
		if (num <= 1){
		return false;
		}
		for(int i = 2; i * i <= num; i++){
			if (num % i == 0){
			return false;
			}
		}
		return true;
	}
	
	public static int isDifference(int num1, int num2){
		int result = Math.abs(num1 - num2);
		return result;
	}

}