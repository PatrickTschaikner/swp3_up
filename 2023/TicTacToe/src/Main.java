import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int size = 3;                                                              //size ist global verwendbar
    private static final char[][] field = new char[size][size];                                     //final macht, dass das Eingegebene nicht mehr geändert werden kann
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        clear_board();
        for(int i = 0; i < size * size; i++){
            layout_board();
            System.out.println("Geben Sie Ihre Zeile und Spalte (Zeile,Spalte) ein: ");
            String input = scanner.next();
            String[] in = input.split(",");                                                   //split bedeutet, dass das Eingebene bei dem eingebenen (z.b. ',') geteilt wird
            int row = Integer.parseInt(in[0]);                                                      //Integer.parseInt holt die gewünschte Zeile oder Spalte aus dem Array als integer heraus.
            int column = Integer.parseInt(in[1]);
            if(field[row][column] == ' '){
                if(i % 2 == 0){                                                                     //% ist das Modulo-Zeichen. Hier wird es dafür verwendet, dass wenn 0 rauskommt, Spieler 1 dran ist und sonst Spieler 2

                }
            }else
        }

    }
        public static void layout_board() {                                                         //Aussehen des Boards
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println("|");
            if (i < size - 1) {
                System.out.println("-------------");
            }
        }else{
            System.out.println();
            }
    }

    private static void clear_board() {                                                             //Aufräumen des Boards
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = ' ';
            }
        }
    }
}