import java.util.Scanner;
public class Assignment3 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int z;
		System.out.println("This Programm check if the given integer can me divided by 5 and 7");
		System.out.println("Please enter an integer: ");
		z = input.nextInt();
		if(z%5==0&&z%7==0){
			System.out.println("The Number can be divided by 5 and 7");
		}
		else
			System.out.println("The Number cant be divided by 5 and 7");

	}

}
