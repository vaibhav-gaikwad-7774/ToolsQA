package Hashtable;

import java.util.Hashtable;

public class ContactBook {
	Hashtable <String, String> contacts;
	
	ContactBook(){
		contacts = new Hashtable <String, String>();
	}
	
	public boolean hasName(String name) {
		return contacts.contains(name);
		
	}
	
	
	public boolean hasEmailAddress(String emailAddress) {
		return contacts.contains(emailAddress);
		
	}
	
	public String findEmailAddress(String name) {
        String emailAddress = contacts.get(name);
        if (emailAddress != null) {
            System.out.println("[" + name + "]: [" + emailAddress + "]");
            return emailAddress;
        }else {
            System.out.println("Contact for [" + name + "] not found");
            return null;
        }
    }
	

	
	
	

}
