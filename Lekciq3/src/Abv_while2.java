import java.util.Scanner;
public class Abv_while2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Тази програма проверява дали въведеното число е степен на 3");
		System.out.print("Моля въведете число:");
		int number = input.nextInt();
		int rem = 0;
		while(rem == 0){
			rem = number%3;
			number = number/3;
	}
	if(number != 0 ){
		System.out.println(false);
	}
	else
		System.out.println(true);
}
}
