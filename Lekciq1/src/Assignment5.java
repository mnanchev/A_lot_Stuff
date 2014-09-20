import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program checks if the third digit of a give number from left to right is seven.");
		System.out.println("Please enter a five digit number: ");
		int z = input.nextInt();
		z = z / 100;
		z = z % 10;
		if (z == 7){
			System.out.println("The third digit is seven");
		}
		else
			System.out.println("The third digit is not seven");
 		

	}

}
