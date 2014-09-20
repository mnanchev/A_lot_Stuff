import java.util.Scanner;
public class FindTheLarges {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int number = 0;
		int largest = 0;
		while(counter <= 10){
			System.out.printf("%d:Please enter an integer: ",counter);
			number = input.nextInt();
			if(number >= largest){
				largest = number;
			}
			counter++;
		}
		System.out.println("The largest number is: "+largest);

	}

}
