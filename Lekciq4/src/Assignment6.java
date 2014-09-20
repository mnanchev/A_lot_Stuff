
public class Assignment6 {

	
	public static void main(String[] args) {
		int count = 0;
		for(int sideA = 1 ;sideA<=500;sideA++){
			for(int sideB = 1; sideB<=500;sideB++){
				for(int hypotenuse = 1 ; hypotenuse<=500; hypotenuse++){
					if(Math.pow(hypotenuse, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)){
						count++;
					System.out.println(count+". side a of a triangle: "+sideA+" side b of a triangle: "+sideB+" Hypotenuse of a triangle: "+hypotenuse);
					}
				}
			}
		}

	}

}
