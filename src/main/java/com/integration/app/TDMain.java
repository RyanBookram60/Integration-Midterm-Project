package com.integration.app;

import java.util.Scanner;

public class TDMain {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String userInput;
        boolean exit = false;
        TDList list = new TDList();

        System.out.println("Welcome to the To-Do list interface! Enter a number to get started.");

        // Menu system
        while (!exit){

            System.out.println("\n1 - Add an item\n2 - Remove an item\n3 - Print all items\n4 - Exit the program");

            userInput = scnr.nextLine();

            // Add an item
            if (userInput.equals("1")){

                System.out.println("\nEnter an item: ");
                userInput = scnr.nextLine();
                list.add(userInput);
                System.out.println("\nItem successfully added!");
            }
            // Remove an item
            else if (userInput.equals("2")){

                System.out.println("\nEnter the number of the item to be removed: ");
                userInput = scnr.nextLine();

                try{
                    list.remove(Integer.parseInt(userInput) - 1);
                    System.out.println("Item successfully removed!");
                }
                catch (Exception e){
                    //System.out.println(e.getMessage());
                    System.out.println("Invalid input. Please enter a number within range of the list. Use the print option to view valid entries.");
                }
            }
            // Print the list
            else if (userInput.equals("3")){

                int count = 1;
                System.out.println("\nPrinting all items...\n");

                for (String s : list.getList()){

                    System.out.println(count + ": " + s);
                    ++count;
                }
            }
            // Exit the program
            else if (userInput.equals("4")){
                exit = true;
            }
            else{
                System.out.println("\nInvalid input. Please enter a number 1-4.");
            }
        }
    }
}
