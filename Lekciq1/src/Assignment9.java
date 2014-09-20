import java.util.Scanner;
public class Assignment9 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays the sum,average,product and the smallest and the largest of three given numbers");
		int x, y, z, sum;
		System.out.println("Please enter the first integer: ");
		x = input.nextInt();
		System.out.println("Please enter the second integer: ");
		y = input.nextInt();
		System.out.println("Please enter the third integer: ");
		z = input.nextInt();
		sum = x+y+z;
		double average = sum/3;
		System.out.println("The Sum is: " + sum);
		System.out.println("The product is: " + (x*y*z));
		System.out.println("Average : " + average);
		if(x<=z&&x<=y){
			System.out.println("The smallest number is " + x);
		}
		else if(z<=y&&z<=x){
			System.out.println("The smallest number is " + z);
		}
		else 
			System.out.println("The smallest number is "+y);
	
		if(x>=z&&x>=y){
		System.out.println("The largest number is " + x);
		}
		else if(z>=y&&z>=x){
		System.out.println("The largest number is " + z);
		}
		else 
		System.out.println("The largest number is "+y);
	}
	

}
