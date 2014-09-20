import java.util.Scanner;
public class Ex5Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ex5 e = new Ex5();
		System.out.println("Моля въведете   x>0  и y>1");
		System.out.print("Стойност за x e: ");
		while(input.hasNext()){
			
			int x = input.nextInt();
			System.out.print("Стойност за y e: ");
			int y = input.nextInt();
			e.isMultiple(x, y);
			System.out.print("\nСтойност за x e: ");
			
		}

	}

}
