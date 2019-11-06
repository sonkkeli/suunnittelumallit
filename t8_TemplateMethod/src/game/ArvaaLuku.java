package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sonja
 */
public class ArvaaLuku extends Game {
    private int arvaukset = 0;
    private int voitotPelaaja = 0;
    private int voitotTietokone = 0;    

    @Override
    void initializeGame() {
        System.out.println("Peli alkaa, pelissä koitetaan arvata "
                + "tietokoneen arpoma luku välillä 0-10, "
                + "+-1 tarkkuudella.\n");
    }

    @Override
    void makePlay(int player) {
        Scanner lukija = new Scanner(System.in);
        Random r = new Random();
        int luku = r.nextInt(11);
        System.out.println("Arvaa tietokoneen arpoma luku: ");
        int arvaus = Integer.parseInt(lukija.nextLine());
        
        String oikein = "väärin";
        if (arvaus -1 <= luku && luku <= arvaus +1){
            voitotPelaaja++;
            oikein = "oikein";
        } else {
            voitotTietokone++;
        }
        
        System.out.println("Erän tulos: tietokone arpoi luvun " 
                + luku + " ja pelaaja arvasi " + oikein + " luvulla " + arvaus + "\n");
        
        arvaukset++;        
    }

    @Override
    boolean endOfGame() {
        if (arvaukset == 5) return true;
        else return false;
    }

    @Override
    void printWinner() {
        if (voitotPelaaja > voitotTietokone) System.out.println("Pelaaja voitti");
        else System.out.println("Tietokone voitti");
    }
    
}
