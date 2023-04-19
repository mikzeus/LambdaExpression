package day40_lambda;

import day41_lambda.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String >iller = new ArrayList<>(Arrays.asList("Van","izmir","MUS","Gumushane",
                                                            "MUS","Kutahya","Ankara",
                                                            "Ordu","Gaziantep","izmir","Hatay","Edirne"));
        buyukHarfeGoreSırala(iller);
        System.out.println();
        buyukHarfleSonHarfeGoreSırala(iller);
        System.out.println();
        bykHrfleSonHarfinUzunlugunaGoreSırala(iller);
        System.out.println();
        //System.out.print(KrkterSays5tenFzlysSil(iller));
        System.out.println();
       // System.out.println(hIleBaslayanRileBitenElemanlariSil(iller));
        System.out.println();
        System.out.println(karakterSayilarininKareleriniAl(iller));
        System.out.println();
        System.out.println(karakterSayisiCiftOlanlariListYazdir(iller));
        System.out.println();


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
public static void buyukHarfeGoreSırala( List<String >iller){
    System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(t-> System.out.print(t + " "));
}
    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void buyukHarfleSonHarfeGoreSırala( List<String >iller) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).
                forEach(t -> System.out.print(t + " "));
    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfleSonHarfinUzunlugunaGoreSırala( List<String >iller) {
        System.out.print("3) ");
        iller.stream().
                distinct().
                map(String::toUpperCase).//Method referance
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                //Once uzunluklarina gore siraladik.thenComparing() ile natural order'a gore siraladik
                forEach(System.out::println);
        //Lambda expression'da ==> forEach(t -> System.out.print(t + " ")); seklinde yazilir
        // Method Referance() ==> forEach(System.out::println); seklinde yazilir
    }

    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz.
    /*public static List<String> KrkterSays5tenFzlysSil( List<String >iller) {
        System.out.print("4) ");

        iller.removeIf(t-> t.length()>5); //[Van, MUS, MUS, Ordu, Hatay]
        return iller;

    }


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanRileBitenElemanlariSil( List<String >iller) {
        System.out.print("5 ");
        iller.removeIf(t-> t.startsWith("H")|| t.endsWith("u"));
        return iller;

    }

     */


    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin


    public static List<Integer> karakterSayilarininKareleriniAl(List<String> iller ){
        System.out.print("6) ");
        return iller.
                stream().
                map(t->t.length() * t.length()).// LAMBDA EXPRESSION   map(t->t.length() * t.length()).
                        collect(Collectors.toList());
    }


    ////////////////////// ************************************************ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String> iller ) {
        System.out.print("7) ");
        return  iller.
                stream().
                filter(t->t.length() %2 ==0).//Lambda expression filter(t->t.length() %2 ==0).
                        collect(Collectors.toList());
    }



}
