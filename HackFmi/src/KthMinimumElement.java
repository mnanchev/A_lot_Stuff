import java.util.Arrays;


public class KthMinimumElement {
	private static int total;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[5];
		for(int i = 0;i<array.length;i++){
			array[i] = i + 2031;
			total = total + array[i];
		}
		int [] sec = Arrays.copyOfRange(array, 0, array.length);
		Arrays.sort(sec);
		int k = 2;
		kthMin(k,sec);
		System.out.println("The "+k+" smallest element is: "+kthMin(k,sec));
		System.out.println("The average is: "+(double)total/array.length);
	}
	public static int kthMin(int k,int []arr){
		int min = 0;
		for(int i = 0;i<arr.length;i++){
			if(k - 1 ==i){
				min = arr[k-1];
			}
		}
		return min;
	}
}
