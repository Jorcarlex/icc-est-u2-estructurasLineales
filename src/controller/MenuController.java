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
        while (exit) {
            consolaView.displayMenu();
            String option = consolaView.getInput("");
            switch (option) {
                case "1":
                    addcontact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printContact();
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

    private void printContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printContact'");
    }

    private void deleteContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
    }

    private void findContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findContact'");
    }

    private void addcontact() {
        String name = consolaView.getInput("Enter Name: ");
        String phone = consolaView.getInput("Enter Phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consolaView.showMessage("Contact added");

    }
}
