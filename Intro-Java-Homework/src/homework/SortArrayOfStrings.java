package homework;
import java.util.Scanner;
public class SortArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		int c;
		String container;
		String [] array = new String[number];
		//int counter = 0;
		System.out.print("Please enter " + "1"+" string ");
		
		for(int z = 0;z<array.length;z++){
			array[z] = input.next();
			if(z!=array.length-1){
			System.out.print("Please enter "+(z+2)+" string ");
			}
		}
		
		for(int i= 0;i<array.length-1;i++){
			for(int j = i+1;j<array.length;j++){
			c = array[i].compareTo(array[j]);
			if(c>0){
				container = array[i];
				array[i] = array[j];
				array[j] = container;
			}
			}
		}
		System.out.print("The alphabetical order is : ");
	for(int index = 0;index<array.length;index++){
		if(index != array.length-1){
		System.out.print(" "+array[index]+", ");
		}
		else
			System.out.print(" "+array[index]);
	}

	}

}
