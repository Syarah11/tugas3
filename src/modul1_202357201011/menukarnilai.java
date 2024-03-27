
package modul1_202357201011;

import java.util.Arrays;
import javax.swing.*;

public class menukarnilai {
   public static void main(String[] args) {
        int data[][]
                = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}
                };
        JOptionPane.showInternalConfirmDialog(null,Arrays.deepToString(data));
        int baris = Integer.parseInt(JOptionPane.showInputDialog( "masukkan Baaris"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog( "masukkan Kolom"));
        int nilaibaru = Integer.parseInt(JOptionPane.showInputDialog("masukkan Nilai Baru"));
        if (baris >= 0 && baris < data.length && kolom < data[0].length) { 
            data[baris][kolom] = nilaibaru;
            JOptionPane.showInternalMessageDialog(null, "nilai pada index" + " ( " + baris + " , " + kolom + " ) " + " diubah menjadi " + nilaibaru);
            JOptionPane.showInternalConfirmDialog(null,Arrays.deepToString(data));
        } else {
            JOptionPane.showInternalMessageDialog(null, "index"+"("+baris+","+kolom+")"+"tidak terdaftar");
            
        }
        
   }
}
  

