public class Main {
  public static void main(String[] args) {

    // Tworzymy książki
    Ksiazka k1 = new Ksiazka("Wiedźmin", "Sapkowski", 300, true);
    Ksiazka k2 = new Ksiazka("Lalka", "Prus", 400, true);
    Ksiazka k3 = new Ksiazka("Harry Potter", "Rowling", 350, true);

    // Tworzymy czytelników
    Czytelnik c1 = new Czytelnik("Jan", "Kowalski", "123", 0);
    Czytelnik c2 = new Czytelnik("Anna", "Nowak", "456", 0);

    // Tworzymy bibliotekę
    Biblioteka biblioteka = new Biblioteka(10);

    // Dodajemy książki
    biblioteka.dodajKsiazke(k1);
    biblioteka.dodajKsiazke(k2);
    biblioteka.dodajKsiazke(k3);

    // Wyświetlamy dostępne książki
    biblioteka.wypiszDostepneKsiazki();

    // Wypożyczenie książki
    biblioteka.wypozyczKsiazke("Wiedźmin", c1);
    biblioteka.wypozyczKsiazke("Lalka", c2);

    // Ponowne wypisanie dostępnych książek
    biblioteka.wypiszDostepneKsiazki();

    // Zwrot książki
    biblioteka.zwrocKsiazke("Wiedźmin", c1);

    // Ostateczne wypisanie dostępnych książek
    biblioteka.wypiszDostepneKsiazki();
  }
}