
/**
 *
 * @author sonja
 */
public interface Pokemon {
    public String getNimi();
    public void revealWeaknesses();
    public void hit(); 
    public void getStats();
    public int getPoints();
    void accept(PokemonVisitor visitor);
}