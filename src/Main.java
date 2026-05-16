public class Main {
    public static void main(String[] args) {
        zespolprojektowy zespol = new zespolprojektowy("Aplikacja mobilna E-Commerce");

        Pracownik p1 = new Programista("P001", "Jan", "Kowalski", 8000, "Java", 5);
        Pracownik t1 = new Tester("T001", "Anna", "Nowak", 6000, true, 45);
        Pracownik t2 = new Tester("T002", "Piotr", "Wiśniewski", 5000, false, 20);

        zespol.dodajPracownika(p1);
        zespol.dodajPracownika(t1);
        zespol.dodajPracownika(t2);

        zespol.wypiszSkladZespolu();
        System.out.println("\nŁączny miesięczny koszt zespołu: " + zespol.policzLacznyKoszt() + " PLN");

        zespol.wypiszTesterowAutomatyzujacych();

        System.out.println("\n--- Wywołanie metod specyficznych (Rzutowanie) ---");
        Pracownik znaleziony = zespol.znajdzPoId("P001");
        if (znaleziony instanceof Programista) {
            Programista dev = (Programista) znaleziony;
            dev.wypiszTechnologie(); // Metoda niedostępna bezpośrednio z poziomu klasy Pracownik
        }

        System.out.println("\n--- Test metody equals() ---");
        Pracownik klonPracownika = new Pracownik("P001", "InneImie", "InneNazwisko", 0);

        System.out.println("Czy p1 jest taki sam jak klonPracownika (to samo ID)? " + p1.equals(klonPracownika));
        System.out.println("Czy p1 jest taki sam jak t1? " + p1.equals(t1));
    }
}