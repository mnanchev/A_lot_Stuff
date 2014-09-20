import java.util.Scanner;
public class Product {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the lower limit: ");
		int n = input.nextInt();
		System.out.print("Please enter the upper limit: ");
		int m = input.nextInt();
		int num = n;
		long product = 1;
		do{
			product *= num;
			num++;
		}while(num<=m);
		System.out.println("product [n...m] = "+ product);

	}

}
