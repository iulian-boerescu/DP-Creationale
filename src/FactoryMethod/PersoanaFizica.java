package FactoryMethod;

public class PersoanaFizica implements Banca{

    public PersoanaFizica() {
        System.out.println("Fizica");
    }

    @Override
    public void descriereClient() {
        System.out.println("Persoana Fizica");
    }
}
