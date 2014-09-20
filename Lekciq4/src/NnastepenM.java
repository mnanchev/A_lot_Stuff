import java.util.Scanner;
public class NnastepenM {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Моля въведете число: ");
		int n = input.nextInt();
		int result = 1;
		System.out.print("\nМоля въведете степен: ");
		int m = input.nextInt();
		for(int i = 1 ; i <= m; i ++){
			result =result*n;
			
		}
		System.out.println("n^m = "+result);
	}

}
