
/**
 *
 * @author sonja
 */
public class Controller {
    private Pokemon pokemon;

    public Controller() {
        pokemon = null;
    }
    
    public void setPokemon(Pokemon p) {
        pokemon = p;
    }
    
    public void getNimi(){
        System.out.println(pokemon.getNimi());
    }
    
    public void hit(){
        System.out.print("Hit: ");
        pokemon.hit();
    }
    
    public void revealWeaknesses(){
        System.out.print("Weaknesses: ");
        pokemon.revealWeaknesses();
    }
    
    public void getStats(){
        System.out.print("Stats: ");
        pokemon.getStats();
    }
    
    public void accept(PokemonVisitor visitor) {
        pokemon.accept(visitor);
    }
    
}
