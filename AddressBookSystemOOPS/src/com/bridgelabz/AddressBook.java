 /**
 * 
 */
package com.bridgelabz;
import java.util.*;
/**
 * @author Dell
 *
 */
/*
 * Ability to add a new
Contact to Address Book UC6 - Use arraylist to store multiple address books
AddressBookMain class
- Use Object Oriented Concepts to manage
relationship between AddressBook and Contact
Person
 * 
 */

public class AddressBook {	
	
	//Created an array of size 10 to store contacts
	private ArrayList<Contact> allContacts = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	
	String firstName1,lastName1, address1, city1, state1, zip1, phoneNo1, email1;
		
	//add contact to addressbook
	
	public void addToAddressBook() {
		System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
		firstName1 = input.nextLine();
		lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		zip1 = input.nextLine();
		phoneNo1 = input.nextLine();
		email1 = input.nextLine();
		
		Contact personContact =  new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNo1, email1);
		
		allContacts.add(personContact);
		
	}
	
	// Edit person name for the given name
	
	public void editPersonName() {
		int check=0;
		System.out.println("\nEnter current name of person to edit name");
		String currentName = input.nextLine();
		System.out.println("Enter name to update");
		String nameToUpdate = input.nextLine();
		
		for(int i=0; i < allContacts.size(); i++) {
			if(allContacts.get(i).firstName.equals(currentName)) {
				Contact contact= allContacts.get(i);
				contact.firstName = nameToUpdate;
				check=1;
				return;
			}
		}
		
		if(check==0) {
			System.out.println("No record found with given name");
		}
	}	
	
	//Display contact details
	
	public void displayAddressBook() {
		for(int i=0; i < allContacts.size(); i++) {
			allContacts.get(i).displayContact();
		}
	}
	
	//Delete a contact using name
	public void deleteContact() {
		int check=0;
		System.out.println("\nEnter name of person to delete contact");
		String name = input.nextLine();
		
		for(int i=0; i <allContacts.size(); i++) {	
			if(allContacts.get(i).firstName.equals(name)) {				
				allContacts.remove(i);	
				check=1;
				break;
			}
		}
		
		if(check==0) {
			System.out.println("No record found with given name to delete");
		}
	}
}