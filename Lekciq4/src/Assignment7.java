import java.util.Scanner;
public class Assignment7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 1;
		long prod = 1;
		System.out.println("Please enter a positive integer: ");
		int n = input.nextInt();
		System.out.println("Please enter an integer: ");
		int num = input.nextInt();
		for(int i = 1; i<n ; i++){
			prod *= i;
			sum = sum + prod/Math.pow(num, i);
		}
		
		System.out.println(sum);
	}

}
