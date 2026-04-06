public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    public String getTytul() {
        return tytul;
    }

    // getter autora
    public String getAutor() {
        return autor;
    }

    // getter liczby stron
    public int getLiczbaStron() {
        return liczbaStron;
    }

    // getter dostępności
    public boolean isDostepna() {
        return dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Dostępna: " + (dostepna ? "Tak" : "Nie"));
        System.out.println("----------------------");
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Książka już wypożyczona!");
        }
    }

    public void zwroc() {
        dostepna = true;
        System.out.println("Zwrócono: " + tytul);
    }
}