package day16_arraysforeachloop;

import java.util.Arrays;

public class C04_ArrayKacHarfli {
    public static void main(String[] args) {

        // verilen bir cümlede kaç kelime olduğunu gösteren kodu yazınız...

        String s = "Java is easy. Learn Java earn money.";
        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        // verilen bir cümlede kaç harf olduğunu gösteren kodu yazınız..
        String str []=s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

















    }
}
