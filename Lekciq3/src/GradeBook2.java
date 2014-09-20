import java.util.Scanner;
public class GradeBook2 {
	private String courseName;
	public GradeBook2(String courseName) {
		this.courseName = courseName;
	}
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	public String getCourseName(){
		return courseName;
	}
	public void displayMessage(){
		System.out.println("Welcome to GradeBook for "+getCourseName());
	}
	public void determineClassAverage(){
		Scanner input = new Scanner(System.in);
		double total = 0;
		int counter = 0;
		double grade = 0;
		double average;
		System.out.println("\nThe Program stops calculating the grade - average when you prompt - '-1' ");
		System.out.println("\nPlease enter a Grade: ");
		grade = input.nextDouble();
		while(grade != -1){
		total += grade;
		counter++;
		System.out.println("\nPlease enter a Grade: ");
		grade = input.nextDouble();
		}
		if(counter != 0){
			average = total / counter;
			System.out.println("The Class average grade is: "+average);
		}
		else
			System.out.println("No grades were entered");
	}

}
