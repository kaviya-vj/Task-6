package java.org;

public class Employee {

	 int id;
	 String firstName;
	 String lastName;
	 int salary;
	
	public Employee(int id, String firstName, String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;		
	}
	//getter method for id
	public int getId() {
		return id;
	}
	//getter method for firstName
	public String getFirstName() {
		return firstName;
	}
	//getter method for lastName
	public String getLastName() {
		return lastName;
	}
	//getter method for combining the firstname and lastname
	public String getName(){
		
		return firstName+" "+lastName;	
	}
	//getter method for salary
	public int getSalary() {
		return salary;
	}
	//setter method for salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//getter method for calculating the salary
	public int getAnnualSalary()
	{
		return salary=salary*12;
	}
	//calculating the increase of salary
	public int raiseSalary(int percent) {
		
		return salary+=(salary*percent)/100;
	}
	
	@Override
	public String toString() {
		return "Employee [ id = "+id+", name = "+firstName+" "+lastName+", salary = "+salary+" ]";
	}
	public static void main(String[] args) {
		//Constructor object created and value had been passed
		Employee employee = new Employee(1, "Krishna", "Ramu", 20000);
		//Printing done
		System.out.println("Intial Salary of employee");
		System.out.println(employee);
		//getAnnualSalary method is given a call to get the annual salary
		System.out.println("Annual Salary : "+employee.getAnnualSalary());
		//salary had been raised 
		employee.raiseSalary(-20);
		System.out.println();
		System.out.println("New Salary of employee");
		//New salary is calculated and printed again
		System.out.println("New salary : "+employee.getSalary());
		System.out.println(employee);
	}

}