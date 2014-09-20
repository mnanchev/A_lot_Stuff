
public class Assignment2 {

	
	public static void main(String[] args) {
		System.out.println("This program calculates the product of odd integers from 1 to 15");
		int oddNumber = 1;
		int product = 1;
		do{
			if(oddNumber%2==0){
				oddNumber++;
				continue;
			}
		product *= oddNumber;
		
		oddNumber++;

		}while(oddNumber<=15);
		System.out.println("The product of odd integers from 1 to 15 is: "+product);
	}

}
