
import java.util.*;


/**
 *
 * @author sonja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testA();
        nukuValissa();
        
        testB();
        nukuValissa();
        
        testC();
        nukuValissa();
        
        testD();
    }
    
    public static void nukuValissa(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    
    // Tutki kuinka Javan iteraattori käyttäytyy, jos yritetään iteroida 
    // kokoelmaa kahdella säikeellä yhtä aikaa, kun molemmilla on oma iterattori.
    public static void testA(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> i1 = list.iterator();
        Iterator<Integer> i2 = list.iterator();
        
        new Thread(() -> {
            String temp = "";
            while(i1.hasNext()) temp += i1.next();
            System.out.println("Onnistuiko testi A, osa1: " + temp.equals("123"));
        }).start();

        new Thread(() -> {
            String temp = "";
            while(i2.hasNext()) temp += i2.next();
            System.out.println("Onnistuiko testi A, osa1: " + temp.equals("123"));
        }).start();
    }
    
    // entä, jos säikeet käyttävät samaa iteraattoria vuorotellen?
    public static void testB(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> i = list.iterator();
        
        new Thread(() -> {
            String temp = "";
            while(i.hasNext())i.next();
            System.out.println("Onnistuiko testi B, osa1: " + temp.equals("123"));
        }).start();
        
        new Thread(() -> {
            String temp = "";
            while(i.hasNext()) i.next();
            System.out.println("Onnistuiko testi B, osa2: " + temp.equals("123"));
        }).start();
    }
    
    //Kuinka käy, jos kokoelmaan tehdään muutoksia iteroinnin läpikäynnin aikana?
    public static void testC(){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> i = arr.iterator();
        boolean success = true;        
        try {
            i.next();
            arr.add(1);
            i.next();
        } catch (ConcurrentModificationException e){
            success = false;
        }        
        System.out.println("Onnistuiko testi C: " + success);
    }

    // Keksi jotain muuta testattavaa: iteraattoreita iteroiva iteraattori
    public static void testD(){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        List<Iterator<?>> arr2 = new ArrayList<>();
        arr2.add(arr.iterator());
        arr2.add(arr.iterator());
        arr2.forEach(i -> i.forEachRemaining(j -> System.out.print(j)));
        System.out.println("\nOnnistuiko testi D: " + true);
    }    
}
