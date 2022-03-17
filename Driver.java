/**
 * 
 */
package com.Operator;
import java.util.Scanner;

import com.namepack.*;
import com.Credservice.*;
/**
 * @author Pratikshit Chowdhury
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creating object obj of CredService
	    CredService obj = new CredService();
	    
	    // Invoking Scanner input function
		Scanner sc = new Scanner(System.in);	
	
		//Displaying the given format
    System.out.println("Welcome to the Registration page");
    System.out.println("Please enter the department from the following :");
    System.out.println("1. Technical");
    System.out.println("2. Admin");
    System.out.println("3. Human Resource");
    System.out.println("4. Legal"); 
    
    //Taking input from the user
    int dept = sc.nextInt();
     {
    //Applying switch case function to bring variety in options from theuser's input and function accordingly	 
    switch (dept) {
    
    case 1  : System.out.println("Dear Pratikshit your generated credentials are as follows");
    	      obj.d = "tech";
              obj.showCredentials();
     break;
    
    case 2 : System.out.println("Dear Pratikshit your generated credentials are as follows"); 
    	     obj.d = "admin";
             obj.showCredentials();
    break;
    
    case 3 : System.out.println("Dear Pratikshit your generated credentials are as follows"); 
    	     obj.d = "hr";
             obj.showCredentials();
    break;
    
    case 4 :  System.out.println("Dear Pratikshit your generated credentials are as follows");
              obj.d = "legal";
              obj.showCredentials();
    break;
    
    default : System.out.println("Please enter valid input");
    break;
    }
    
    }

	}

}
