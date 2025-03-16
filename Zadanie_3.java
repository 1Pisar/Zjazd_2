//3.Napisz funkcję, która przyjmuje jako parametr pozycję w ciągu
// Fibonacciego i zwraca wynik (liczbę) tej pozycji.
// Funkcja powinna mieć też wersję bez parametru i losować liczbę od 1 do 10
// dla której będzie policzony ciąg.

public class Zadanie_3 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void LosowaLiczba() {
        int n = (int) (Math.random() * 10) + 1;
        System.out.println("Losowa pozycja w ciągu Fibonacciego: " + n);
        System.out.println("Liczba Fibonacciego na tej pozycji: " + fibonacci(n));
    }

    public static void main(String[] args) {
        int pozycja = 5;
        System.out.println("Liczba Fibonacciego na pozycji " + pozycja + ": " + fibonacci(pozycja));

        LosowaLiczba();
    }
}