import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		double dollars = 100;
		double p;
		System.out.println("Please enter an interest rate [0...25] : ");
		p = input.nextDouble()/100;
		
		
	do{
		if(p>0.25||p<=0){
			System.out.println("Error.Please enter a legal interest rate");
			break;
		}
		else{
		dollars *= (1+p);
		counter++;}
	}while(1100>dollars);
	
	
		System.out.println("Money: "+dollars);
		System.out.println("Months: "+counter);
	}
	
}
