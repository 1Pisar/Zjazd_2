//1.Program pyta użytkownika o liczbę i sprawdza, czy jest parzysta, czy nieparzysta.

import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź liczbę do sprawdzenia: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
        scanner.close();
    }
}