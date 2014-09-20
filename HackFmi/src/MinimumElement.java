
public class MinimumElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [5];
		
		for(int j = 0;j<arr.length;j++){
			arr[j] = j-2;
			
		}
		System.out.println(minimumElement(arr));
	}
	public static int minimumElement(int [] array){
		int minimum = Integer.MAX_VALUE;
		for (int i = 0; i<array.length; i++){
			if(array[i]< minimum){
				minimum = array[i];
			}
		}
		return minimum;
	}
}
