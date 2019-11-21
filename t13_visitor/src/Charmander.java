
/**
 *
 * @author sonja
 */
class Charmander implements Pokemon{
    int points = 0;
    
    @Override
    public String getNimi() {
        return "Charmander";
    }
    
    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public void hit() {
        System.out.println("Blaze strike");
    }

    @Override
    public void revealWeaknesses() {
        System.out.println("Ground, Rock, Water");
    }
    
    @Override
    public void getStats() {
        System.out.println("HP 2, Attack 3, Defense 2, Special Attack 3, Special Defense 2, Speed 4");
    }
    
    @Override
    public void accept(PokemonVisitor visitor) {
        this.points += 3;
        visitor.visit(this);
    }
}
