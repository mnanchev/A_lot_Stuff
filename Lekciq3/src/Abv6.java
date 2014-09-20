import java.util.Scanner;
public class Abv6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int a = 0;
		int b = 0;
		while(counter<=2){
			if (a == 0){
				System.out.print("Please enter a number:");
				a = input.nextInt();
				if (a!=0){
					System.out.print("Please enter a number:");
					b  = input.nextInt();
					
				}
			}
			counter++;
		}
		if(a>=b){
			System.out.println("The larger number is: "+a+" while the smaller number is: "+b);
		}
		else
			System.out.println("The larger number is: "+b+" while the smaller number is: "+a);
		counter++;
	}

}
