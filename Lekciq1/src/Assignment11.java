import java.util.Scanner;
public class Assignment11 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program separates the digits from one another of a five digits number");
		System.out.println("Please enter a five digits number");
		int z = input.nextInt();
		int x,y,w,q,a;
		a = z%10;
		q = (z/10)%10;
		w = (z/100)%10;
		y = (z/1000)%10;
		x = (z/10000);
		System.out.println("   "+x+"   "+y+"   "+w+"   "+q+"   "+a);
	}

}
