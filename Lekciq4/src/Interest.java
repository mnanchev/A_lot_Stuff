
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount ;
		double rate = 0.05;
		double principal = 1000;
		System.out.printf("%s%20s\n","Year","Amount on deposit");
		for (int i = 1 ; i<=10; i++){
			amount = principal*Math.pow(1+rate,i);
			System.out.printf("%4d%,20.2f\n",i,amount);
					
		}
	}

}
