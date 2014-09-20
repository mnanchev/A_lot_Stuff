import java.util.Scanner;
public class GasMileageTest {
	public static void main(String[] args){
		/*Scanner input = new Scanner(System.in);
		int number = 0;
		double average = 0;
		double gallons_mile = 0;
		System.out.println("Please enter the number of trips : ");
		int n = input.nextInt();
		while(number <= n){
			number++;
			System.out.println("Please enter the used gallons  : ");
			int gallons = input.nextInt();
			System.out.println("Miles  : ");
			int mileage = input.nextInt();
			gallons_mile = (double) gallons/mileage;
			System.out.println("Gallons per mile: "+gallons_mile);
			average = (average+gallons_mile)/number;
			System.out.println("Average consumption to this point: "+average+"gallons / mile");}**/
			GasMileage g = new GasMileage();
			g.determineAverageFuelConsumption();
			System.out.println(g.getCarModel());
			g.setCarModel("Pegeout");
			System.out.println(g.getCarModel());
		}
		
	}

