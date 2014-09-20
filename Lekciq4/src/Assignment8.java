import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int n = input.nextInt();
        long tempSum = 0;
        long first = 0;
        long second = 1;
        long totalSum = 0;
        if (n == 0 || n == 1)
        {
        	System.out.println("0");
        }
        else
        {
            for (int i = 0; i < n-2; i++)
            {
                tempSum = first + second;
                first = second;
                second = tempSum;
                totalSum += tempSum;
            }
            System.out.println(1+totalSum);
	}
	}}

