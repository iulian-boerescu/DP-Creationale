package Builder;

public class ContBancarBuilder implements Builder{
   private ContBancar cont;

   public ContBancarBuilder(ContBancar cont){
       this.cont = cont;
   }

   public void setContSalariu(){
        this.cont.setContSalariu(true);
   }

   public void setAreCard(){
       this.cont.setAreCard(true);
   }

   public void setAreInternetBanking(){
       this.cont.setAreInternetBanking(true);;
   }
    @Override
    public ContBancar getCont() {
        return cont;
    }
}
