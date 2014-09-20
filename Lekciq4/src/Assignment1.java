import java.util.Scanner;
public class Assignment1 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number of values to be stored: ");
		int n = input.nextInt();
		int smallest = Integer.MAX_VALUE;
		int m;
		if (n == 0){
			System.out.println("You must enter at least one number to be stored!");
		}
		else{
			for(int k = 1; k<=n ; k++){
			System.out.print("Please enter a number : ");
			m = input.nextInt();
			if(smallest>m){
				smallest = m;
			}
			}
		}
		System.out.println("The smallest number entered from the you is: "+smallest);

	}
}

