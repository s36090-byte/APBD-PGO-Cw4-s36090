public class Main {
  public static void main(String[] args) {

    Ksiazka k1 = new Ksiazka("Wiedźmin", "Sapkowski", 300, true);
    Ksiazka k2 = new Ksiazka("Pan Tadeusz", "Mickiewicz", 200, true);
    Ksiazka k3 = new Ksiazka("Lalka", "Prus", 400, false);

    Biblioteka biblioteka = new Biblioteka(5);

    biblioteka.dodajKsiazke(k1);
    biblioteka.dodajKsiazke(k2);
    biblioteka.dodajKsiazke(k3);

    biblioteka.wypiszDostepneKsiazki();

    Ksiazka szukana = biblioteka.znajdzKsiazkePoTytule("Lalka");
    if (szukana != null) {
      System.out.println("Znaleziono książkę: " + szukana.getTytul());
    }

    System.out.println("Liczba dostępnych książek: " + biblioteka.policzDostepneKsiazki());

    k1.wypiszInfo();
    // czytelnicy
    Czytelnik c1 = new Czytelnik("Jan", "Kowalski", "123", 0);
    Czytelnik c2 = new Czytelnik("Anna", "Nowak", "456", 2);

    // test metod
    c1.wypiszDane();
    c2.wypiszDane();

    c1.zwiekszLiczbeWypozyczen();
    c1.zwiekszLiczbeWypozyczen();

    c2.zmniejszLiczbeWypozyczen();

    // sprawdzenie po zmianach
    c1.wypiszDane();
    c2.wypiszDane();
    k2.wypiszInfo();
    k3.wypiszInfo();

    k1.wypozycz();
    k1.wypozycz(); // sprawdzenie co się stanie

    k1.zwroc();
    k1.wypiszInfo();
  }
}