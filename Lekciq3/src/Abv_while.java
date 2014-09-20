import java.util.Scanner;
public class Abv_while {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Моля въведете число: ");
		int n = input.nextInt();
		System.out.print("Моля въведете число: ");
		int k = input.nextInt();
		int z = 0;
		int count = 0;
		if(k>n){
			z = k;
			k = n;
			n = z;
		}
		while(n>=0){
			int difference = 0;
			difference = Math.abs(n-k);
			if(n<k){
				System.out.println("Остатъка от деленето на n и k e : "+n);
			}
			else if (n==0){
				System.out.println("Остатъка от деленето на n и k e : 0");
			}
			n = n - k;
			
			count++;			
		}
		count--;
		System.out.println("Частното от деленето на n и к е: "+count)	;	
	}

}
