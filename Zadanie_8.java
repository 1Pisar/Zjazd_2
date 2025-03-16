//8.Napisz program prostej kasę biletową. Kasa powinna wypisać kilka
// możliwych biletów do kupienia (normalny, ulgowy, miesięczny itp.)
// oraz pozwolić wybrać użytkownikowi jednej z biletów.
// Następnie program powinien zapytać użytkownika czy chce kolejny bilet czy nie (zakończenie programu).

import java.util.Scanner;

public class Zadanie_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("Wybierz bilet, który chcesz kupić:");
            System.out.println("1. Bilet normalny - 3.60 zł");
            System.out.println("2. Bilet ulgowy - 1.8 zł");
            System.out.println("3. Bilet miesięczny - 50 zł");
            System.out.println("4. Bilet grupowy (30 osób) - 60 zł");

            System.out.print("Wybierz numer biletu (1-4): ");
            int bilet = scanner.nextInt();

            switch (bilet) {
                case 1:
                    System.out.println("Wybrałeś bilet normalny. Cena: 3.6 zł.");
                    break;
                case 2:
                    System.out.println("Wybrałeś bilet ulgowy. Cena: 1.8 zł.");
                    break;
                case 3:
                    System.out.println("Wybrałeś bilet miesięczny. Cena: 50 zł.");
                    break;
                case 4:
                    System.out.println("Wybrałeś bilet grupowy (30 osób). Cena: 60 zł.");
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Proszę wybrać numer od 1 do 4.");
                    continue;
            }

            System.out.print("Czy chcesz kupić kolejny bilet? (tak/nie): ");
            String answer = scanner.next().toLowerCase();

            if (answer.equals("nie")) {
                kontynuuj = false;
            }
        }
        System.out.println("Dziękujemy za zakupy!");
        scanner.close();
    }
}
