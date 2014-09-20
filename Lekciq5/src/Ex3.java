
public class Ex3 {
	private static final double  price = 2.0;
	private double charges;

	public static double getPrice() {
		return price;
	}
	public void calculateCharges(double hours){
		double charges = 0;
		if(Double.compare(hours,3.0)>0&&Double.compare(hours,24.0)<0){
			setCharges((hours - 3)*0.5+getPrice());
			System.out.println("\nCharges: "+getCharges());
		}
		else if(Double.compare(hours, 3)<=0&&Double.compare(hours, 0)>=0){
			setCharges(2);
			System.out.println("\nCharges: "+getCharges());
		}
		else if(Double.compare(hours,24.0)==0){
			setCharges(10);
			System.out.println("\nCharges: "+getCharges());
		}
		else{
			System.out.println("The car cant stay more than 24 hours or you have entered a negative number for the hours ");
		}
		
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
}
