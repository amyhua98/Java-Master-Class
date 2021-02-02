package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 0:
                    printInstructions();
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\n0 - To print choice options.");
        System.out.println("\n1 - To print the list of grocery items.");
        System.out.println("\n2 - To add an item.");
        System.out.println("\n3 - To modify an item.");
        System.out.println("\n4 - To remove an item form the list.");
        System.out.println("\n5 - To search for an item");
        System.out.println("\n6 - To quit.");

    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in the grocery list.");
        }else{
            System.out.println(searchItem + "is not in the grocery list.");
        }
    }
}
