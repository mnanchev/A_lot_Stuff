
public class InfiniteLoop {

	
	public static void main(String[] args) {
		int n = 0;
		while(true){
			n++;
			int z =(int) Math.pow(2, n);
			System.out.println("Loop to infinity: "+z);
		}
	}

}
