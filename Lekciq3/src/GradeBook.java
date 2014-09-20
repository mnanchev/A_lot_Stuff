import java.util.Scanner;
public class GradeBook {
	private String courseName;
	public GradeBook(String courseName){
		this.courseName = courseName;
	}
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	public String getCourseName(){
		return courseName;	}
	public void displayMessage(){
		System.out.println("Welcome to GradeBook for "+getCourseName());
	}
	public void determineClassAverage(){
		double total = 0;
		int grade_counter = 1;
		double grade = 0;
		double class_average = 0;
		Scanner input = new Scanner(System.in);
		while(grade_counter <= 10){
			System.out.println("Please enter the next Grade: ");
			grade = input.nextDouble();
			total += grade;
			grade_counter++;
		}
		class_average = total/10;
		System.out.println("Total of all ten Grades is : "+total);
		System.out.println("Average Grade of the class: "+class_average);
	}
}
