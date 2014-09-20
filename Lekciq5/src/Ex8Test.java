import java.util.Scanner;
public class Ex8Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Ex8 e = new Ex8();
		System.out.println("Please enter three numbers: ");
		System.out.print("Please enter a: ");
		while(input.hasNext()){
			float a = input.nextFloat();
			System.out.print("Please enter b: ");
			float b = input.nextFloat();
			System.out.print("Please enter c: ");
			float c = input.nextFloat();
			
			System.out.println("The smallest number is: "+e.minimum3(a, b, c));
			System.out.print("Please enter a: ");
		}

	}

}
