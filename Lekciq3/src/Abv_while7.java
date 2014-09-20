import java.util.Scanner;


public class Abv_while7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете число по-голямо от 0");
	    int n = input.nextInt();
		int k = 1;
		while(Math.pow(3, k)<=n){
			k++;
		}

		System.out.println("Числото К , което изпълнява неравенството 3^K>"+n+" e : "+k);
	}

}
