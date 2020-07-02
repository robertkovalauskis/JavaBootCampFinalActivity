package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	Person person = new Person();
	
	public void testPersonCreatedProperly() {
	person.setFirstName("John");
    assertEquals("I am an error message", "John", person.getFirstName());
    
    person.setSecondName("Pink");
    assertEquals("I am an error message", "Pink", person.getSecondName());
    
    person.setAge(21);
    assertEquals("I am an error message", 21, person.getAge());
}

public static void main(String[] args) {
	
}
}