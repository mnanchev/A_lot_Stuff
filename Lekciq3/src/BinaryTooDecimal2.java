import java.util.Scanner;
public class BinaryTooDecimal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This Program transformes binary number into decimal number :)");
		System.out.println("Please enter a bynary number:");
		int z = input.nextInt();
		int rem = 0;
		int number = 0;
		int n = 0;
		int k = z;
		if(z == 0 ){
			System.out.println("The decimal number of '0' is : "+z);
		}
		else if(k == 1){
			System.out.println("The decimal number of '1' is : "+1);
		}
		else{
		while(k != 0){
			rem = k%10;
			number += rem*Math.pow(2, n);
			n++;
			k = k/10;
		}
		System.out.println("Decimal  number of  '"+z+"' is :"+(int) number);
		}
	}

}
