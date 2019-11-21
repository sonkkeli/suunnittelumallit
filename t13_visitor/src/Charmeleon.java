
/**
 *
 * @author sonja
 */
class Charmeleon implements Pokemon{
    int points = 0;

    @Override
    public String getNimi() {
        return "Charmeleon";
    }

    @Override
    public void hit() {
        System.out.println("Blaze strike");
    }
    
    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public void revealWeaknesses() {
        System.out.println("Ground, Rock, Water");
    }
    
    @Override
    public void getStats() {
        System.out.println("HP 3, Attack 3, Defense 3, Special Attack 4, Special Defense 3, Speed 4");
    }
    
    @Override
    public void accept(PokemonVisitor visitor) {
        this.points += 4;
        visitor.visit(this);
    }
}
