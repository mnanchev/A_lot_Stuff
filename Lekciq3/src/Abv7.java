import java.util.Scanner;
public class Abv7 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number from type A: " );
		int a  = input.nextInt();
		System.out.print("Please enter number from type B: " );
		int b = input.nextInt();
		if(a > b){
			b = a;
			System.out.println("A = "+a+" B = "+b);
		}
		else if(b>a){
			a = b;
			System.out.println("A = "+a+" B = "+b);
		}
		else{
			a = 0;
			b = 0;
			System.out.println("A = "+a+" B = "+b);
		}

	}

}
