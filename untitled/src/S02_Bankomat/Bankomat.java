package S02_Bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short sAuswahl = '2';
        int iEinzahlung = 0;
        int iAbhebung = 0;
        String strFortfahren = "0";
        int iKonto = 0;

        System.out.println("Willkommen zu meinem Bankomat Programm!");

        do {
            System.out.println("Was möchten sie tun?");
            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand");
            System.out.println("4 Beenden");

            sAuswahl = scanner.nextShort();
            switch (sAuswahl) {
                case 1:                                            //Einzahlen
                    System.out.println("Geben Sie den Betrag ein: ");
                    iEinzahlung = scanner.nextInt();
                    iKonto = iKonto + iEinzahlung;
                    System.out.println("Erfolgreich Eingezahlt!");
                    break;
                case 2:                                            //Abheben
                    System.out.println("Geben Sie den Betrag ein: ");
                    iAbhebung = scanner.nextInt();
                    iKonto = iKonto - iAbhebung;
                    System.out.println("Erfolgreich Abgehoben!");
                    break;
                case 3:                                            //Kontostand
                    System.out.println("Ihr Kontostand: " + iKonto);
                    System.out.println("OK um fortzufahren");
                    strFortfahren = scanner.next();
                    break;
                case 4:                                            //Beenden

                    break;
                default:
                    System.out.println("Falsche EIngabe");
                    break;
            }
        } while (sAuswahl != 4);
        System.out.print("Programm wurde beendet");

    }
}
