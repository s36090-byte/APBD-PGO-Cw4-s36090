public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;

    // konstruktor
    public Czytelnik(String imie, String nazwisko, String numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    // wypisanie danych
    public void wypiszDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer karty: " + numerKarty);
        System.out.println("Liczba wypożyczeń: " + liczbaWypozyczen);
        System.out.println("----------------------");
    }

    // zwiększanie liczby wypożyczeń
    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
        System.out.println(imie + " wypożyczył/a książkę.");
    }

    // zmniejszanie liczby wypożyczeń
    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
            System.out.println(imie + " zwrócił/a książkę.");
        } else {
            System.out.println("Brak wypożyczeń do zmniejszenia.");
        }
    }
}