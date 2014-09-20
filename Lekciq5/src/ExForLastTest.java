import java.util.Scanner;
public class ExForLastTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExForLast x = new ExForLast();
		System.out.print("Please enter student points: ");
		while(input.hasNext()){
			int points = input.nextInt();
			System.out.println("Student grade: "+x.qualityPoints(points));
			System.out.print("\nPlease enter student points: ");
		}

	}

}
