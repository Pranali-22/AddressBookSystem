/**
 * 
 */
package com.bridgelabz;

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
	Contact[] allContacts = new Contact[10];
	static int index=0;
		
	public void addToAddressBook(Contact personContact) {
		allContacts[index]=personContact;
		index++;
	}
	
	public void editPersonEmailId(String name) {
		int i=0, check=0;
		for(; i < allContacts.length-1; i++) {	
			System.out.println(allContacts[i].firstName);
			String tempName= allContacts[i].firstName;
			if(tempName == name) {
				allContacts[i].emailId = "changemail@gmail.com";
				check=1;
				break;
			}
		}
		
		if(check==0) {
			System.out.println("No record found with given name");
		}
	}
	
}
