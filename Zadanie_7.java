//7.Poszukaj informacji na jakich typach jest możliwy switch w Javie a na jakich w C++.
// Napisz przykładowy kod z instrukcją switch w Javie na typie, na którym to nie jest
// możliwe do zrobienia w C++.

/*
Instrukcja switch w Javie i C++
    Java:
    W Javie instrukcja switch obsługuje następujące typy:

        Typy całkowite:
            byte, short, int, char
        Typy wyliczeniowe (enum):
            Typy wyliczeniowe (enum) w Javie są również obsługiwane przez switch.
        Typy referencyjne (String):
            String – od Javy 7 jest możliwe używanie obiektów typu String w instrukcji switch.

    C++:
    W C++ instrukcja switch działa tylko dla następujących typów:

    Typy całkowite:
        char, int, short, long itp.
    Typy wyliczeniowe (enum):
        Typy wyliczeniowe (enum) są również obsługiwane.

W C++ instrukcja switch nie działa na typach takich jak String czy inne obiekty, jak to jest możliwe w Javie.
*/

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Zadanie_7 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Jest poniedziałek!");
                break;
            case TUESDAY:
                System.out.println("Jest wtorek!");
                break;
            case WEDNESDAY:
                System.out.println("Jest środa!");
                break;
            case THURSDAY:
                System.out.println("Jest czwartek!");
                break;
            case FRIDAY:
                System.out.println("Jest piątek!");
                break;
            case SATURDAY:
                System.out.println("Jest sobota!");
                break;
            case SUNDAY:
                System.out.println("Jest niedziela!");
                break;
            default:
                System.out.println("Nieznany dzień");
                break;
        }
    }
}