// Compound-interest calculations with for.


public class Assignment4 {
	public static void main(String[] args) {
		
		double amount; // amount on deposit at end of each year
		double principal = 1000.0; // initial amount before interest
		double rate = 0.05; // interest rate
		
		// display headers
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		// calculate amount on deposit for each of ten years
		for(rate = 0.05; rate<0.1; rate = rate + 0.01){
		for (int year = 1; year<= 10; year++) {
			// calculate new amount for specified year
			amount = principal * Math.pow(1.0 + rate, year);
			// display the year and the amount
			System.out.printf("%4d%,20.2f\n", year, amount);
		}
		System.out.println();
		}
	}
}