import javax.swing.JOptionPane;
public class Account1 {
	private double balance;
	
	public Account1(double initialBalance) {
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
			JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance\n");
	}
}
