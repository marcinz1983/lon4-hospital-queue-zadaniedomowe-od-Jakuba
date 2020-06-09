package pl.sda;

public class Main {

    public static void main(String[] args) {
        /*
            Twoim zadaniem jest napisanie aplikacji służącej do decydowania o kolejności przyjęć w szpitalu.
            Aplikacja powinna pozwalać na:
                a Rejestrację nowego pacjenta, chyba ze dlugosc kolejki jest wieksza niz 20
                b Wyświetlanie aktualnego stanu kolejki (kto w niej stoi, nieposortowane, jaka jest długa)
                c Pobieranie następnej osoby z kolejki
                d Podglądanie kto jest następny w kolejce
                e Posiadać tryb demo w którym:
                f zamiast ręcznie dodawać osoby aplikacja będzie startowała z 10 osobami w kolejce

            1. Utwórz klasę Patient mającą pola:
                * imie (String)
                * nazwisko (String)
                * jakBardzoZly (int) - opisuje poziom zlosci
                * rozpoznanaChoroba (String)
                * pamietaj o angielskich nazwach, konstruktorze, getterach i setterach jesli potrzebujesz
            2. Utwórz klasę HospitalQueue, która
               a ma pole tablicę o wielkości 20 (maksymalna długość kolejki) (patientQueue)
               b utwórz metodę add(Patient) -> dodaje pacjenta
               c utwórz metodę Patient next() -> zwracającą kolejną osobę z kolejki i usuwającą ją z niej
               d Patient peek() -> podglądającą kto jest (zwraca kolejną osobę bez usuwania jej z kolejki)
            3. W main stwórz menu:
                a Następny - wywołujące next i wypisujące co zostało z tego next zwrócone
                b Kto następny - wywołujące peek() i wypisujące kto jest następny
                c Nowy pacjent - umożliwiające podanie imienia, nazwiska, złości i rozpoznanej choroby, a następnie wrzucające to na kolejkę (te dane pobierz za pomocą Scannera)
            4.* Zamiast przechowywac rozpoznana chorobe w Stringu trzymaj ja jako klase - razem
            5. Tryb demo:
                a Co 2 sekundy aplikacja dodaje losową osobę (losujemy imię, nazwisko, chorobę z tablicy, jak bardzo zły - losujemy liczbę)
                b Co 2 sekundy + random max 1s aplikacja przyjmuje pacjenta
            6. Zamiast przyjmować pacjentów w kolejności naturalnej przyjmuj ich według priorytetu:
                a Metoda next powinna zwracać najpierw osoby o nazwisku “Kowalski” (to nazwisko ordynatora),
                   ** pomyśl w przyszłości o ładowaniu jej z pliku properties za pomocą klasy Properties
                b w następnej kolejności powinna zwracać osoby z czymś poważnym (nazwa choroby "cos powaznego")
                c dalej osoby, których iloczyn jakBardzoZly i zaraźliwość będzie wyższy


         */
        HospitalQueue hospitalQueue = new HospitalQueue();

        Patient pacjentMain = new Patient("marcin","zielinski",4,"kaszel");
        hospitalQueue.add(pacjentMain);

        System.out.println(hospitalQueue.toString());
















    }
}
