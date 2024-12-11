package controller;

import models.LinkedList;
import materia.models.NodeGenerico;
import models.Contact;


public class ContactManager {

    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public void printList() {
        contacts.print();
    }

    public Contact<?, ?> findContactByNme(String name) {
        NodeGenerico<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
            System.out.println(current);
            System.out.println(current.getNext());
        }
        return null; //
    }

    public void deleteContactByName(String name) {
        NodeGenerico<Contact<?, ?>> current = contacts.getHead();
        if (current == null)
            return;
        // Caso 1: que el contacto sea la HEAD o cabeza
        if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize() - 1);
        }
        // Caso 2: en el resto interar la lista
        while (current.getNext() != null) {
            if (((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize() - 1);
                return;
            }
            current = current.getNext();
        }
    }

}
