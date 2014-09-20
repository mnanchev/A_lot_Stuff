import java.util.Scanner;
public class Assignment8 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This programm calculates the sum,product,difference and quotient of a given integers");
		System.out.println("Please enter the first integer z : ");
		int z = input.nextInt();
		System.out.println("Please enter the second integer c : ");
		int c = input.nextInt();
		System.out.println("The Sum of z and c is: " + (z+c));
		System.out.println("The Product of z and c is: " + (z*c));
		System.out.println("The Difference of z and c is: " + (z-c));
		System.out.println("The Quotient of z and c is: " + (z/c));
		
	}

}
