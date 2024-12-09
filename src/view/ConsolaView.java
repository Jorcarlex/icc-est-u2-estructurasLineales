package view;

import java.util.Scanner;

public class ConsolaView {
    private Scanner scanner;

    public ConsolaView (){
        this.scanner = new Scanner(System.in);

    }

    public void displayMenu(){
        System.out.println("===Contact Manager Menu===");
        System.out.println("/1. add contact");
        System.out.println("/2. Find contact");
        System.out.println("/3. Delete contact");
        System.out.println("/4. Print contact");
        System.out.println("/5. Exit");
        System.out.println("Choose an option");

    }

    public String getInput(String prompt){
        System.out.println("* "+prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message){
        System.out.println("--"+message);
    }
}
