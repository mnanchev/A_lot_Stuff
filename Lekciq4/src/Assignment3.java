
public class Assignment3 {

	
	public static void main(String[] args) {
		System.out.println("This Program calculate the factorials of 1 through 20 ");
		long prod = 1;
		for(int i = 0; i<=20; i++){
			if(i == 0){
				System.out.printf("The product of %d! is %d\n",i,1);
			}
			else{
			prod = prod*i;
			System.out.printf("The product of %d! is %d\n",i,prod);
			}
		}

	}

}
