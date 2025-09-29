// Program: Program som regner ut dato
// Versjon: 0.1
// Author: Nikodem Jan Niezgoda
// Date: Wed Sep 29 2025
// Desc: Initial Program.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // bruker input
        System.out.println("dd/mm/yyyy: ");
        // Lagrer inputen som en String array og splitter den hvor slashen kommer
        String[] dato = input.nextLine().split("/");

        // Konverterer fra String arrayen til int
        int dag = Integer.parseInt(dato[0]);
        int mnd = Integer.parseInt(dato[1]);
        int aar = Integer.parseInt(dato[2]);

        if (aar >= 1900 && aar <= 2100) {
            if (mnd >= 1 && mnd <= 12) {

                // Siden vi bruker Zeller mans formula
                // Må vi gjøre at januar er 13 mnd og feb er 14
                // Fra forgie aar
                if (mnd == 1 || mnd == 2) {
                    mnd += 12;
                    aar--;
                }

                // Leap aar
                boolean leapYear = (aar % 4 == 0 && (aar % 100 != 0 || aar % 400 == 0));
                int maksDager = 31;

                // Setter dagene til måndene
                if (mnd == 4 || mnd == 6 || mnd == 9 || mnd == 11) {
                    maksDager = 30;
                } else if (mnd == 2) {
                    // ternary operasjon, raskere måte på enn å skrive
                    // En if-else
                    // maksDager = condition(true/false) ? value hvis true : value hvis falser
                    maksDager = leapYear ? 29 : 28;
                }

                // Validasjonen av Dagene
                if (dag >= 1 && dag <= maksDager) {
                    // Zeller's formula for å finne dagen av uka
                    int q = dag;
                    int m = mnd;
                    int K = aar % 100;
                    int J = aar / 100;

                    // Zeller's formula for dagen i uka
                    int h = (q + (26 * (m + 1)) / 10 + K + K / 4 + J / 4 + 5 * J) % 7;

                    // En string array av resultatet (blir så ork med 0 1 2 3 4 5 6 som svar
                    // Og hvordan skal en vite at 2 er mandag XD
                    String[] ukeDager = {"Lørdag", "Søndag", "Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag"};
                    System.out.println("Uke dagen: " + ukeDager[h]);
                } else {
                    System.out.println("Feil dag");
                }
            } else {
                System.out.println("Feil Månende");
            }
        } else {
            System.out.println("Feil År.");
        }
    }
}