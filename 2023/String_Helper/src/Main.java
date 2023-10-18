import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein: ");
        String text = scanner.next();
        System.out.println("Geben Sie den Buchstaben ein, der gesucht werden soll:");
        String search1 = scanner1.next();
        char[] search = search1.toCharArray();
        int result = countletter(text,search);
        System.out.println(result);
    }
    public static int countletter(String text, char[] search){
        char[] textArray = text.toCharArray();
        int count = 0;
        for (int i = 0 ; i < textArray.length ; i++){
            if (textArray[i]==search[0]){
                count++;
            }
        }
        return count;
    }
}
