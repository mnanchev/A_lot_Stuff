import java.util.Scanner;
public class EmployeeSalaryTest {
	Scanner input = new Scanner(System.in);
	private double hourly_rate;
	private double hours;
	private int counter = 1;
	private double profit = 0;
	public EmployeeSalaryTest() {
		System.out.println("To exit the programm enter '-1'");
		System.out.println("Please enter hourly rates for Employee "+getCounter()+" :");
		setHourly_rate(input.nextDouble());
		System.out.println("Please enter working hours for Employee "+getCounter());
		setHours(input.nextDouble());
		if(getHours()>40 && getHours()!= -1 && getHourly_rate() != -1){
			setProfit((getHours()-40)*1.5*getHourly_rate()+40*getHourly_rate());
			System.out.println("Employee "+getCounter()+" become $ "+getProfit());
		}
		else if(getHours()!= -1 && getHourly_rate() != -1){
			setProfit(40*getHourly_rate());
		System.out.println("Employee "+getCounter()+" become $ "+getProfit());
		}
		while(getHours()!= -1 && getHourly_rate() != -1){
			setCounter(getCounter()+1);
			System.out.println("Please enter hourly rates for Employee "+getCounter()+" :");
			setHourly_rate(input.nextDouble());
			System.out.println("Please enter working hours for Employee "+getCounter());
			setHours(input.nextDouble());
			if(getHours()>40 && getHours()!= -1 && getHourly_rate() != -1){
				setProfit((getHours()-40)*1.5*getHourly_rate()+40*getHourly_rate());
				System.out.println("Employee "+getCounter()+" become $ "+getProfit());
			}
			else if(getHours()!= -1 && getHourly_rate() != -1){
				setProfit(40*getHourly_rate());
			System.out.println("Employee "+getCounter()+" become $ "+getProfit());
			}
		}
		
	}
	public double getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(double d) {
		this.hourly_rate = d;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}

}
