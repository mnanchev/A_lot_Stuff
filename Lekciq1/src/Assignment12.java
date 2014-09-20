import java.util.Scanner;
public class Assignment12 {
	
	
	public static void main(String[] args) {
		int a,b,c;
		int x, y, z, w, q;
		a = 0;
		b = 0;
		c = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays the number of positive,negative and the number of zero");
		System.out.println("Please enter the first number ");
		x = input.nextInt();
		if (x>0)
			a++;
		if (x<0)
			b++;
		if (x==0)
			c++;
		System.out.println("Please enter the second number ");
		y = input.nextInt();
		if (y>0)
			a++;
		if (y<0)
			b++;
		if (y==0)
			c++;
		System.out.println("Please enter the third number ");
		z = input.nextInt();
		if (z>0)
			a++;
		if (z<0)
			b++;
		if (z==0)
			c++;
		System.out.println("Please enter the fourth number ");
		w = input.nextInt();
		if (w>0)
			a++;
		if (w<0)
			b++;
		if (w==0)
			c++;
		System.out.println("Please enter the fifth number ");
		q = input.nextInt();
		if (q>0)
			a++;
		if (q<0)
			b++;
		if (q==0)
			c++;
		System.out.println("The number of positive numbers is: "+a);
		System.out.println("The number of negative numbers is: "+b);
		System.out.println("The number of zeros is: "+c);
		
	}

}
