/**
 *
 * @author sonja
 */
public class PointsVisitor implements PokemonVisitor {    
    private int points;
    
    public PointsVisitor() {
        this.points = 0;
    }

    public double getPoints() {
        return points;
    }
    
    @Override
    public void visit(Charmander charmander) {
        points = charmander.getPoints();
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        points = charmeleon.getPoints();
    }

    @Override
    public void visit(Charizard charizard) {
        points = charizard.getPoints();
    }
    
}
