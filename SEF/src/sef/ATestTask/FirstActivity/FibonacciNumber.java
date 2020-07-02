package sef.ATestTask.FirstActivity;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		  // creating Scanner for User input
		  Scanner myObj = new Scanner(System.in);
		  
		  System.out.println("How much Fibonacci numbers do you want to print?");
		  System.out.println("Please, enter the number below");
		
		  // numerical user input
		 int input = myObj.nextInt();
		
		 int y = input;
		
		System.out.println("\nFibonacci numbers: \n");
		
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(y)
		.map(t -> t[0])
		.forEach(x -> System.out.println(x));
	}

}
