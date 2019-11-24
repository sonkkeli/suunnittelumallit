/**
 *
 * @author sonja
 */
public class HardDrive {
    public byte[] read(long lba, int size) { 
        System.out.println("luetaan kovalevyltä dataa " + lba + " jonka koko on "+ size);
        return new byte[size];
    }
}
