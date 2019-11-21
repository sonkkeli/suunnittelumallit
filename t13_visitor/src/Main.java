
/**
 * each visitor increases the points of a pokemon
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();
        Pokemon c1 = new Charmander();
        Pokemon c2 = new Charmeleon();
        Pokemon c3 = new Charizard();
        
        c.setPokemon(c1);
        getDetails(c);
        System.out.println("-----------------------");
        
        c.setPokemon(c2);
        getDetails(c);
        System.out.println("-----------------------");
        
        c.setPokemon(c3);
        getDetails(c);
        
        System.out.println("-----------------------");
        PointsVisitor visitor = new PointsVisitor();        
        
//        c1.accept(visitor);
//        c1.accept(visitor);
//        c1.accept(visitor);
        c1.accept(visitor);
        double c1Points = visitor.getPoints();
        System.out.println("Charmander: " + c1Points);
        
//        c2.accept(visitor);
//        c2.accept(visitor);
        c2.accept(visitor);
        double c2Points = visitor.getPoints();        
        System.out.println("Charmeleon: " + c2Points);
        
//        c3.accept(visitor);
        c3.accept(visitor);
        double c3Points = visitor.getPoints();        
        System.out.println("Charizard: " + c3Points);
        
    }
    private static void getDetails(Controller c) {
        c.getNimi();
        c.revealWeaknesses();
        c.hit();
        c.getStats();
    }
}
