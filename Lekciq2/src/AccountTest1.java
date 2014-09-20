import javax.swing.JOptionPane;
public class AccountTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account1 user1 = new Account1(5000.0);
		JOptionPane.showMessageDialog(null , "Welcome\nto\nDSK Bank!");
		String name = JOptionPane.showInputDialog("Please enter "+ " d for debit"+" or" +" c"+" for credit");
		if (name.equals("c")){
			String amount = JOptionPane.showInputDialog("Please enter the amount of the credit: ");
			double value = Double.parseDouble(amount);
			user1.credit(value);
			JOptionPane.showMessageDialog(null , "\nadding : "+value+ " to account1 balance\n\n");
			JOptionPane.showMessageDialog(null , "account balance: "+user1.getBalance());
			String amount1 = JOptionPane.showInputDialog("Please enter new amount of the credit: ");
			double value1 = Double.parseDouble(amount1);
			user1.credit(value1);
			JOptionPane.showMessageDialog(null , "\nadding : "+value1+ " to account1 balance\n\n");
			JOptionPane.showMessageDialog(null , "account balance: "+user1.getBalance());
		}
		else if (name.equals("d")){
			String amount2 = JOptionPane.showInputDialog("Please enter the amount of the debit: ");
			double value2 = Double.parseDouble(amount2);
			user1.debit(value2);
			JOptionPane.showMessageDialog(null , "\nborrowing : "+value2+ " from  your account balance\n\n");
			JOptionPane.showMessageDialog(null , "account balance: "+user1.getBalance());
			String amount3 = JOptionPane.showInputDialog("Please enter new amount of the debit: ");
			double value3 = Double.parseDouble(amount3);
			user1.debit(value3);
			JOptionPane.showMessageDialog(null , "\nborrowing : "+value3+ " from your account balance\n\n");
			JOptionPane.showMessageDialog(null , "account balance: "+user1.getBalance());
		}
		else
			JOptionPane.showMessageDialog(null , "Please\nenter a \ncorrect service!");
		
	}

}
