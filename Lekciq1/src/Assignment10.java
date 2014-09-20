import java.util.*;
public class Assignment10 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This Program reads five integers from the keyboard and determines the largest and the smallest number ");
		System.out.println("Please enter the first integer x: ");
		int x,y,z,w,q;
		x = input.nextInt();
		System.out.println("Please enter the second integer y: ");
		y = input.nextInt();
		System.out.println("Please enter the third integer z: ");
		z = input.nextInt();
		System.out.println("Please enter the forth integer w: ");
		w = input.nextInt();
		System.out.println("Please enter the fifth integer q: ");
		q = input.nextInt();
		if(x>=y&&x>=z&&x>=w&&x>=q){
			System.out.println("x: "+x+" is the largest number");
		}
		else if (y>=x&&y>=z&&y>=w&&y>=q){
			System.out.println("y: "+y+" is the largest number");
		}
		else if (z>=x&&z>=y&&z>=w&&z>=q){
			System.out.println("z: "+z+" is the largest number");
		}
		else if (w>=x&&w>=z&&w>=z&&w>=q){
			System.out.println("w: "+w+" is the largest number");
		}
		else
			System.out.println("The largest number is q: "+q);
		if(x<=y&&x<=z&&x<=w&&x<=q){
			System.out.println("x: "+x+" is the smallest number");
		}
		else if (y<=x&&y<=z&&y<=w&&y<=q){
			System.out.println("y: "+y+" is the smallest number");
		}
		else if (z<=x&&z<=y&&z<=w&&z<=q){
			System.out.println("z: "+z+" is the smallest number");
		}
		else if (w<=x&&w<=z&&w<=z&&w<=q){
			System.out.println("w: "+w+" is the smallest number");
		}
		else
			System.out.println("The smallest number is q: "+q);
 	}

}
