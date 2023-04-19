package com.muner;

import java.util.Arrays;
import java.util.Scanner;

public class T02_ArraysTkr {
      /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String s = scan.nextLine();

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        //alacan
        int counter =0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
                System.out.println(counter);
                System.out.println(i);
                System.out.println(Arrays.toString(arr));
                System.out.println("*****");
            } else {
                System.out.println(arr[i - 1] + "=" + (counter+1));
                counter = 0;
                System.out.println(counter);
                System.out.println(i);
                System.out.println(Arrays.toString(arr));
                System.out.println(".........................");
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "=" +(counter+1));
                System.out.println(counter);
                System.out.println(i);
                System.out.println(Arrays.toString(arr));
                System.out.println("++++++++++++++++++++++++++++++++++");
            }

        }

    }

}
