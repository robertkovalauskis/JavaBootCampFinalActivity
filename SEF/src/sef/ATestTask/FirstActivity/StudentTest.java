package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
		Student student = new Student();
		
		public void testPersonCreatedProperly() {
		
		student.setSchoolName("Oxford");
	    assertEquals("I am an error message", "Oxford", student.getSchoolName());
		}
	    

	public static void main(String[] args) {
		
	}
	}
	

