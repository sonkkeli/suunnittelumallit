
/**
 *
 * @author sonja
 */
class Pelaaja {
    private String nimi;
    private Memento state;
    
    public Pelaaja(String nimi){
        this.nimi = nimi;
    }
    
     public Memento getState() {
        return this.state;
    }

    public void setState(Memento state) {
        this.state = state;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
       return "Pelaaja: " + nimi;
    }
}
