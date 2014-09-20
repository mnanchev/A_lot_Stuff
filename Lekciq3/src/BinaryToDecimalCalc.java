import java.util.Scanner;
public class BinaryToDecimalCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int binary = input.nextInt();
		  int decimal = 0;
	        int power = 0;
	        while(true){
	            if(binary == 0){
	                break;
	            } else {
	                int tmp = binary%10;
	                decimal += tmp*Math.pow(2, power);
	                binary = binary/10;
	                power++;
	
	            }
           }
	        System.out.println(decimal);
	     }
	}


