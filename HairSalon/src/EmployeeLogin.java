/* Mehrate Gemeda

 * 
 * Date 10/15/2018
 * 
 * This is a class of EmployeeLogin that have two different constructors and six data members with two string, two double, one int, and one final double type.
 * this class have getter's that return the value and setter's that change the value.The equals() method that compare two employee username and 
 * a toString method converts the object in to String. the other method is totalTime that will increase or decrease the total timeworked by the employee
 * weekly and a totalPayment method, first it will check if the employee has worked over time or not,
 *  if he does will calculate the overtime with time and half hourly rate and will give total paycheck of the employee in week. 
 * 
 */
public class EmployeeLogin {
	private String userName;
	private String password;
	private double hourlyRate; 
	private double totalTimeWorked; 
	private int pto;
	
	private final double OVERTIMERATE = 1.5;
	
	public EmployeeLogin() {
		userName = "";
		password = "";
		hourlyRate = 0.0;
		totalTimeWorked = 0;
		pto = 0;
	}
	public EmployeeLogin(String newUserName, String newPassword, double newhourlyRate,double newTotalTimeWorked) 
	{
	    userName = newUserName;
	    password = newPassword;
	    hourlyRate = newhourlyRate;
	    totalTimeWorked = newTotalTimeWorked;
	    
	}
	public EmployeeLogin(String newUserName, String newPassword, double newhourlyRate,double newTotalTimeWorked,int newPto) 
	{
		 userName = new String (newUserName);
		 password = new String (newPassword);
		 hourlyRate = newhourlyRate;
		 totalTimeWorked = newTotalTimeWorked;
		 pto = newPto;
	}
	public String getUserName()
	{
		return userName;	
	}
	public String getPassword()
	{
	    return password;
	}
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	public double getTotalTimeWorked()
	{
		return totalTimeWorked;
	}
	public int getPto()
	{
		return pto;
	}
	public void setUserName(String newUserName) {
		 userName= new String (newUserName);
	}
	public void setPassword(String newPassword) {
		password = new String (newPassword);
	}
	public void setHourlyRate(double newhourlyRate) {
		hourlyRate = newhourlyRate;
	}
	public void setTotalTimeWorked(double newTotalTimeWorked) {
		totalTimeWorked = newTotalTimeWorked;
	}
	public void setPto(int newPto) {
		pto = newPto;
	}
	public boolean equals(EmployeeLogin name2)             // equals method that compare two employee user name 
	{
	    return ( this.userName.equals(name2.userName));
	}
	public String toString() {                             // toString method which returns a formatted string with information about the object.
		return ("usrename: " + userName +  " " + " password : " + password + " " 
	+"hourlyRate: " + hourlyRate + " workingTime: " + " " + totalTimeWorked);	
	}
	public void totalTime(int weeklyWorkedTime)            // totalTime method will increase or decrease the total time worked by weeklyworkedtime 
	{
		totalTimeWorked = totalTimeWorked + weeklyWorkedTime;
	}
	public double totalPayment(double totalTimeWorked)   // totalPayment method will calculate weekly total payment  
	{
	if(totalTimeWorked <= 40)
		return (totalTimeWorked * hourlyRate);
	else 
		return (((totalTimeWorked - 40) * (OVERTIMERATE * hourlyRate)) + (totalTimeWorked * hourlyRate));
	}
	public boolean addTotalPto(int fulltime)          // addtotalPto method returns true tototalTimeWorkedlis over the full time, otherwise it returns false
	{
		if(totalTimeWorked >= fulltime)
			return true;
		else 
			return false;
	}
	
	

}
