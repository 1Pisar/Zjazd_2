//10.Napisz rozszerzoną wersję programu za zadania nr 5 z zestawu 1.
// Wprowadź dodatkowe dodatkowe funkcjonalności:
//  a.Tryby trudności – gracz może wybrać poziom trudności:
//    łatwy (1-50), średni (1-100), trudny (1-200).
//  b.Licznik prób i limit – użytkownik ma określoną liczbę prób zależną od poziomu trudności.
//  c.Podpowiedzi o różnicy – program nie tylko mówi "za dużo" lub "za mało", ale także informuje,
//    jak blisko gracz jest od poprawnej liczby (np. "Dużo/trochę za mało/dużo!").

import java.util.Random;
import java.util.Scanner;

public class Zadanie_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wybierz poziom trudności:");
        System.out.println("1 - Łatwy (1-50)");
        System.out.println("2 - Średni (1-100)");
        System.out.println("3 - Trudny (1-200)");
        int poziomTrudnosci = scanner.nextInt();

        int maxNumer = 0;
        int maxPodejsc = 0;

        switch (poziomTrudnosci) {
            case 1:
                maxNumer = 50;
                maxPodejsc = 10; // łatwy: 10 prób
                break;
            case 2:
                maxNumer = 100;
                maxPodejsc = 8;  // średni: 8 prób
                break;
            case 3:
                maxNumer = 200;
                maxPodejsc = 6;  // trudny: 6 prób
                break;
            default:
                System.out.println("Nieprawidłowy wybór. Program zakończony.");
                return;
        }

        int cel = random.nextInt(maxNumer) + 1;

        int podejscia = 0;
        int zgadniety = 0;

        while (zgadniety != cel && podejscia < maxPodejsc) {
            System.out.println("Zgadnij liczbę z zakresu 1-" + maxNumer + ":");
            zgadniety = scanner.nextInt();
            podejscia++;

            if (zgadniety > cel) {
                System.out.println("Za dużo!");
                giveHint(zgadniety, cel);
            } else if (zgadniety < cel) {
                System.out.println("Za mało!");
                giveHint(zgadniety, cel);
            } else {
                System.out.println("Gratulacje! Odgadłeś liczbę.");
                System.out.println("Liczba prób: " + podejscia);
            }

            if (podejscia == maxPodejsc && zgadniety != cel) {
                System.out.println("Niestety, nie udało się. Przekroczyłeś limit prób.");
                System.out.println("Liczba do odgadnięcia to: " + cel);
            } else {
                System.out.println("Pozostało prób: " + (maxPodejsc - podejscia));
            }
        }

        scanner.close();
    }

    public static void giveHint(int zgadniety, int cel) {
        int roznica = Math.abs(zgadniety - cel);

        if (roznica > 20) {
            System.out.println("Dużo za " + (zgadniety > cel ? "dużo" : "mało"));
        } else if (roznica > 10) {
            System.out.println("Trochę za " + (zgadniety > cel ? "dużo" : "mało"));
        } else if (roznica > 5) {
            System.out.println("Blisko! Jeszcze " + (zgadniety > cel ? "trochę za dużo" : "trochę za mało"));
        } else {
            System.out.println("Bardzo blisko! Jeszcze tylko kilka kroków.");
        }
    }
}
