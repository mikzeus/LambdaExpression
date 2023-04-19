package com.alistirma;

public class S011_Replace {
    public static void main(String[] args) {


        String b = "Ali 12 ?_";
        System.out.println(b);
        System.out.println(b.replaceAll("\\d", "*"));//d harfi, yanlızca rakamları değiştirir.

        System.out.println(b.replaceAll("\\D", "*"));//D harfi rakamlar hariç herşeyi değiştirir.

         System.out.println(b.replaceAll("\\S", "*"));//S harfi,herşeyi değiştirir.

         System.out.println(b.replaceAll("\\w", "*")); //w harfi, özel işaretler hariç herşeyi değiştirr
    }
}
