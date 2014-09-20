import java.util.Scanner;
public class Abv_while5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Моля въведете число: ");
		long n = input.nextInt();
		long sum = 1;
		while(n!=1){
			sum =sum*n;
			n = n-2;
		}
		System.out.println("Двойният факториел е: "+sum);

	}

}