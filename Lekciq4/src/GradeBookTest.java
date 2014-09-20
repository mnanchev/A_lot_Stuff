

public class GradeBookTest {

	public static void main(String[] args) {
		
		// create GradeBook object myGradeBook and pass course name to constructor
		
		GradeBook myGradeBook = new GradeBook("Introduction to Java Programming");
		myGradeBook.displayMessage(); 				// display welcome message
		myGradeBook.inputGrades(); 					// read grades from user
	 			// display report based on grades
	}
}