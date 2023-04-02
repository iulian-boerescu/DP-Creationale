package Builder;

public class ContBancar {
    String client;
    int nrCont;
    int suma;
    boolean contSalariu;
    boolean areCard;
    boolean areInternetBanking;

    public ContBancar(String ion, int i, int i1){

    }

    public ContBancar(String client, int nrCont, int suma, boolean contSalariu, boolean areCard, boolean areInternetBanking) {
        this.client = client;
        this.nrCont = nrCont;
        this.suma = suma;
        this.contSalariu = contSalariu;
        this.areCard = areCard;
        this.areInternetBanking = areInternetBanking;
    }

    public boolean isContSalariu() {
        return contSalariu;
    }

    public boolean isAreCard() {
        return areCard;
    }

    public boolean isAreInternetBanking() {
        return areInternetBanking;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    public void setAreCard(boolean areCard) {
        this.areCard = areCard;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "client='" + client + '\'' +
                ", nrCont=" + nrCont +
                ", suma=" + suma +
                ", contSalariu=" + contSalariu +
                ", areCard=" + areCard +
                ", areInternetBanking=" + areInternetBanking +
                '}';
    }
}
