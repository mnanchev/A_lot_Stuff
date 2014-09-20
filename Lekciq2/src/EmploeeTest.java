
public class EmploeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Martin","Nanchev",2100);
		Employee employee2 = new Employee("Nikola","Peev",899.93);
		System.out.printf("Employee first name: %s  Employee last name: %s Employee salary: %.2f\n",employee1.getFirstName(),employee1.getLastName(),employee1.getMonthlySalary());
		double yearlySalary = employee1.getMonthlySalary()*12;
		System.out.printf("Employee 1 become %.2f per year\n",yearlySalary);
		System.out.printf("Employee first name: %s  Employee last name: %s Employee salary: %.2f\n",employee2.getFirstName(),employee2.getLastName(),employee2.getMonthlySalary());
		double yearlySalary2 = employee2.getMonthlySalary()*12;
		System.out.printf("Employee 2 become %.2f per year",yearlySalary2);
	}

}
