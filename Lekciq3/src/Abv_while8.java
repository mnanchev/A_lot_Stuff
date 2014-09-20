import java.util.Scanner;
public class Abv_while8 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0 ;
		int counter = 0;
		do{
			sum += counter;
			counter++;
		
		}while(sum<=n);
		System.out.println("The sum of the integers is: "+sum);
		counter--;
		System.out.println("K is: "+counter);
	}

}
