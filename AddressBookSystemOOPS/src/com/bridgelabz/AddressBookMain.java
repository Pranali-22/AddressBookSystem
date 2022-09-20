/**
 * 
 */
package com.bridgelabz;

import java.util.*;


/**
 * @author Dell
 *
 */
public class AddressBookMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<AddressBook> addressBookList = new ArrayList<>();  
		AddressBook addressBook1 = new AddressBook();
		AddressBook addressBook2 = new AddressBook();
	
		//Store contacts to addressBook1
		System.out.println("Enter input for 1st AddressBook");
		int choice =1;
		
		while (choice!=0){
         
            switch (choice){
                case 0:
                    return;
                   
                case 1:
                    addressBook1.addToAddressBook();
                    break;
                case 2:
                    addressBook1.editPersonName();
                    break;   
                case 3:
                	addressBook1.displayAddressBook();
                	break;
                case 4:
                	addressBook1.deleteContact();
                	break;
            }
            
            System.out.println("\nPress 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display \nPress 4 to delete contact");
            choice = input.nextInt();
        }		
		
		addressBookList.add(addressBook1);
		
		
		//Store contats to addressBook2
		System.out.println("Enter input for 2nd AddressBook");
		choice =1;		
		while (choice!=0){
         
            switch (choice){
                case 0:
                    return;
                   
                case 1:
                    addressBook2.addToAddressBook();
                    break;
                case 2:
                    addressBook2.editPersonName();
                    break;   
                case 3:
                	addressBook2.displayAddressBook();
                	break;
                case 4:
                	addressBook2.deleteContact();
                	break;
            }
            
            System.out.println("\nPress 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display \nPress 4 to delete contact");
            choice = input.nextInt();
        }
		
		//initialize addressBookList
		addressBookList.add(addressBook2);		
		
		
		//Display all addressBooks stored in addressBookList
		System.out.println("Displaying all address books stored in arraylist");
		for(int i=0;i<addressBookList.size();i++) {
			addressBookList.get(i).displayAddressBook();
		}
		
		input.close();
	}

}
