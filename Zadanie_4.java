//4.Napisz funkcję, która przyjmuje dwie liczby całkowite jako
// parametry i wypisuje liczby nieparzyste. Wypisywanie powinno
// się zaczynać od pierwszego parametru i kończyć na drugim.
// Jeżeli drugi parametr jest mniejszy od pierwszego, to powinny
// być wypisane od największej do najmniejszej.


import java.util.Scanner;

public class Zadanie_4 {

    public static void wypiszNieparzyste(int a, int b) {
        if (a <= b) {
            System.out.println("Liczby nieparzyste od " + a + " do " + b + ":");
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("\nLiczby nieparzyste od " + a + " do " + b + ":");
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = scanner.nextInt();

        wypiszNieparzyste(a, b);
    }
}
