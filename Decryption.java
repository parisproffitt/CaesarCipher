
/**
 * This class handles decryption to get the original message.
 *
 * @author Paris Proffitt
 * @version April 1st, 2025
 */
public class Decryption {
    //Class constant for the alphabet
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //Decrypt the encrypted message
    public static String decryptMessage(String message, int shiftKey) {
        String cipherAlphabet = Encryption.getCipherAlphabet(shiftKey);
        String decryptedMessage = ""; 

        for (int i = 0; i < message.length(); i++) {
            char c = Character.toUpperCase(message.charAt(i));
            int index = cipherAlphabet.indexOf(c);

            if (index != -1) {
                decryptedMessage += ALPHABET.charAt(index);
            } else {
                decryptedMessage += c; 
            }
        }
        
        return decryptedMessage;
    }
}