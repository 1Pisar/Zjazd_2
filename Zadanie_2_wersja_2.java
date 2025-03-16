//2.Napisz funkcję, która będzie przyjmowała jako parametr liczbę
//  całkowitą i będzie zwracała silnię.  Napisz ją w dwóch wersjach:
//  jedna powinna używać pętli a druga rekurencji.

public class Zadanie_2_wersja_2 {

    public static int silniaRekurencja(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * silniaRekurencja(n - 1);
        }
    }

    public static void main(String[] args) {
        int liczba = (int) (Math.random() * 10) + 1;
        System.out.println("Silnia " + liczba + " to: " + silniaRekurencja(liczba));
    }
}