package Singleton;

public class Facultate {
    String denumire;
    int nrStudenti;
    int nrProfesori;

    public Specializari specializari;

    private Facultate(String denumire, int nrStudenti, int nrProfesori) {
        this.denumire = denumire;
        this.nrStudenti = nrStudenti;
        this.nrProfesori = nrProfesori;
        this.specializari = Specializari.CIBE;
    }

    private static Facultate facultate;

    public static Facultate getInstance(){
        if (facultate == null){
            facultate = new Facultate("CSIE", 1200, 100);
            return facultate;
        } else{
            return facultate;
        }
    }

    public String afisare() {
        Facultate facultate = Facultate.getInstance();
        return "Facultatea " + facultate.denumire + " are un numar de " + facultate.nrStudenti + " studenti. Si un numar de " +
                facultate.nrProfesori + " profesori. Specializarea sa principala este:" + facultate.specializari;
    }

    public Facultate modificaNumarStudenti(int numarNouStudenti){
        Facultate facultate = Facultate.getInstance();
        facultate.nrStudenti = numarNouStudenti;
        return facultate;
    }

    public Facultate modificaNumarProfesori(int numarNouProfesori){
        Facultate facultate = Facultate.getInstance();
        facultate.nrProfesori = numarNouProfesori;
        return facultate;
    }

    public Facultate modificaSpecializarePrincipala(Specializari specializarePrincipala){
        Facultate facultate = Facultate.getInstance();
        facultate.specializari = specializarePrincipala;
        return facultate;
    }
}
