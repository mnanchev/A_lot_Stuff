import java.util.Scanner;
public class Abv_while9 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double run = 10;
		System.out.println("Please enter running rate: ");
		int p = input.nextInt();
		double rate = (double) p/100;
		int counter = 0;
		while (run<=200){
			if(rate>0.5||rate<=0){
				System.out.println("Error.Please enter a legal interest rate");
				break;
			}
			run = run*(1+rate);
			counter++;
		}
		System.out.println("Distance: "+run);
		System.out.println("Days: "+counter);
	}

}
