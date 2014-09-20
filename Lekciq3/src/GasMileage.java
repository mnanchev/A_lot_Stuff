import java.util.Scanner;
public class GasMileage{
	private String carModel;
	public GasMileage(){
		System.out.println("Please enter the car model: ");
		Scanner input = new Scanner(System.in);
		carModel = input.nextLine();
	}
	public void setCarModel(String carModel){
		this.carModel = carModel;
	}
	public String getCarModel(){
		return carModel;
	}
	public void determineAverageFuelConsumption(){
		double gas;
		double miles;
		int counter = 1;
		double average = 0;
		double total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter miles traveled: ");
		miles = input.nextDouble();
		System.out.println("Please enter fuel consumption: ");
		gas = input .nextDouble();
		while((gas != -1 || miles != -1)&&(gas != 0)){
			average = miles/gas;
			total += average; 
			double average_consumption = total/counter;
			System.out.println("\nAverage  fuel consumption: \n"+ average);
			System.out.println("\nPlease enter miles traveled: ");
			miles = input.nextDouble();
			System.out.println("Please enter fuel consumption: ");
			gas = input .nextDouble();
			if(gas != -1 || miles != -1){
				counter++;
			}
			else
				System.out.println("Average total fuel consumption: "+ average_consumption );
		}
	}
}