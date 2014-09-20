import java.util.Scanner;
public class SalesCommissionCalculator {
	private double sales;
	private double prof;
	private int counter;
	private double total;
	private static final double salary = 200;
	private static final double commission = 0.09;
	public SalesCommissionCalculator() {
		Scanner input = new Scanner(System.in);
		setCounter(1);
		System.out.println("Please enter '-1' to stop calculating the salesperson earnings");
		System.out.println("Item    "+"Value");
		System.out.printf("%d       ",getCounter());
		setSales(input.nextDouble());
		setTotal(getTotal()+getSales());
		while(!(getSales() == -1)){
			setCounter(getCounter()+1);
			System.out.printf("%d       ",getCounter());
			setSales(input.nextDouble());
			setTotal(getTotal()+getSales());
		}
			calculateSalary();
	}
	private void calculateSalary() {
		setProf(getTotal()*getCommission()+getSalary());
		System.out.println("The Salesman become:$ "+getProf()+" salary for the sold items");

		
	}
	public static double getSalary() {
		return salary;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public static double getCommission() {
		return commission;
	}
	public double getProf() {
		return prof;
	}
	public void setProf(double prof) {
		this.prof = prof;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
