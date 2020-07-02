package sef.ATestTask.ThirdActivity;

import java.util.Arrays;
import java.util.List;

//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class ThirdActivity {

    public static void main(String[] args) {
        ThirdActivity ta = new ThirdActivity();
        //TODO handle exception on proper way
        catchExeption();
        
        ta.validateUser("John");
        ta.validateUser("Vadim");
        ta.validateUser("Joshua");
        ta.validateUser("Peacy");
               
        // test flag task
        
    
       }

    
    static void catchExeption() 
    {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        try {
        	for (int i = 0; i <= 10; i++) 
        	{
        		System.out.println(arr[i]);
        	}
	
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("Array is out of bounds");
        }
        finally {
        	System.out.println("This should get printed even if there is an exception");
        }
    }
 
    
    static void validateUser(String name) 
    {
        String[] validUsers = {"John", "Mike", "Missi", "Peacy"};
     // Convert String Array to List
        List<String> list = Arrays.asList(validUsers);
        
        if(list.contains(name))
        {
        	System.out.println("User validated. Welcome!");
        } else {
        	System.out.println("Exception: User isn't validated");
        }
        
       } 
       

    void catchMe(int num1, int num2)
    {
        //TODO Catch exeption
    	try {
    		 int result = num1 / num2;
             System.out.println("The result is :" + result);

    	} catch (Exception e) {
    		System.out.println("Exception! Can't perform dividing");
    	} finally {
    		//TODO prints a message "Thank you for using this program." always
            System.out.println("Thank you for using this program.");
    	}
    		  
    	
    	
          
    }
}

