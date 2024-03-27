
package modul1_202357201011;

import javax.swing.JOptionPane;

public class MenukarNilai_ {
    public static void main(String[] args) {
        int data[][]
                = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}
                };
        System.out.println("Array Lama : ");
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
        int baris = Integer.parseInt(JOptionPane.showInputDialog("masukkan baris: "));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("masukkan kolom: "));

        int nilai_baru = Integer.parseInt(JOptionPane.showInputDialog("masukan nilai baru"));
        data[baris][kolom] = nilai_baru;
        System.out.println("Array Baru : ");
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
    }
    
 }
