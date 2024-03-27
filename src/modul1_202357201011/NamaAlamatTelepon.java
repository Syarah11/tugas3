
package modul1_202357201011;
public class NamaAlamatTelepon {
    public static void main(String[] args) {
        String data [][] = {
            {"nama\t\t", "alamat\t\t", "telepon\n"},
            {"ABDUL\t\t", "Kediri\t\t", "085646668991"},
            {"KUSNO\t\t", "Trenggalek\t", "085646668992"},
            {"PONIRAN\t\t", "Bojonegoro\t", "085646668999"},
        };
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++){
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
    }
    
}
