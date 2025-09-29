import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Boolean verdi for å kjøre while-løkka (Ståle min goat)
        boolean programForsett = true;

        // While-løkka
        while (programForsett) {
            // Bruker input
            System.out.println();
            System.out.println("1. Primtall");
            System.out.println("2. Palindrom");
            System.out.println("3. Tallgjetting");
            System.out.println("4. Summen av tall");
            System.out.println("5. Avslutt");

            // Lagrer inputen
            int brukerInput = input.nextInt();

            // Gjør Primtall hvis brukern skrev inn 1 i terminalen
            if (brukerInput == 1) {
                // Skriv ut alle primtall opp til et tall brukeren oppgir.
                // Bruk en for-løkke.
                System.out.println("Skriv inn et tall: ");
                int primTall = input.nextInt();

                // Enda en true/false sjekk
                boolean primBoolean = true; // i er et primtall

                // 1 kan ikke være et prim tall så vi starter på 2
                // i = 2, hvis i er mindre eller lik primTall så går vi fra 2 til 3
                for (int i = 2; i <= primTall; i++) {
                    // j = 2 hvis j er mindre enn i, så blir j større
                    for (int j = 2; j < i; j++) {
                        // Hvis i kan deles på j
                        if (i % j == 0) {
                            // Da er i ikke et primtall
                            primBoolean = false;
                        }
                    }
                    // Skriver ut prim tallene
                    if (primBoolean) {
                        System.out.println(i + " er primtall.");
                    }
                }
                // Gjør palindrom
            } else if (brukerInput == 2) {

            }
        }
    }
}