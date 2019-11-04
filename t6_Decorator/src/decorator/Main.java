package decorator;

/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza julia = new Ananas(new Kinkku(new Aurajuusto(new Katkarapu(new PizzaPohja()))));
        Pizza mozarella = new Pesto(new MozzarellaJuusto(new PizzaPohja()));
        Pizza quattroStagioni = new Katkarapu(new Kinkku(new Tonnikala(new Herkkusieni(new PizzaPohja()))));
        
        Menu m = new Menu();
        
        m.addToMenu(julia);
        m.addToMenu(mozarella);
        m.addToMenu(quattroStagioni);
        
        m.tulostaMenu();
    }
}
