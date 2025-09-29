// Program: Program som beregner Body Mass Index (BMI).
// Versjon: 0.1
// Author: Nikodem Jan Niezgoda
// Date: Wed Sep 24 2025
// Desc: Initial Program. Ingen endringer.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bruker skriver inn vekt i kilo m/u xx.x
        System.out.print("Vekt i kilo?: ");
        double weight = input.nextDouble();

        // Bruker skriver inn høyden i meter x.xx
        System.out.print("Høyde i meter?: ");
        double height = input.nextDouble();

        // Beregner BMI'en med kun vekt og høyde.
        double bmi = weight / (height * height);

        // Formaterer formattedBmi at den kun viser 2 desimaler.
        String formattedBmi = String.format("%.2f", bmi);

        if (bmi < 18.5) {
            System.out.print(formattedBmi + " Undervekt.");
        } else if (18.5 <= bmi && bmi <= 25.0) {
            System.out.print(formattedBmi + " Normal vekt.");
        } else if (25.0 <= bmi && bmi <= 30) {
            System.out.print(formattedBmi + " Overvekt.");
        } else {
            System.out.print(formattedBmi + " Fedme.");
        }
    }
}