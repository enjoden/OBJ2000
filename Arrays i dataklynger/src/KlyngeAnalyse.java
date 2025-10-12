// Program: Program som Analyserer data med Arrays
// Versjon: 0.1
// Author: Nikodem Jan Niezgoda
// Date: Søn Okt 5 2025
// Desc: Initial Program. Ingen endringer.
import java.util.Scanner;

class KlyngeAnalyse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lagrer totalen for nodene til senere: 1019
        int[] aktiveNoder = {32, 28, 27, 30, 35, 40, 42, 45, 50, 55, 60, 62, 59, 55, 52, 49, 47, 45, 43, 38, 35, 32, 30, 28};

        // Del 1.1
        for (int i = 0; i < aktiveNoder.length; i++) {
            System.out.println("Time " + i + ":" + " " + aktiveNoder[i] + " noder");
        }
        
        // Del 1.2 Antall reg timer
        int antallTimer = 0;
        for (int i = 0; i < aktiveNoder.length; i++) {
            antallTimer++;
        }
        System.out.println("Antall registrerte timer: " + antallTimer);
        
        //Del 1.2 Gjennomsnitten
        int totalNoder = 0;
        for (int i = 0; i < aktiveNoder.length; i++) {
            totalNoder += aktiveNoder[i];
        }
        int gjennomsnittenNoder = totalNoder / aktiveNoder.length;
        System.out.println("Gjennomsnitten av nodene er: " + gjennomsnittenNoder);
        
        //Del 1.3 Maksimum og Maksimum
        int highestNode = aktiveNoder[0];
        int lowestNode = aktiveNoder[0];
        for (int i = 0; i < aktiveNoder.length; i++) {
          if (highestNode < aktiveNoder[i]) {
            highestNode = aktiveNoder[i];
          }
          if (lowestNode > aktiveNoder[i]) {
            lowestNode = aktiveNoder[i];
          }
        }
        System.out.println("Maksimum: " + highestNode + " Minimum: " + lowestNode);

        // Del 1.4 Forskjell mellom høyeste og laveste verdi
        int forskjell = highestNode - lowestNode;
        System.out.println("Forskjell mellom høyeste verdi og laveste er " + forskjell);
        
        // Del 2
        // Feilhåndtering og Indeksering 
        System.out.println("Skriv et timetall mellom 0 og 23: ");
        int brukerinput = input.nextInt();
        if (brukerinput >= 0 && brukerinput <= 23) {
            System.out.println("Timer: " + brukerinput + ": " + aktiveNoder[brukerinput] + "noder");
        } else {
          System.out.println("Ugyldig indeks. Gylidige timer er 0-23!");
        }
    }
}
