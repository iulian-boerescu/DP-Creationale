package FactoryMethod;

public class PersoanaJuridica implements Banca{

    public PersoanaJuridica() {
        System.out.println("Juridica");
    }

    @Override
    public void descriereClient() {
        System.out.println("Persoana Juridica");
    }
}
