package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity 
{
	
	int num1;
	int num2;

	public static void main(String[] args) 
	{
		
		SecondActivity calculator = new SecondActivity();
		
		System.out.println("Result of addition setted values is - " + calculator.sum(10, 5));
		System.out.println("Result of substracting setted values is - " + calculator.substract(10, 3));
		System.out.println("Result of multiplying setted values is - " + calculator.multiply(2, 10));
		System.out.println("Result of dividing setted values is - " + calculator.divide(45, 5));
		
	}
	
		// default constructor
		public SecondActivity() 
		{
			num1 = 0;
			num2 = 0;
		}
		
		// parameterized constructor
		public SecondActivity(int num1, int num2) 
		{
			this.num1 = num1;
			this.num2 = num2;
		}

		//calculation methodes
		// addition
		static int sum(int num1, int num2) 
		{
		int sum = num1 + num2;
		return sum;
		}
		
		// Subtraction
		static int substract(int num1, int num2) 
		{
			int sub = num1 - num2; 
			return sub;
		}
	
		// multiplying
		static int multiply(int num1, int num2) 
		{
			int mult = num1 * num2;
			return mult;
		}
		
		// Dividing
		static int divide(int num1, int num2) 
		{
			int div = num1 / num2;
			return div;
		}
		
	
}
