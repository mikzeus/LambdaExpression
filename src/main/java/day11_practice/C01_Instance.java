package day11_practice;

public class C01_Instance {

    //sayi, isim, ogrenciMi seklinde uc tane instance variable olusturalım.
    //Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

    int sayi;
    String isim;
    boolean ogrenciMi;

    public static void main(String[] args) {

        C01_Instance std= new C01_Instance();

        System.out.println(std.isim);
        System.out.println(std.ogrenciMi);
        System.out.println(std.sayi);

        ////////////////////////////////////////

        C01_Instance obj2 = new C01_Instance();
        std.isim="Hasan";
        obj2.isim="Huseyin";
        System.out.println(std.isim);  // Hasan
        std.sayi=20;
        obj2.sayi=25;
        System.out.println(obj2.sayi); // 25
        System.out.println(std.sayi); // 20

        // instance variable'lar objeye baglıdır.
        // hangi obje uzerinden degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar.


    }

}
