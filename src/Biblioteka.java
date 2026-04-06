public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    // konstruktor: ustawia maksymalny rozmiar tablicy
    public Biblioteka(int maksRozmiar) {
        ksiazki = new Ksiazka[maksRozmiar];
        liczbaKsiazek = 0;
    }

    // dodaje książkę do biblioteki
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano książkę: " + ksiazka.getTytul());
        } else {
            System.out.println("Brak miejsca na kolejną książkę!");
        }
    }

    // wypisuje wszystkie dostępne książki
    public void wypiszDostepneKsiazki() {
        System.out.println("Dostępne książki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                System.out.println("- " + ksiazki[i].getTytul() + " (" + ksiazki[i].getAutor() + ")");
            }
        }
        System.out.println("-------------------");
    }

    // szuka książki po tytule
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null; // brak książki
    }

    // liczy dostępne książki
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }
}