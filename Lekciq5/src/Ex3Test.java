import java.util.Scanner;
import java.util.Random;
public class Ex3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ex3 e = new Ex3();
		double hours;
		double total = 0;
		System.out.print("Моля въведете часове: ");
		while(input.hasNext()){	
		hours = input.nextDouble();
		e.calculateCharges(hours);
		if(hours<=24&&hours>0){
		total = total+e.getCharges();
		}
		System.out.println("Total charges =  "+total);
		System.out.print("\nМоля въведете часове: ");
		}

	}

}
