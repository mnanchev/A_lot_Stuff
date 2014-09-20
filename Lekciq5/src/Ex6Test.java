import java.util.Scanner;
public class Ex6Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ex6 e = new Ex6();
		
		System.out.print("Please enter a number: ");
		int num;
		while(input.hasNext()){
			
			 num = input.nextInt();
			 if(e.isEven(num)){
					System.out.println("The number is even");
				}
				else{
					System.out.println("The number is odd");
				}
			 System.out.print("Please enter a number: ");
		}
		
		 
	}

}
