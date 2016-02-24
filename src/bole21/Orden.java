
package bole21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Orden {
    public String[] lista = new String[10];

    public void load() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = JOptionPane.showInputDialog("Palabra " + (i + 1) + ":");

        }
    }

    public void organize() {
        Arrays.sort(lista);
    }

    public void savefile() throws FileNotFoundException {
        organize();
        PrintWriter escritor = null;
        try {
            escritor = new PrintWriter(new File("nom.txt"));
            for(int i=0;i<lista.length;i++){
                escritor.println((i+1)+ " "+lista[i]);
            }
            
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");

        } finally {
            escritor.close();
        }

    }
}

    

