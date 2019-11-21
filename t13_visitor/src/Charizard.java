/**
 *
 * @author sonja
 */
class Charizard implements Pokemon{
    int points = 0;
    
    @Override
    public String getNimi() {
        return "Charizard";
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
        System.out.println("Rock, Electric, Water");
    }
    
    @Override
    public void getStats() {
        System.out.println("HP 3, Attack 4, Defense 3, Special Attack 5, Special Defense 4, Speed 5");
    }

    @Override
    public void accept(PokemonVisitor visitor) {
        this.points += 5;
        visitor.visit(this);
    }
}
