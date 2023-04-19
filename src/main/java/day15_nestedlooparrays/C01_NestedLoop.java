package day15_nestedlooparrays;

import java.util.Scanner;

public class C01_NestedLoop {
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


        //Nested for-loop
        for (int i = 1; i < 3; i++) {
            System.out.println("Week: " + i); // week tarafını yazdırır
            for (int k = 1; k < 4; k++) { // day tarafını yazdırır
                System.out.println("   Day: " + k);
            }
        }
        System.out.println("*****************************");

        //Nested while-loop
        int i = 1;
        while (i < 3) {
            System.out.println("Week: " + i);
            int k = 1;
            while (k < 4) {
                System.out.println("   Day: " + k);
                k++;
            }
            i++;
        }
/*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
        Note: Get the number of the rows and the columns from user
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int row = scan.nextByte();
        int column = scan.nextByte();

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
        System.out.println("Pls enter Row Number");
        int row1 = scan.nextInt();

        for (int m = 1; m <= row1; m++) {

            for (int n = 1; n<=m; n++){
                System.out.print(n + " ");
            }
            System.out.println();

        }


    }//main
}//class
