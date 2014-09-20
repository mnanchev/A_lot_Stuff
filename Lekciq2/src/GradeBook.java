
public class GradeBook {
	private String courseName;
	private String courseInstructor;
	public GradeBook(String courseName,String courseInstructor) {
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
	}
	public void displayMessage(String courseName){
		System.out.printf("\nWelcome to grade book for \n%s! \nThis course is presented by: %s :) ",getCourseName(),getInstructorName());
	}
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	public String getCourseName(){
		return courseName;
	}
	public void setInstructorName(String courseInstructor){
		this.courseInstructor = courseInstructor;
	}
	public String getInstructorName(){
		return courseInstructor;
	}

}
