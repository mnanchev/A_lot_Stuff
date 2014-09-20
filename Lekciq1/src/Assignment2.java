import java.util.Scanner;
public class Assignment2 {


	public static void main(String[] args) {
		int z;
		Scanner input = new Scanner(System.in);
		System.out.println("This program checks if the entered number is odd or even");
		System.out.println("Please enter a number");
		z = input.nextInt();
		if(z%2==0){
			System.out.println("The number is even");
		}
		else
			System.out.println("The number is odd");
	}

}
