
/**
 *
 * @author sonja
 */
class Originator {
    private int state;

    public void setState(int state){
       this.state = state;
    }

    public int getState(){
       return state;
    }

    public Memento saveToMemento(){
       return new Memento(state);
    }

    public void getFromMemento(Memento memento){
       state = memento.getState();
    }
}
