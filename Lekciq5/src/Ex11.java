
public class Ex11 {
	public int GCD(int x,int y){
		if(x >=y){
			int z = 0;
			z = x;
			x = y;
			y = z;
		}
		int rem = 0;
		int z = 0;
		while(y%x!=0){
			rem = y%x;
			y = x;
			x = rem;
			
		}
		return x;
	}
}
