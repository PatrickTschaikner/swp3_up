import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final int size = 3;                                                              //size ist global verwendbar
    private static final char[][] field = new char[size][size];                                     //final macht, dass das Eingegebene nicht mehr geändert werden kann
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    for(int j = 0; j < size; j++) {
        clear_board();
        for (int i = 0; i < size * size; i++) {
            layout_board();
            System.out.println("Geben Sie Ihre Zeile und Spalte (Zeile,Spalte) ein: ");
            String input = scanner.next();
            String[] in = input.split(",");                                                   //split bedeutet, dass das Eingebene bei dem eingebenen (z.b. ',') geteilt wird
            int row = Integer.parseInt(in[0]);                                                      //Integer.parseInt holt die gewünschte Zeile oder Spalte aus dem Array als integer heraus.
            int column = Integer.parseInt(in[1]);
            if (row < size || column < size) {
                if (field[row][column] == ' ') {
                    if (i % 2 == 0) {                                                                     //% ist das Modulo-Zeichen. Hier wird es dafür verwendet, dass wenn 0 rauskommt, Spieler 1 dran ist und sonst Spieler 2
                        field[row][column] = 'X';
                    } else {
                        field[row][column] = 'O';
                    }
                } else {
                    System.out.println("Kachel schon ausgefüllt. Nehmen Sie eine andere.");
                    i--;
                    continue;
                }
            } else {
                System.out.println("Deine Zahlen gehen über das Spielfeld hinaus. Versuche es erneut.");
                i--;
                continue;
            }

            if (Winner(field, 'X')) {
                layout_board();
                System.out.println("Spieler X hat gewonnen!");
                Punkte('X', 1);
                break;
            } else if (Winner(field, 'O')) {
                layout_board();
                System.out.println("Spieler O hat gewonnen!");
                Punkte('O', 1);
                break;
            }

            if (i == 8) {
                layout_board();
                System.out.println("Gleichstand!");
                break;
            }
        }
    }
    Punkte('O',0);
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
        }
    }

    private static void clear_board() {                                                             //Aufräumen des Boards
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = ' ';
            }
        }
    }

    private static boolean Winner(char[][] field, char player) {
        for(int i = 0; i < size; i++) {
           if(field[i][0] == player && field[i][1] == player && field[i][2] == player) {
               return true;
           }
        }

        for(int i = 0; i < size; i++){
            if(field[0][i] == player && field[1][i] == player && field[2][i] == player) {
                return true;
            }
        }

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) {
            return true;
        }
        if (field[0][2] == player && field[1][1] == player && field[2][0] == player) {
            return true;
        }

        return false;
    }

    private static void Punkte(char Player, int point){
        int pointsx = 0;
        int pointsy = 0;

        if(Player == 'X'){
            pointsx = pointsx + point;
        } else if (Player == 'O') {
            pointsy = pointsy + point;
        }

        System.out.println("Spieler X: " + pointsx);
        System.out.println("Spieler Y: " + pointsy);
    }
}