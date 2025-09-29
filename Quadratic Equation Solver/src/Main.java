// Program: Program som regner ut kvadratisk likning m formlen (ax^2 + bx + c = 0)
// Versjon: 0.1
// Author: Nikodem Jan Niezgoda
// Date: Wed Sep 24 2025
// Desc: Initial Program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // A verdi
        System.out.print("Verdi A: ");
        int a = input.nextInt();

        // B verdi
        System.out.print("Verdi B: ");
        int b = input.nextInt();

        // C verdi
        System.out.print("Verdi C: ");
        int c = input.nextInt();

        // Sjekker verdien til A om den er lik null.
        if (a == 0) {
            // A er null og programmet avsluttes
            System.out.print("A er null, og likning er ikke kvadratisk.");
        } else {
            // Regner ut discriminanten (idk hva det er på norsk 😭)
            int discriminant = (b*b) - 4 * a * c;
            //System.out.println(discriminant);

            // Ut i fra discriminanten sjekker på Rootsa
            if (discriminant > 0) {
                // Two distinct real Roots, calc them & display
                // x1 = -b + Square Root of discriminant / 2a
                // x2 = -b - Square Root of discriminant / 2a
                double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
                System.out.println("Two real Roots: " + x1 + " " + x2);

            } else if (discriminant == 0) {
                // One real Root (repeated root)
                // x1 = x2 = -b/2a
                double x2 = (-b) / (2.0 * a);
                System.out.println("One Real Root (Repeated Root): " + x2);

            } else {
                // Two complex Roots
                // Real Part: (-b/2a)
                // Imaginary part: (Square Root of - Discriminant / 2a)
                double realPart = ((-b) / (2.0 * a));
                double imaginaryPart = ((Math.sqrt(-discriminant)) / (2.0 * a));

                double x1 = realPart + imaginaryPart;
                double x2 = realPart - imaginaryPart;
                System.out.println("Two complex Roots: " + x1 + " " + x2);
            }
        }
    }
}