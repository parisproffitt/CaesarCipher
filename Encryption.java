
/**
 * This class handles encryption using the Caesar Shift Cipher.
 *
 * @author Paris Proffitt
 * @version April 1st, 2025
*/

public class Encryption {
    //Class constant for the alphabet
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //Generate the cipher alphabet
    public static String getCipherAlphabet(int shiftKey) {
        return ALPHABET.substring(shiftKey) + ALPHABET.substring(0, shiftKey);
    }

    //Encrypt the plaintext message
    public static String encryptMessage(String message, int shiftKey) {
        String cipherAlphabet = getCipherAlphabet(shiftKey);
        String encryptedMessage = ""; 

        for (int i = 0; i < message.length(); i++) {
            char c = Character.toUpperCase(message.charAt(i));
            int index = ALPHABET.indexOf(c);

            if (index != -1) {
                encryptedMessage += cipherAlphabet.charAt(index);
            } else {
                encryptedMessage += c; 
            }
        }
        
        return encryptedMessage;
    }
}