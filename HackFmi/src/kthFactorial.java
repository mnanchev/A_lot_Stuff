public class kthFactorial {
	private static long total = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kthFac(2, 3));
	}

	public static long kthFac(int k, long total2) {
		while (total2 > 0) {
			total = total * total2;
			total2--;
		}
		
		return total;

	}
}
