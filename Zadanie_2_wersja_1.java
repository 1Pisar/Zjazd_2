//2.Napisz funkcję, która będzie przyjmowała jako parametr liczbę
//  całkowitą i będzie zwracała silnię.  Napisz ją w dwóch wersjach:
//  jedna powinna używać pętli a druga rekurencji.

public class Zadanie_2_wersja_1 {

    public static int silniaPetla(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        int liczba = 10;
        System.out.println("Silnia " + liczba + " to: " + silniaPetla(liczba));
    }
}
