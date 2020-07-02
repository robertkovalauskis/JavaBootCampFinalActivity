package sef.ATestTask.FirstActivity;

// imports for looking int in Strings
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Person extends Humanity {
	
	public static void main(String[] args) {
		// creating a new object p
		Person p = new Person("Roberts1", "Kovalauskis20", 25);
		
		System.out.println(p.announce());
		System.out.println(p.introduce());
		
		// adding values to person object through abstract methodes
		p.Length(180);
		p.Weight(80);
		
		//returns int from String
		// First name
		 Pattern pat = Pattern.compile("\\d+");
		 Matcher m = pat.matcher(getFirstName());
		 while(m.find()) {
		 System.out.println("*EXCEPTION* Please delete number " + m.group()+ " from your First name string");
		 }
		 
		//returns int from String
		// Second name
		 Pattern patS = Pattern.compile("\\d+");
		 Matcher mS = patS.matcher(getSecondName());
		 while(mS.find()) {
		 System.out.println("*EXCEPTION* Please delete number " + mS.group()+ " from your Second name string");
		 }	
		
	} 

//TODO 1 Implement Person Attributes
	 static String firstName;
	 static String secondName;
	 int age;
	 // values declaring in abstract methodes
	 int lenght;
	 int weight;

	//Behavior - default constructor
	public Person(){
		firstName="Unknown";
		secondName = "Unknown";
		age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter and setter for String firstName
	public static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public static String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName();
	}
	
	public String introduce() {
		return "My name is " + getFirstName() + " " + getSecondName() + " and I am " + getAge() + " years old.";
	}
	
	// for the FirstActivity.java task
	 public String introduceStud() {
			return "Hello! My name is " + getFirstName() + " " + getSecondName();
		}

	public int Length(int lenght) {
		this.lenght = lenght;
		return lenght;
	}

	public int Weight(int weight) {
		this.weight = weight;
		return weight;
	}

	@Override
	public int Length() 
	{
		return 0;
	}

	@Override
	public int Weight() 
	{
		return 0;
	}

	
		
}

