import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String strStart = "0";
        int SummeC = 0;

        System.out.println("--------------------Willkommen zum DICE GAME!--------------------");
        System.out.println("Schreiben Sie 'Start' um Das Spiel anzufangen");
        strStart = scanner.next();
        for(int i = 0; i < 6; i++) {
            int Computer = random.nextInt(6) + 1;
            int Player = random.nextInt(6) + 1;

            SummeC = SummeC + Computer;
            System.out.println("Computer: " + Computer + "\t Spieler: " + Player);
        }
    }
}