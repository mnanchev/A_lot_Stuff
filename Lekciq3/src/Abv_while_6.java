import java.util.Scanner;
public class Abv_while_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете число по-голямо от 0");
	    int n = input.nextInt();
		int k = 0;
		while(Math.pow(k, 2)<=n){
			k++;
		}
		k = k -1;
		System.out.println("Числото К , което изпълнява неравенството К^2<="+n+" e : "+k);
	}

}
