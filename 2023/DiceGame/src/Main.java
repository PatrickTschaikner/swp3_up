import java.sql.SQLOutput;
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
        int SummeS = 0;
        int PunkteC = 0;
        int PunkteS = 0;

        System.out.println("--------------------Willkommen zum DICE GAME!--------------------");
        System.out.println("Schreiben Sie 'Start' um Das Spiel anzufangen");
        strStart = scanner.next();
        for(int i = 0; i < 6; i++) {
            int Computer = random.nextInt(6) + 1;
            int Player = random.nextInt(6) + 1;

            if(Computer > Player){
                PunkteC++;
            }else if(Player > Computer){
                PunkteS++;
            }
            //SummeC = SummeC + Computer;
            //SummeS = SummeS + Player;
            System.out.println("Computer: " + Computer + "\t Spieler: " + Player);
        }
        System.out.println("C: " + PunkteC + " S: " + PunkteS);
        if(PunkteC > PunkteS){
            System.out.println("Der Computer hat gewonnen!");
        }else if(PunkteS > PunkteC){
            System.out.println("Der Spieler hat gewonnen!");
        }else{
            System.out.println("Gleichstand!");
        }
    }
}