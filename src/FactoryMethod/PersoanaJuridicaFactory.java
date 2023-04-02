package FactoryMethod;

public class PersoanaJuridicaFactory implements BancaFactory{
    @Override
    public Banca creareObiect() {
        return new PersoanaJuridica();
    }
}
