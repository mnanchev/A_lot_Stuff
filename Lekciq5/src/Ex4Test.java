import java.util.Scanner;
public class Ex4Test {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double num ;
		int c ;
		Ex4 e = new Ex4();
		System.out.print("Моля въведете число: ");
		while(input.hasNext()){
			num = input.nextDouble();
			System.out.println("Началната стойност на числото е: "+num);
			c = e.Round(num);
			System.out.println("Крайната стойност на числото е: "+c);
			System.out.print("\nМоля въведете число: ");
		}
	}
}
