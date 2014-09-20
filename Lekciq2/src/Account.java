
public class Account {
	private double balance;
	
	public Account(double initialBalance) {
		if(initialBalance > 0.0)
		balance = initialBalance;		
	}

	public void credit(double amount){
		balance += amount;
	}
	
	public double getBalance(){
		return balance;
	}
	public void debit(double amount){
		if(amount<=balance){
			balance-=amount;
		}
		else
			System.out.println("Debit amount exceeded account balance\n");
	}
}
