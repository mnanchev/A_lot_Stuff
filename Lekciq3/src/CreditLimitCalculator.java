
public class CreditLimitCalculator {
	private int accountNumber;
	private int beginningBalance;
	private int totalItemsCharged;
	private int totalAllCredits;
	private int creditLimit;
	public CreditLimitCalculator(int accountNumber,int beginningBalance,int totalItemsCharged,int totalAllCredits, int creditLimit) {
		this.accountNumber = accountNumber;
		this.beginningBalance = beginningBalance;
		this.totalItemsCharged = totalItemsCharged;
		this.totalAllCredits = totalAllCredits;
		this.creditLimit = creditLimit;
		calculateNewBalance();
		System.out.println("New Balance: "+calculateNewBalance());
		if(calculateNewBalance() > getCreditLimit() ){
			System.out.println("Credit limit exceeded");
		}
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBeginningBalance() {
		return beginningBalance;
	}
	public void setBeginningBalance(int beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public int gettotalItemsCharged() {
		return totalItemsCharged;
	}
	public void settotalItemsCharged(int totalItemsCharged) {
		this.totalItemsCharged = totalItemsCharged;
	}
	public int getTotalAllCredits() {
		return totalAllCredits;
	}
	public void setTotalAllCredits(int totalAllCredits) {
		this.totalAllCredits = totalAllCredits;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int calculateNewBalance(){
		int newBalance = getBeginningBalance()+gettotalItemsCharged()-getTotalAllCredits();
		return newBalance;
	}

}
