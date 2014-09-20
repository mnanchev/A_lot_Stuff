import java.util.Scanner;


public class ObratenRed {

	public void obratenRed(){
		System.out.print("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
		int z = input.nextInt();
		
		int a = 0;
		
		
		System.out.print("Числото в обратен ред е: ");
		while(z/10!=0){
		
			a =z%10;
			z = z/10;
			
			System.out.print(a);
			
		}
	
		System.out.print(z+"\n");
		System.out.print("\nPlease enter a number: ");
		}
	}
}
