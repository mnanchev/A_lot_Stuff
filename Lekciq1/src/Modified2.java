import java.util.Scanner;
public class Modified2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int a = 1;
		int num;
		while(a<=7){
			num = input.nextInt();
			if(num<min){
				min = num;
			}
			else if(num>max){
				max = num;
			}
			a++;	
		}
		System.out.println("Най-голямото число е "+max+", a най малкото е "+min+".");

	}

}
