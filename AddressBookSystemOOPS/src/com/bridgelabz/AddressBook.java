/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class AddressBook {
	
	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String emailId;
	
	

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public void displaData() {
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Zip : "+zip);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email Id : "+emailId);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName1,lastName1, address1, city1, state1, zip1, phoneNo1, email1;
		
		System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
		firstName1 = input.nextLine();
	    lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		zip1 = input.nextLine();
		phoneNo1 = input.nextLine();
		email1 = input.nextLine();		
		
		AddressBook addressBookObj1 = new AddressBook(firstName1, lastName1, address1, city1, state1, zip1,
				 phoneNo1, email1);
		addressBookObj1.displaData();
		
		input.close();

	}
	
}
