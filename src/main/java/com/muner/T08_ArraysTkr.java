package com.muner;

import java.util.Arrays;

public class T08_ArraysTkr {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
    //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    //    s -> 5
    //    a -> 4
    //    e -> 3
    //    i -> 1
    //    o -> 0
    //    Test data
    //    hackerDili("java ile hersey guzel")
    //    j4v4 1l3 h3r53y guz3l
    //    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {
        String str = "java ile hersey guzel";

        //1.Yol
        hackerDili(str);
        //2.Yol
       // hackerDiliArrayForLoop(str);
    }

    private static void hackerDiliArrayForLoop(String str) {
        String[] array = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.substring(i, i + 1);
            //System.out.println(Arrays.toString(array));
            //System.out.println("-------------------------------------");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("s")) {
                array[i] = "5";
                //System.out.println(Arrays.toString(array));
                //System.out.println("-------------------------------------");
            }
            if (array[i].contains("a")) {
                array[i] = "4";
                //System.out.println(Arrays.toString(array));
                //System.out.println("-------------------------------------");
            }
            if (array[i].contains("e")) {
                array[i] = "3";
                //System.out.println(Arrays.toString(array));
               // System.out.println("-------------------------------------");
            }
            if (array[i].contains("i")) {
                array[i] = "1";
                //System.out.println(Arrays.toString(array));
                //System.out.println("-------------------------------------");
            }
            if (array[i].contains("o")) {
                array[i] = "0";
                //System.out.println(Arrays.toString(array));
                //System.out.println("-------------------------------------");
            }
            System.out.print(array[i]);
        }
    }

    private static void hackerDili(String str) {
        String hacker = str.replace("s", "5").replace("a", "4").replace("e", "3")
                .replace("i", "1").replace("o", "0");

        System.out.print(hacker);

        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0

    }
}
