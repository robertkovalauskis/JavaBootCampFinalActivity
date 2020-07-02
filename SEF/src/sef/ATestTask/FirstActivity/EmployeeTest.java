package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;


public class EmployeeTest extends TestCase {

    public void testcheckEmployeeCreatedProperly(){
        Employee employee = new Employee();
                
        employee.setCompanyName("Microsoft");
        assertEquals("I am an error message", "Microsoft", employee.getCompanyName());
        
        employee.setJobTitle("Developer");
        assertEquals("I am an error message", "Developer", employee.getJobTitle());
        
    }
    
    
public static void main(String[] args) {
	
}
}