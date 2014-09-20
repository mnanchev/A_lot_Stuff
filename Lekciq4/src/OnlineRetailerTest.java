import java.util.Scanner;
public class OnlineRetailerTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int quant = 0;
		OnlineRetailer o = new OnlineRetailer();
		System.out.println("Please enter <Ctrl> + D when you are ready with your purchases to calculate the total value of the purchases");
		System.out.println("Please enter product number [1...5] + Enter and quantity + Enter :");
	
		while(input.hasNext()){
			num = input.nextInt();
			quant = input.nextInt();
			o.setProductNumber(num);
			o.setQuantity(quant);
			o.calculateTotalRetailValue();
		}
		o.displayTotalValue();
	}

}
