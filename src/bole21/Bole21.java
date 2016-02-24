
package bole21;

import java.io.FileNotFoundException;

/**
 *
 * @author julian
 */
public class Bole21 {

  
    public static void main(String[] args) throws FileNotFoundException {
        Orden obx= new Orden();
        obx.load();
        obx.savefile();
        
    }
    
}
