package day36_exceptions;

public class E03 {
/*
        Biz method olustururken bazi sartlari icine yazabiliriz. Kodumuzu negatif senaryolara gore exception almak icin
    olusturabiliriz.

    Kodumuzdan dolayi olusan exception'i nasil hallederiz? Kodumuz icinde throw new IllegalArgumentException yazarak javaya
    olumsuz bir durum halinde exception vermesini istemis olduk. Ancak IllegalArgumentException javanin exception'i
    olup biz bu exception'in verilmesini istedigimizde kodumuzla saglayabiliriz.

 */
    public static void main(String[] args) {
        printAge(23);
        try {
            printAge(-12);
        } catch (IllegalArgumentException e) {
            System.out.println("Do not valid age");
        }
    }

    //Ex:Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz
    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("hey ne yapıyorsun !!!");
        }
        System.out.println(age);

    }

}
