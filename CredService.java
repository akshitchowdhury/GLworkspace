/**
 * 
 */
package com.Credservice;
import java.lang.*;

import com.Operator.Driver;
import com.namepack.*;
/**
 * @author Pratikshit Chowdhury
 *
 */
public class CredService  {
    
	
	//generatePassword method defined
	public void generatePassword() {
		int rnd = (int)(Math.random() * 2 );
		char rd = (char)(Math.random()*300 );
		System.out.print("Password -->");
		System.out.print(" "+ "z"+rnd+"#"+rd+"B");
		

    }
	
	//Creating object emp under Employee class
    Employee emp = new Employee("Pratikshit", "Chowdhury");
	public String d;
    
	
	//generateEmail method defined
	public void generateEmail() {
    emp.getFirstname();
    emp.getLastname();
    emp.department(this.d);
    System.out.println("emailid--->" + emp.getFirstname()+emp.getLastname()+"." +emp.d+"@gl.com");
	}
	
	//showCredentials method defined
	public void showCredentials() {
		this.generateEmail();
		System.out.println(" ");
		this.generatePassword();
	}
	}


