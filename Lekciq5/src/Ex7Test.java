import java.util.Scanner;
public class Ex7Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Ex7 x = new Ex7();
		System.out.print("Please enter a radius: ");
		while(input.hasNext()){
			double r = input.nextDouble();
			System.out.println("The area of the circle is: "+x.circleArea(r));
			System.out.print("Please enter a radius: ");
		}

	}

}
