import java.util.Scanner;
public class Abv1 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Моля въведете число: ");
		int number = input.nextInt();
		if(number >= 0){
			number ++;
			System.out.println("Числото е: "+number);
		}
		else{
			number = number - 1;
			System.out.println("Числото е: "+number);
		}
	}

}
