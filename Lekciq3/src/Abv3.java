import java.util.Scanner;
public class Abv3 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int i = input.nextInt();
		if(i>0){
			i = i+ 1;
			System.out.println("The number is: "+i);
		}
		else if(i == 0){
			i = 10;
			System.out.println("The number is: "+i);
		}
		else{
			i = i - 2;
			System.out.println("The number is: "+i);
		}

	}

}
