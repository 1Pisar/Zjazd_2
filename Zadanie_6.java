//6.Napisz funkcję, która przyjmuje dowolną liczbę parametrów tego
// samego typu - liczb całkowitych bądź zmiennoprzecinkowych i wypisuje
// ich medianę, średnią oraz sumę.

import java.util.Arrays;
import java.util.Random;

public class Zadanie_6 {

    public static void obliczStatystyki(int liczbaElementow) {
        Random rand = new Random();

        int[] liczby = new int[liczbaElementow];
        for (int i = 0; i < liczbaElementow; i++) {
            liczby[i] = rand.nextInt(100);
        }

        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }

        double srednia = suma / (double) liczbaElementow;

        Arrays.sort(liczby);
        double mediana;
        int n = liczby.length;
        if (n % 2 == 0) {
            mediana = (liczby[n / 2 - 1] + liczby[n / 2]) / 2.0;
        } else {
            mediana = liczby[n / 2];
        }

        System.out.println("Liczby: " + Arrays.toString(liczby));
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }

    public static void obliczStatystyki(double liczbaElementow) {
        Random rand = new Random();

        double[] liczby = new double[(int) liczbaElementow];
        for (int i = 0; i < liczbaElementow; i++) {
            liczby[i] = rand.nextDouble() * 100;
        }

        double suma = 0;
        for (double liczba : liczby) {
            suma += liczba;
        }

        double srednia = suma / liczbaElementow;

        Arrays.sort(liczby);
        double mediana;
        int n = liczby.length;
        if (n % 2 == 0) {
            mediana = (liczby[n / 2 - 1] + liczby[n / 2]) / 2.0;
        } else {
            mediana = liczby[n / 2];
        }

        System.out.println("Liczby: " + Arrays.toString(liczby));
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }

    public static void main(String[] args) {
        System.out.println("Statystyki dla losowych liczb całkowitych:");
        obliczStatystyki(10);

        System.out.println("\nStatystyki dla losowych liczb zmiennoprzecinkowych:");
        obliczStatystyki(10.0);
    }
}