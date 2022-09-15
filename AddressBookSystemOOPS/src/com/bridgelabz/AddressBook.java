/**
 * 
 */
package com.bridgelabz;
import java.util.ArrayList;

/**
 * @author Dell
 *
 */
/*
 * Ability to add a new
Contact to Address Book UC2 - Use Console to add person details from
AddressBookMain class
- Use Object Oriented Concepts to manage
relationship between AddressBook and Contact
Person
 * 
 */

public class AddressBook {	
	
	//Created an array of size 100 to store contacts
	ArrayList<Contact> allContacts = new ArrayList<Contact>();
	//Contact[] allContacts = new Contact[100];
	
	public void addToAddressBook(Contact personContact) {
		allContacts.add(personContact);
	}
	
}
