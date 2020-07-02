package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
	
	String schoolName;
	String course;
	int averageScore;
	
	
	public static void main(String[] args) 
	{
		Person s = new Student("UniversityOfBerlin", "ComputerScience", 9, "William", "Night");
		System.out.println(s.introduce());
	}
	
	//default constructor
	public Student() 
	{
		schoolName = "Oxford";
		course = "Philosophy";
		averageScore = 6;
		
		firstName = "Unknown";
		secondName = "Unknown";
	}
	//parameterized constructor
	public Student(String schoolName, String course, int averageScore, String firstName, String secondName) 
	{
		this.firstName = firstName;
		this.secondName = secondName;
		
		this.schoolName = schoolName;
		this.course = course;
		this.averageScore = averageScore;
	}
	
	 // overriding method for introducing student
	public String introduce()
	{
		return "I am studying in university " + getSchoolName();
	}
	//getters and setters
    // getters
	public String getSchoolName()
	{
		return schoolName;
	}
	//setters
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	// I don't write getters and setters for course and averageScore
    // because it is unnecessary for programs functionality
	
}
