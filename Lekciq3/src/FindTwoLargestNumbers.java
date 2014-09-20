import java.util.Scanner;
public class FindTwoLargestNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int number = 0;
		int largest = 0;
		int second_largest = 0;
		while(counter <= 10){
			System.out.printf("%d:Please enter an integer: ",counter);
			number = input.nextInt();
			if(number >= largest && second_largest<=largest){
				second_largest = largest;
				largest = number;
			}
			counter++;
		}		
		System.out.println("The largest number is: "+largest);
		System.out.println("The second largest number is: "+second_largest);
	}

}
