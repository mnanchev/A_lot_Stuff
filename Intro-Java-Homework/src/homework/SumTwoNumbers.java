package homework;
import java.util.Scanner;
public class SumTwoNumbers {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int first = input.nextInt();
		System.out.print("Please enter the second number: ");
		int second = input.nextInt();
		int sum = first+second;
		System.out.println("The sum of "+first+" + "+second+" is: "+sum);
	}
}
