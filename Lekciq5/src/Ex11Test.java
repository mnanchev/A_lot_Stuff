import java.util.Scanner;
public class Ex11Test {
	public static void main(String [] args){
		Ex11 z = new Ex11();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integers");
		System.out.print("Please enter x: ");
		while(input.hasNext()){
			
			int x = input.nextInt();
			System.out.print("Please enter y: ");
			int y = input .nextInt();
			System.out.println("The greatest common divider is: "+z.GCD(x, y));
			System.out.print("\nPlease enter x: ");
		}
	}
}
