import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

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
            String brukerInputStr = input.nextLine();
            int brukerInput = Integer.parseInt(brukerInputStr);

            // Gjør Primtall hvis brukern skrev inn 1 i terminalen
            if (brukerInput == 1) {
                // Skriv ut alle primtall opp til et tall brukeren oppgir.
                // Bruk en for-løkke.
                System.out.println("Skriv inn et tall: ");
                String primTallStr = input.nextLine();
                int primTall = Integer.parseInt(primTallStr);

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
                    // Hvil brukern forsette?
                    System.out.println("Hvil du forsette programmet? true/false");
                    String programForsettStr = input.nextLine();
                    programForsett = Boolean.parseBoolean(programForsettStr);
                }

            } else if (brukerInput == 2) {
                System.out.println("Skriv inn et ord: ");
                // Lagrer orginal ordet til det brukern har skrevet
                String orignalOrd = input.nextLine();

                // Lager en variabel som blir til det omvendte ordet
                String baklengsOrd = "";

                // Lager en indeks til while løkka
                // Indeksen starter på siste bokstav i lengden av ordet
                int indeks = orignalOrd.length() - 1;

                // while løkka
                while (indeks >= 0) {
                    // Baklengsord får bokstaven fra orginalOrdet hvor vi sjekker på indeksen
                    baklengsOrd += orignalOrd.charAt(indeks);
                    // Indeksen blir mindre slik at while løkka slutter på et tidspunk1
                    indeks--;
                }

                // En sjekk på om orginalOrdet er et Palindrom
                if (orignalOrd.equals(baklengsOrd)) {
                    System.out.println(orignalOrd + " er et palindrom.");
                } else {
                    System.out.println(orignalOrd + " er ikke et palindrom.");
                }
                // Hvil brukern forsette?
                System.out.println("Hvil du forsette programmet? true/false");
                String programForsettStr = input.nextLine();
                programForsett = Boolean.parseBoolean(programForsettStr);

            } else if (brukerInput == 3) {
                // Tallgjetting
                // random for et tall mellom 1 og 100
                // Math.random blir [0.0 og 1.0] * 100 blir [0.0 og 100.0].
                // Tallet er en float så vi gir den en (int) slik at tallet blir
                // En Integer.Da blir tallet mellom 0 99 så vi legger til 1 for å få 0 og 100.
                int tallBruker;
                int randomTall = (int) (Math.random() * 100) + 1;
                do {
                    // Må spørre brukern om hvilket tall han skrev inn i terminalen for
                    // å sjekke verdien i while loopen.
                    System.out.println("Skriv inn et tall mellom 1 og 100: ");
                    String tallBrukerStr = input.nextLine();
                    tallBruker = Integer.parseInt(tallBrukerStr);

                    // Print svar bare
                    if (tallBruker > randomTall) {
                        System.out.println("Tallet er for høyt, prøv igjen.");
                    } else if (tallBruker < randomTall) {
                        System.out.println("Tallet er for lavt, prøv igjen.");
                    } else {
                        System.out.println("Gratulerer! Du gjettet riktig.");
                    }
                } while (randomTall != tallBruker);

                // Hvil brukern forsette?
                System.out.println("Hvil du forsette programmet? true/false");
                String programForsettStr = input.nextLine();
                programForsett = Boolean.parseBoolean(programForsettStr);

            } else if (brukerInput == 4) {
                int sentinelVerdi = 1;
                int helTall = 0;

                while (sentinelVerdi != 0) {
                    System.out.println("Skriv inn et heltall: ");
                    String helTallStr = input.nextLine();
                    sentinelVerdi = Integer.parseInt(helTallStr);

                    if (sentinelVerdi != 0) {
                        helTall += sentinelVerdi;
                    }
                }

                System.out.println("Summen er: " + helTall);
            } else {
                System.out.println("Programmet avsluttes");
                programForsett = false;
            }
        }
    }
}