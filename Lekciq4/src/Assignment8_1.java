import java.util.Scanner;
public class Assignment8_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int n = input.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int total = 0;
		for(int j = 0;j<=n-2;j++){
			sum = a+b;
			a=b;
			b = sum;
			total = total+a;
			
		}
		System.out.println(total);
	}

}
