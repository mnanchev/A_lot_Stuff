
public class Ex9 {
	public void isPerfect(int a){
		int sum = 0;
		for(int i = 1; i<a; i++){
			if(a%i==0){
				sum = sum+i;
				
			}
	}
		if(a == sum){
			
			for(int i = 1; i<a; i++){
				if(a%i==0){
					sum = sum+i;
					System.out.printf("Devider of the number is: %d\n",i);	
				}
		}
			System.out.printf("The number is perfect: %d\n\n",a);
	}
}}
