import java.util.Scanner;
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This program calculates the product of three integers");
		Scanner input = new Scanner(System.in);
		int x,y,z,result;
		System.out.println("Please enter the first integer: ");
		x = input.nextInt();
		System.out.println("Please enter the second integer: ");
		y = input.nextInt();
		System.out.println("Please enter the third integer: ");
		z = input.nextInt();
		result = x*y*z;
		
		System.out.println("Product is: " + result);
		
	}

}
