import java.util.Scanner;
public class GradeBook {
	private String courseName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int eCount;
	private int fCount;
	public GradeBook(String courseName){
		this.courseName = courseName;
	}
	public void displayMessage(){
		System.out.printf("Welcome to the grade book for\n%s!",getCourseName());
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getaCount() {
		return aCount;
	}
	public void setaCount(int aCount) {
		this.aCount = aCount;
	}
	public int getGradeCounter() {
		return gradeCounter;
	}
	public void setGradeCounter(int gradeCounter) {
		this.gradeCounter = gradeCounter;
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int bCount) {
		this.bCount = bCount;
	}
	public int getcCount() {
		return cCount;
	}
	public void setcCount(int cCount) {
		this.cCount = cCount;
	}
	public int getdCount() {
		return dCount;
	}
	public void setdCount(int dCount) {
		this.dCount = dCount;
	}
	public int getfCount() {
		return fCount;
	}
	public void setfCount(int fCount) {
		this.fCount = fCount;
	}
	public int geteCount() {
		return eCount;
	}
	public void seteCount(int eCount) {
		this.eCount = eCount;
	}
	public void inputGrades(){
		Scanner input = new Scanner(System.in);
		int grade;
		System.out.println("Enter the integer grades in the range 0-100. "+"\nType the end-of-life inficator to terminate input: "+"\nOn Windows type <Ctrl>  z then press Enter");
		while(input.hasNext()){
			grade = input.nextInt();
		    setGradeCounter(getGradeCounter()+1);
		    incrementLetterGradeCounter(grade);
		}
		System.out.println("Grade 'A' have "+getaCount()+" from the "+getGradeCounter()+ " students");
		System.out.println("Grade 'B' have "+getbCount()+" from the "+getGradeCounter()+ " students");
		System.out.println("Grade 'C' have "+getcCount()+" from the "+getGradeCounter()+ " students");
		System.out.println("Grade 'D' have "+getdCount()+" from the "+getGradeCounter()+ " students");
		System.out.println("Grade 'E' have "+geteCount()+" from the "+getGradeCounter()+ " students");
		System.out.println("Grade 'F' have "+getfCount()+" from the "+getGradeCounter()+ " students");
		}
	private void incrementLetterGradeCounter(int grade) {
		switch(grade/10){
		case 10:
		case 9:
			setaCount(getaCount()+1);
			break;
		case 8:
			setbCount(getbCount()+1);
			break;
		case 7:
			setcCount(getcCount()+1);
			break;
		case 6:
			setdCount(getdCount()+1);
			break;
		case 5:
			seteCount(geteCount()+1);
			break;
		default:
			setfCount(getfCount()+1);
			break;
			
		}	}
		public void displayGradeReport()
		{
			System.out.println("\nGrade Report:");      							// if user entered at least one grade...
			if (gradeCounter != 0)
			{			
				double average = (double)total / gradeCounter;						// calculate average of all grades entered
				
																					// output summary of results
				System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
				System.out.printf("Class average is %.2f\n", average);
				System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
										"Number of students who received each grade:",
										"A: ", aCount, 								// display number of A grades
										"B: ", bCount, 								// display number of B grades
										"C: ", cCount, 								// display number of C grades
										"D: ", dCount, 								// display number of D grades
										"F: ", fCount); 							// display number of F grades
			} 
			else 		// no grades were entered, so output appropriate message
				System.out.println("No grades were entered");
		} 
		

	
	
	}

