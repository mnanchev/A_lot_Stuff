import java.util.Scanner;
public class Abv4 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int c = 0;
		int positive = 0;
		int negative = 0;
		while(n<=3){
			System.out.print("Please enter a number: ");
			c = input.nextInt();
			if(c >= 0){
				positive++;
			}
			else{
				negative++;
			}
			n++;
		}
		System.out.println("The number of positive entered numbers is: '"+positive+"' while the number of negative numbers is: '"+negative+"'");
	}

}
