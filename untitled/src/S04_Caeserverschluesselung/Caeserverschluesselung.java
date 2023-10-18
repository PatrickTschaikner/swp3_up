package S04_Caeserverschluesselung;

import java.util.Scanner;

public class Caeserverschluesselung {

    public static void main(String[] args) {
        String result = encrypt(1, "hallo");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringToEncrypt){
        String encryptedString = "";
        stringToEncrypt = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihren Text ein: ");
        stringToEncrypt = scanner.next();
        System.out.println("Geben Sie Ihre Verschiebung ein: ");
        shift = scanner.nextInt();

        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            encryptedString += Character.toString(letter);
        }

        return encryptedString;
    }
}
