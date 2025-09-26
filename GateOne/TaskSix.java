public class TaskFive{
	public static void main(String []args){
		for(int num = 1; num <= 10; num++){
			if (num % 4 == 0){
				for(int i = 1; i <= 5; i++){
					int multiple = Math.pow(num,i);
					System.out.println(multiple);
				}
			}
		}
	}
}