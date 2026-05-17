public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {

        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }


    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa() + (liczbaRepozytoriow * 100);
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " Jestem Programistą. Moim głównym językiem jest " + glownyJezyk + ".";
    }


    public void wypiszTechnologie() {
        System.out.println("-> " + getImie() + " koduje w: " + glownyJezyk + " i ogarnia " + liczbaRepozytoriow + " repozytoriów.");
    }

    @Override
    public String toString() {
        return super.toString() + " [Typ: Programista, Język: " + glownyJezyk + "]";
    }
}