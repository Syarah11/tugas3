
package modul1_202357201011;
public class rata_rata {

    public static void main(String[] args) {
        // TODO code application logic here
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        double total = 0;
        double elment = 0;

        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
                total += data[a][b];
                elment++;

            }
            System.out.println("");
        }
        double rarata = total / elment;
        System.out.println("Rata rata = " + rarata);
    }
}
