package sef.ATestTask.FirstActivity;

public class Employee extends Person {

     int empId;
     String jobTitle;
     String companyName;
     double salary;
    
    public static void main(String[] args) 
    {
    	Person e = new Employee(1, "Tester", "Microsoft", 1500.00, "John", "Doe", 35);
    	
		System.out.println(e.introduce());
		System.out.println(e.announce());
	}

    //TODO 1 create different constructors
    
    //default constructor
    public Employee()
    {
       	 this.empId = 1;
    	 this.jobTitle = "Developer";
    	 this.companyName = "Accenture";
    	 this.salary = 1500.00;
    }
    //parameterized constructor
    public Employee(int emId, String jobTitle, String companyName, double salary,
    		String firstName, String secondName, int age)
    {
    	this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		
   	 this.empId = emId;
   	 this.jobTitle = jobTitle;
   	 this.companyName = companyName;
   	 this.salary = salary;
   }
    
    // method for introducing person
    public String introduce() 
    {
    	return "My name is " + getFirstName() +" " + getSecondName() + " and I am " + getAge() + " years old." +
    "\n I am working as a " + getJobTitle() + " in the " + getCompanyName() + ".";
    }

    //TODO 2 add getters and setters
    // getters
    public String getJobTitle()
    {
	return jobTitle;
    }

    public String getCompanyName()
    {
	return companyName;
    }
    
    public double getSalary()
    {
    	return salary;
    }
	//setters
    public void setJobTitle(String jobTitle) 
    {
    	this.jobTitle = jobTitle;
    }
    
    public void setCompanyName(String companyName) 
    {
    	this.companyName = companyName;
    }
    // I don't write getters and setters for emId
    // because it is unnecessary for programs functionality

    //TODO 3 override method announce()
    public String announce() 
    {
		return "*OVERRIDEN* I am " + getFirstName() + " " + getSecondName() + "*OVERRIDEN*";
	}

	public void changeEmployeeInfo() 
	{
		// TODO Auto-generated method stub
	 this.jobTitle = "Electrician";
   	 this.companyName = "ABBY";
   	 this.salary = 6000;
		
	}



}