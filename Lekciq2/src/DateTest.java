import java.util.Scanner;
public class DateTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This Program displayes the entered from the user date");
		System.out.println("Please enter a month: ");
		int month = input.nextInt();
		System.out.println("Please enter a day: ");
		int day = input.nextInt();
		System.out.println("Please enter an year: ");
		int year = input.nextInt();
		Date date = new Date(month,day,year);
		date.displayMessage();
		
	}

}
