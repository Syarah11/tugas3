
package modul1_202357201011;
public class AngkaGanjil {
        public static void main(String[] args) {
      
       int data [][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
       int JumlahData = 0;
            System.out.println(" kolom Ganjil : ");
       for (int a = 0; a < data.length; a++) {
           for (int b = 0; b < data [0].length; b++) {
               if (b % 2 == 0) {
                   System.out.print(data[a][b] + " ");
                   JumlahData += data[a][b];
               }
           }
           System.out.println();
      }
            System.out.println("jumlah elemen pada kolom ganjil = " + JumlahData); 
   }
    
}
