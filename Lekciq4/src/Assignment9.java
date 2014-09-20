import java.util.Scanner;
public class Assignment9 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,d,e;
		String s1,s2,s3,s4,s5;
		System.out.print("Please enter an integer: ");
		a = input.nextInt();
		System.out.print("Please enter an integer: ");
		b = input.nextInt();
		System.out.print("Please enter an integer: ");
		c = input.nextInt();
		System.out.print("Please enter an integer: ");
		d = input.nextInt();
		System.out.print("Please enter an integer: ");
		e = input.nextInt();
		for(int i = 0; i < a;i++){
			s1 = "\n";
			s1 += "*";
			System.out.print(s1);
		}
		System.out.println();
		for(int i = 0; i < b;i++){
			s2 = "";
			s2 += "*";
			System.out.print(s2);
		}
		System.out.println();
		for(int i = 0; i < c;i++){
			s3 = "";
			s3 += "*";
			System.out.print(s3);
		}
		System.out.println();
		for(int i = 0; i < d;i++){
			s4 = "";
			s4 += "*";
			System.out.print(s4);
		}
		System.out.println();
		for(int i = 0; i < e;i++){
			s5 = "";
			s5 += "*";
			System.out.print(s5);
		}

	}

}
