package day15_nestedlooparrays;

import java.util.Scanner;

public class Loop_Tekrar {
    /*
   1.Example:Type code to get the output like
                       Week: 1
                         Day: 1
                         Day: 2
                         Day: 3
                         .....
                       Week: 2
                         Day: 1
                         Day: 2
                         Day: 3
                         ....
                       Week: 3
                         Day: 1
                         Day: 2
                         Day: 3
                         ....
    */
    public static void main(String[] args) {


        for (int w = 1; w < 2; w++) {

            System.out.println("week: " + w);

            for (int d = 1; d < 2; d++) {

                System.out.println("   day : " + d);
            }

        }
        System.out.println("--------------------------------------------");

        int i = 1;
        while (i < 3) {
            System.out.println("week : " + i);

            int k = 1;
            while (k < 3) {
                System.out.println("   day : " + k);
                k++;
            }
            i++;
        }
        System.out.println("---------------------------------------------");
/*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
        Note: Get the number of the rows and the columns from user
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sira sayisi giriniz");
        int row = scan.nextInt();
        System.out.println("Lutfen kolon sayisini giriniz: ");
        int column = scan.nextInt();

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= column; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

 /*
        3.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
 */

        System.out.println("lutfen sira sayisi girin: ");
        int siraSayisi = scan.nextInt();

        for (int m  = 1; m <= siraSayisi; m++) {// m başlangıc kolonu
            for (int n = 1; n <= m; n++) { // n başlangıc sırası
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
