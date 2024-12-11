package controller;

import models.Contact;
import view.ConsolaView;

public class MenuController {
    private ContactManager contactManager;
    private ConsolaView consolaView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consolaView = new ConsolaView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consolaView.displayMenu();
            String option = consolaView.getInput("");
            switch (option) {
                case "1":
                    addcontact();
                    break;
                case "2":
                    findContactByName();
                    break;
                case "3":
                    deleteContactByName();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    consolaView.showMessage("Exiting......");
                    break;
                default:
                    consolaView.showMessage("Invalid option");
                    break;
            }
        }
    }

    private void printList() {
        consolaView.showMessage("Contact list");
        contactManager.printList(); // Delegar la impresión al ContactManager
    }

    private void deleteContactByName() {
        String name = consolaView.getInput("Enter a name to delete:  ");
        contactManager.deleteContactByName(name);
        consolaView.showMessage("Contact deleted if it exixted");
    }

    private void findContactByName() {
        String name = consolaView.getInput("Enter name to search");
        Contact<?, ?> contact = contactManager.findContactByNme(name);

        if (contact != null) {
            consolaView.showMessage("Contact found "+contact);
        }else{
            consolaView.showMessage("Contact not foud 404");
        }
    }

    private void addcontact() {
        String name = consolaView.getInput("Enter Name: ");
        String phone = consolaView.getInput("Enter Phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consolaView.showMessage("Contact added");

    }
}
