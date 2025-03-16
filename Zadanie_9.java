//9.Przeanalizuj poniższy fragment kodu. Uruchom go i sprawdź jak zmieniają się
// wartości zmiennych. Poszukaj informacji i wyjaśnij (np. w komentarzu) które
// zmienne po wywołaniu funkcji mają zmienianą wartość a które nie i dlaczego (1 punkt)

public class Zadanie_9 {
    public static void main(String[] args) {
        // Tworzymy zmienną typu int i przypisujemy wartość 5
        int num = 5;

        // Wypisujemy wartość zmiennej num przed wywołaniem funkcji
        System.out.println("Wartość zmiennej: " + num);

        // Wywołanie funkcji changeValue z zmienną typu int
        // Funkcja ta zmienia lokalną kopię zmiennej num na wartość 10
        changeValue(num);

        // Wartość zmiennej num w main nie została zmieniona,
        // ponieważ zmienne typu prymitywnego są przekazywane przez wartość
        System.out.println("Wartość zmiennej po funkcji: " + num);

        // Tworzymy obiekt IntegerWrapper z wartością 5
        IntegerWrapper number = new IntegerWrapper(5);

        // Wypisujemy wartość obiektu number przed wywołaniem funkcji
        System.out.println("Wartość przed funkcją: " + number.getValue());

        // Wywołanie funkcji changeValue, która zmienia wartość wewnętrzną obiektu number
        changeValue(number);

        // Wartość obiektu number została zmieniona przez funkcję changeValue,
        // ponieważ obiekty są przekazywane przez referencję
        System.out.println("Wartość po funkcji: " + number.getValue());

        // Wywołanie funkcji change, która zmienia referencję do nowego obiektu,
        // ale nie zmienia oryginalnej referencji obiektu number w main
        change(number);

        // Wartość obiektu number nie została zmieniona przez funkcję change,
        // ponieważ funkcja ta zmienia tylko lokalną referencję, a nie referencję w main
        System.out.println("Wartość po funkcji: " + number.getValue());
    }

    // Funkcja zmienia wartość przekazaną jako parametr typu int
    public static void changeValue(int num) {
        // Zmienna num jest kopią zmiennej z main, więc jej zmiana nie wpływa na oryginalną zmienną
        num = 10;
        // Wartość zmiennej num w funkcji changeValue jest zmieniona tylko lokalnie
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num);
    }

    // Funkcja zmienia wartość wewnętrzną obiektu IntegerWrapper
    public static void changeValue(IntegerWrapper num) {
        // Zmieniamy wartość obiektu przekazanego do funkcji
        // Ponieważ obiekty są przekazywane przez referencję, zmiana wpływa na obiekt w main
        num.setValue(10);
    }

    // Funkcja zmienia referencję do nowego obiektu, ale nie wpływa na referencję w main
    public static void change(IntegerWrapper num) {
        // Tworzymy nowy obiekt IntegerWrapper, ale przypisanie zmienia tylko lokalną referencję w funkcji
        num = new IntegerWrapper(26);
    }
}

// Klasa opakowująca typ prymitywny int
class IntegerWrapper {
    private int value;

    // Konstruktor ustawiający wartość wewnętrzną obiektu
    public IntegerWrapper(int value) {
        this.value = value;
    }

    // Metoda zwracająca wartość wewnętrzną obiektu
    public int getValue() {
        return value;
    }

    // Metoda ustawiająca nową wartość wewnętrzną obiektu
    public void setValue(int value) {
        this.value = value;
    }
}