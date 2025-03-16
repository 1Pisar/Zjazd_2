//5.Napisz prosty kalkulator, który poprosi użytkownika o podanie dwóch
// liczb oraz operacji do wykonania a następnie poda wynik działania.

import java.util.Scanner;

public class Zadanie_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        System.out.println("Wybierz operację: ");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Mnożenie");
        System.out.println("4 - Dzielenie");
        int operacja = scanner.nextInt();

        double wynik = 0;

        switch (operacja) {
            case 1:
                wynik = a + b;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = a - b;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = a * b;
                System.out.println("Wynik mnożenia: " + wynik);
                break;
            case 4:
                if (b != 0) {
                    wynik = a / b;
                    System.out.println("Wynik dzielenia: " + wynik);
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero.");
                }
                break;
            default:
                System.out.println("Nieprawidłowa operacja.");
        }
        scanner.close();
    }
}
