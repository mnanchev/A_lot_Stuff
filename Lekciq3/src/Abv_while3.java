import java.util.Scanner;
public class Abv_while3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Моля въведете число , което е степен на 2 : ");
	int i = input.nextInt();
	int z = i;
	int rem = 0;
	int count = 0;
	while(rem == 0){
		i = i/2;
		rem = i%2;
		count++;
	}
		System.out.println("Числото "+z+" e 2 степен: "+count);
	}

}
