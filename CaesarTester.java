
/**
 * This class provides a menu for users to encrypt or decrypt messages.
 *
 * @author Paris Proffitt
 * @version April 1st, 2025
*/

import java.util.Scanner;

public class CaesarTester {
    //Class constant for the alphabet
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static int shiftKey;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Caesar Shift Cipher:");

        while (true) {
            //Display menu options
            System.out.println("\nChoose an option (1-3):\n1. Encrypt\n2. Decrypt\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            //Exit condition
            if (choice == 3) {
                System.out.println();
                System.out.println("Exiting the Caesar Shift Cipher.");
                break;
            }

            System.out.print("Enter shift key (0-25): ");
            shiftKey = scanner.nextInt();
            scanner.nextLine();

            while (shiftKey < 0 || shiftKey > 25) {
                System.out.println("Invalid shift key. Please enter a value between 0 and 25.");
                System.out.print("Enter shift key (0-25): ");
                shiftKey = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.print("Enter your message: ");
            String message = scanner.nextLine();

            //Perform encryption or decryption
            if (choice == 1) {
                System.out.println("Encrypted Message: " + Encryption.encryptMessage(message, shiftKey));
            } else if (choice == 2) {
                System.out.println("Decrypted Message: " + Decryption.decryptMessage(message, shiftKey));
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
}