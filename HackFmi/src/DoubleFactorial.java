public class DoubleFactorial {
	private static int count;
	private static int total = 1;
	private static long second = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doubleFac(3));
	}

	public static long doubleFac(int n) {
		if(n==0){
			return 1;
		}
		if (count == 0) {
			while (n != 1) {
				total = total * n;
				n = n - 1;
			}
			count++;
			doubleFac(total);
		} else {
			while (total != 1) {
				second = total * second;
				total--;
			}
		}
		return second;
	}
}
