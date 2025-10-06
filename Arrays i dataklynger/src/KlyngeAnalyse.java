// Program: Program som Analyserer data med Arrays
// Versjon: 0.1
// Author: Nikodem Jan Niezgoda
// Date: Søn Okt 5 2025
// Desc: Initial Program. Ingen endringer.

class KlyngeAnalyse {
    public static void main(String[] args) {
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
    }
}