package com.udemy.domainmodel;

public class Employee {

	private static int id = 1000;
	private int employeeId;
	private String name;
	private String position;
	private int salary;
	private String department;
	
	static {
		id = 1001;
		System.out.println("Static init block is called");
	}
	
	{
		department = "IT";
		System.out.println("Non-static init block is called");
	 	
	}
	
	
	
	public Employee() {
		this("A", "B", 1);
		System.out.println("Empry constructor called");
	}

	public Employee(String name, String position, int salary) {
		this(name, position, salary, "IT");
		System.out.println("Constructor with 3 params called");
	}
	
	private Employee(String name, String position, int salary, String department) {
 		employeeId = id ++;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.department = department;
		System.out.println("Constructor with 4 params called");
	}

	public static int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getSalary() {
		return salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}



	/*@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", position=" + position + ", salary=" + salary
				+ "]";
	}*/

	
	
	

}
