import java.util.Scanner;
public class ThreeNumbers {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int a = 0;
		int c=0;
		int b = 0;
		int middle = 0;
		int smallest = 0;
		int largest = 0;
		while(n < 3){
			System.out.print("Моля въведете число: ");
			if(a == 0){
			a = input.nextInt();
			}
			else if(b==0){
				b = input.nextInt();
			}
			else if(c==0){
				c = input.nextInt();
			}
				
			n++;
		}
		if(a<b&&a<c){
			smallest = a;
		}
		else if(b<a&&b<c){
			smallest = b;
		}
		else
			smallest = c;
		if((a<=b&&c<=a)||(a>=b&&a<=c)){
			middle = a;
		}
		else if((b<=a&&b>=c)||(b>=a&&b<=c)){
			middle = b;
		}
		else
			middle = c;
		if(a>=b&&a>=c){
			largest = a;
		}
		else if(b>=a&&b>=c){
			largest = b;
		}
		else
			largest = c;
		System.out.println("Най-малкото число е: "+smallest+",   а средното по големина е: "+middle);
		System.out.println("Сумата на двете най-големи числа е: "+(largest + middle));
	}

}
