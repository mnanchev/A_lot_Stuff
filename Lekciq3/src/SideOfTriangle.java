import java.util.Scanner;
public class SideOfTriangle {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 1;
		int z = 0;
		int a = 0;
		int b = 0;
		while (n <= 3){
			System.out.print("Please enter "+n+" number :");
			z = input.nextInt();
			if(n == 1){
				a = z;
			}
			else if(n == 2){
				b =z;
			}
			else if((a+b>z)&&(a+z>b)&&(b+z>a))
					System.out.println("a,b,c make a triangle with sides: "+a+", "+b+", "+z);
			else
				System.out.println("a, b, c can't make  a triangle :(");
			n++	;
		}

	}

}
