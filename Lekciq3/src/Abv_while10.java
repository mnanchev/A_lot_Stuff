import java.util.Scanner;
public class Abv_while10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int z = n;
		int a = 0;
		int counter = 1;
		int sum = 0;
		System.out.print("Числото в обратен ред е: ");
		while(z/10!=0){
			counter++;
			a =z%10;
			z = z/10;
			sum = sum+a;
			System.out.print(a+" ");
			
		}
		sum = sum+z;
		System.out.print(z+"\n");
		System.out.println("Количеството на цифрите на числото "+n+" е:"+counter);
		System.out.println("Сумата на числата е : "+sum);
	}

}
