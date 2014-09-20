import java.util.Scanner;
public class Assignment4 {

	
	public static void main(String[] args) {
		System.out.println("This program calculates the rectangle's area by given width and height");
		double y,x,z;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the rectangle's witdh: ");
		x = input.nextDouble();
		System.out.println("Please enter the rectangle's height: ");
		y = input.nextDouble();
		z = x*y;
		System.out.println("The area of the rectangle is:" + z);

	}

}
