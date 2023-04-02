import Builder.ContBancar;
import Builder.ContBancarBuilder;
import FactoryMethod.BancaFactory;
import FactoryMethod.PersoanaFizicaFactory;
import FactoryMethod.PersoanaJuridicaFactory;
import Singleton.*;

public class Main {
    public static void main(String[] args) {
        Facultate facultate = Facultate.getInstance();
        facultate.modificaSpecializarePrincipala(Specializari.INFO);
        System.out.println(facultate.specializari);
        Facultate fac = Facultate.getInstance();
        System.out.println(fac.specializari);
        Facultate fac2 = Facultate.getInstance();
        fac2.modificaNumarProfesori(101);
        System.out.println(fac2.afisare());
        System.out.println("\n");
        BancaFactory bf1, bf2;
        bf1 = new PersoanaFizicaFactory();
        bf1.creareObiect();

        bf2 = new PersoanaJuridicaFactory();
        bf2.creareObiect();


        ContBancar cb = new ContBancar("Ion", 2000, 2000, false, false, false);
        cb.setContSalariu(true);
        cb.setAreCard(true);
        cb.setAreInternetBanking(false);
        System.out.println(cb.toString());

        ContBancarBuilder cb1 = new ContBancarBuilder(cb);
        System.out.println(cb1.getCont());



    }
}