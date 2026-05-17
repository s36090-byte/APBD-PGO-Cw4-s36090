public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() { return czyAutomatyzujacy; }
    public int getLiczbaScenariuszy() { return liczbaScenariuszy; }


    @Override
    public double obliczKosztMiesieczny() {
        double koszt = getStawkaBazowa();
        if (czyAutomatyzujacy) {
            koszt += 1500.00;
        }
        return koszt;
    }

    @Override
    public String przedstawSie() {
        String rola = czyAutomatyzujacy ? "Tester Automatyzujący" : "Tester Manualny";
        return super.przedstawSie() + " Pracuję jako " + rola + ".";
    }


    public void uruchomRaportTestow() {
        System.out.println("-> [QA] Uruchamianie " + liczbaScenariuszy + " scenariuszy testowych przez " + getImie() + ".");
    }
}