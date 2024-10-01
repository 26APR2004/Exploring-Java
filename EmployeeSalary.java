package util;

class InfoEmployee
{
	private String name;
	private double salary;
	
	// set and get methods
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		if(salary>=0)
		this.salary=salary;
		else
			System.out.println("Invalid salary!");
	}
	
}
public class EmployeeSalary {
	public static void main(String...args)
	{
		InfoEmployee emp=new InfoEmployee();
		emp.setName("Sujal");
	    emp.setSalary(2000.0);
	    
	    System.out.println("Employee Name:"+emp.getName());
	    System.out.println("Employee Salary:$ "+emp.getSalary());
		
	}

}
