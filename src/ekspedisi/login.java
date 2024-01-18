/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekspedisi;

import java.util.*;
public class login {

    public record penerima(String id_penerima, String nama, String Alamat, String nomor_hp , String password){};
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMainMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Perform action for option 1
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    // Perform action for option 2
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    // Navigate to sub-menu
                    handleSubMenu(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void handleSubMenu(Scanner scanner) {
        int subChoice;

        do {
            displaySubMenu();
            subChoice = scanner.nextInt();

            switch (subChoice) {
                case 1:
                    // Perform action for sub-option 1
                    System.out.println("You selected Sub-Option 1");
                    break;
                case 2:
                    // Perform action for sub-option 2
                    System.out.println("You selected Sub-Option 2");
                    break;
                case 3:
                    System.out.println("Returning to the main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (subChoice != 3);
    }

    private static void displayMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Sub-menu");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displaySubMenu() {
        System.out.println("Sub-Menu:");
        System.out.println("1. Sub-Option 1");
        System.out.println("2. Sub-Option 2");
        System.out.println("3. Back to main menu");
        System.out.print("Enter your choice: ");
    }
    
}

