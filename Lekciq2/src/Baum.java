import java.util.Scanner;
public class Baum {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three height: ");
		int z = input.nextInt();
		for(int i = 0;i<=z;i++){
			for(int j = 0; j<i;j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
