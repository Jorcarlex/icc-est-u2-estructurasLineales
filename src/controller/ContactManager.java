package controller;

import java.util.LinkedList;

import models.Contact;

public class ContactManager {
    private LinkedList <Contact<?, ?>>contacts;
    public ContactManager(){
        this.contacts = new LinkedList<>();
    }
    public void addContact (Contact<?, ?>contact){
        contacts.appendToTail();
    }

    public void printList(){
        
    }
    
}
