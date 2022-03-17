/**
 * 
 */
package com.namepack;

/**
 * @author Pratikshit Chowdhury
 *
 */
 public class Employee {

	/**
	 * 
	 */
    private String firstname;
    private String lastname;
	public String d;
    
	/**
	 * @param firstname
	 * @param lastname
	 */
	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    public void department(String d) {
    	this.d = d;
    }
    }


