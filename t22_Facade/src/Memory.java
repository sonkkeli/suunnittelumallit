
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonja
 */
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("ladataan muistipaikasta "+ position + " dataa, jonka pituus on "+ data.length);
    }
}
