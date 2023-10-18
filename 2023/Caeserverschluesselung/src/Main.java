import java.util.Scanner;

public class Main {
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
            if(inputData[i] >= 122) {
                inputData[i] = 96;
            }
            int letter = inputData[i] + shift;
            if(inputData[i] == 91 ||inputData[i] == 92 ||inputData[i] == 93 ||inputData[i] == 94 ||inputData[i] == 95 ||inputData[i] == 96){
                inputData[i] = 64;
            }
            encryptedString += Character.toString(letter);
        }

        return encryptedString;
    }
}