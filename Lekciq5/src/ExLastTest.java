import java.util.Scanner;
public class ExLastTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExLast l = new ExLast();
		System.out.println("Please enter the coordinates of the two points");
		System.out.print("X coordinate of the first point: ");
		while(input.hasNext()){
			double x1 = input.nextDouble();
			System.out.print("Y coordinate of the first point: ");
			double y1 = input.nextDouble();
			System.out.print("X coordinate of the second point: ");
			double x2 = input.nextDouble();
			System.out.print("Y coordinate of the second point: "); 
			double y2 = input.nextDouble();
			System.out.println("The distance between the two points is: "+l.calculateDistance(x1, y1, x2, y2));
			
			System.out.print("\nX coordinate of the first point: ");
		}

	}

}
