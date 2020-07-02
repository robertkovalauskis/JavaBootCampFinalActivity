package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class FirstActivity extends Person {

	public static void main(String[] args) 
	{

		//TODO 1 Create collection of employee (more than 5) list or map
		Employee e1 = new Employee(1, "TestLead", "Microsoft", 4000.00, "Peter", "Doe", 35);
		Employee e2 = new Employee(2, "ManualTester", "Accenture", 1800.00, "Carl", "Fox", 56);
		Employee e3 = new Employee(3, "Developer", "IBM", 2100.00, "Michele", "Gilmore", 34);
		Employee e4 = new Employee(4, "Manager", "IBM", 3000.00, "Alfred", "Pink", 23);
		Employee e5 = new Employee(5, "AutomationTester", "Accenture", 2600.00, "Sam", "Bow", 40);
		
		// Initialise ArrayList
		List<Employee> employeeList = new ArrayList<Employee>();
			
		// add values
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
								//	
	    
								//
		//TODO 3 create instance of a Student as a Person ->
	   Person stud = new Student("UniversityOfRiga", "Philology", 9, "James", "Ice"); 
	   
		// than ask him introduce()  
	   System.out.println(stud.introduceStud());
	   
		// than make them Student  // ??? What do you mean by this ???
		// than ask him introduce() // ??? He already introduced himself

	   //TODO 2 sort and this employees by salary (from min to max)
	   
	   //print  by Salary
	   employeeList.sort(Comparator.comparing(Employee::getSalary));
	  
	   System.out.println("\nWorker list sorted by salaries: \n");
       Iterator<Employee> itr1 = employeeList.iterator();
       // traverse elements of ArrayList object
       while (itr1.hasNext()) 
       {
           Employee st = (Employee) itr1.next();
           System.out.println("Employees " + st.firstName + " " + st.secondName + " salary is "+st.salary);
       }
       // print and sort by First name
       employeeList.sort(Comparator.comparing(Employee::getFirstName));
       
       System.out.println("\n*BONUS-1* Worker list sorted by First name: \n");
       Iterator<Employee> itr2 = employeeList.iterator();
       // traverse elements of ArrayList object
       while (itr2.hasNext()) 
       {
           Employee st = (Employee) itr2.next();
           System.out.println("Employees " + st.firstName + " " + st.secondName + " salary is "+st.salary);
       }
       // print and sort by Second name
       employeeList.sort(Comparator.comparing(Employee::getSecondName));
       
       System.out.println("\n*BONUS-2* Worker list sorted by Second name: \n");
       Iterator<Employee> itr3 = employeeList.iterator();
       // traverse elements of ArrayList object
       while (itr3.hasNext()) 
       {
           Employee st = (Employee) itr3.next();
           System.out.println("Employees " + st.firstName + " " + st.secondName + " salary is "+st.salary);
       }
       
       
     //TODO 4 Create method for full change of employee information
   	// for example some employee change his work
       e1.changeEmployeeInfo(); // this method is created in Employee class
       
       System.out.println("\n *CHANGING VALUES* "
       	+ "\n Employee "+ e1.getFirstName() + " " + e1.getSecondName() + 
       	"\n is now working as a " + e1.getJobTitle() + " in company " + e1.getCompanyName());
	}
	
	
	
	
	
}
