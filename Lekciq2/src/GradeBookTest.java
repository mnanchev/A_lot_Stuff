import java.util.Scanner;
public class GradeBookTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming","K.Daskalova");
		GradeBook gradeBook = new GradeBook("CS102 Data Structures in Java","K.Daskalova");
		myGradeBook.displayMessage(myGradeBook.getCourseName());
		gradeBook.displayMessage(myGradeBook.getCourseName());
		System.out.println();
		System.out.println("\nPlease enter the new course name: ");
		String theName = input.nextLine();
		
		myGradeBook.setCourseName(theName);
		System.out.println();
		myGradeBook.displayMessage(theName);
		System.out.printf("\ngrade book 1  course name is: %s\n",myGradeBook.getCourseName());
		System.out.printf("grade book 2  course name is: %s\n ",gradeBook.getCourseName());

	}

}
