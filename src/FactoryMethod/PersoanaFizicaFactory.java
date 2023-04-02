package FactoryMethod;

public class PersoanaFizicaFactory implements BancaFactory{
    @Override
    public Banca creareObiect() {
        return new PersoanaFizica();
    }
}
