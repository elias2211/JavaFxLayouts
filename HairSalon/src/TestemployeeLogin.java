
public class TestemployeeLogin {

	public static void main(String[] args) {
		
		System.out.println("Mehrate Gemeda");
		EmployeeLogin employee = new EmployeeLogin ( "Helen","hey090",15.0,45,0);
		System.out.println(employee.getUserName());
		System.out.println(employee.getPassword());
		System.out.println(employee.getHourlyRate());
		System.out.println(employee.getTotalTimeWorked());
		System.out.println(employee.getPto());
		System.out.println(employee.toString());
		
		EmployeeLogin employee2 = new EmployeeLogin ( "Elias","217oh",22.0,50,0);
		System.out.println(employee2.getUserName());
		System.out.println(employee2.getPassword());
		System.out.println(employee2.getHourlyRate());
		System.out.println(employee2.getTotalTimeWorked());
		System.out.println(employee2.getPto());
		System.out.println(employee2.toString());
		
		if(employee.equals(employee2))
			System.out.println("same user name");
		else
			System.out.println("differnt user name");

		System.out.printf("Total payment of Helen: $%.2f" ,employee.totalPayment(45));
		System.out.printf("\nTotal payment of Elias: $%.2f" ,employee2.totalPayment(50));
		employee2.totalTime(40);
		if(employee2.addTotalPto(50))
			System.out.println("\nyou have earned 3 hours of paid time off");
		else 
			System.out.println("\nyou have earned 0 hours of paid time off");
		
		
		
		
	}

}
