
public class ExForLast {
	public int qualityPoints(int points){
		int z = 0;
		switch(points/10){
		case 10:
		case 9: z = 4; break;
		case 8: z = 3; break;
		case 7: z = 2; break;
		case 6: z = 1; break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: z = 0; break;
		default: System.out.println("Please enter correct student points (0-100) "); break;
		
		}
		return z;
	}
}
