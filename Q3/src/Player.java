public class Player {

    private String user;
    private int apostas;
    private int vitorias;


    public Player(){

    }

    public Player(String user, int apostas){
        this.user = user;
        this.apostas = apostas;
        this.vitorias = 0;
    }

    public int getApostas() {
        return apostas;
    }

    public void setApostas(int apostas) {
        this.apostas = apostas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


   public void addVitoria(){
        vitorias++;
   }

   public boolean verificarUser(Player p){
        return this.user.equalsIgnoreCase(p.user); //verifico o user ignorando as diferenças de maiusculo e minusculo
   }

   @Override
    public String toString(){ // não lembro se deveria colocar no UML
        return user + ": " + vitorias + ".";
   }
}
