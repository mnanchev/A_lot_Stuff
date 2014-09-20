import java.util.Scanner;
public class CreditLimitCalculatorTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter account number: ");
		int acc = input.nextInt();
		System.out.println("Please enter account balance: ");
		int bal = input.nextInt();
		System.out.println("Please enter account charges: ");
		int charg = input.nextInt();
		System.out.println("Please enter used credits this month: ");
		int cred = input.nextInt();
		System.out.println("Please enter credit limit for account: "+acc);
		int creditLimit = input.nextInt();
		CreditLimitCalculator credCalc= new CreditLimitCalculator(acc,bal,charg,cred,creditLimit);
	}

}
