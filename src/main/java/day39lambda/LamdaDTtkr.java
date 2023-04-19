package day39lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class LamdaDTtkr {
    public static void main(String[] args) {
        List<String> city = new ArrayList<>(Arrays.asList("VAN", "Edirne", "Ordu", "VAN",
                                                          "Izmir", "Eskisehir", "Safranbolu",
                                                          "Izmir", "MUS"));
        buyukHafleUzunlugaGoreArtanSırada(city);
        System.out.println();
        sonHarfeGoreArtanSırada (city);
        System.out.println();
        tumHarfBuyukArtanSıradaAlfabetikSırala(city);
        System.out.println();
        System.out.print(bestenBuyukElemanıSil(city));

    }

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    private static List<String > buyukHafleUzunlugaGoreArtanSırada(List<String> city) {
        System.out.print("1) ");
        city.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
        return city;
    }
    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    private static List<String> sonHarfeGoreArtanSırada(List<String> city) {
        System.out.print("2) ");
         city.
                 stream().
                 map(String::toLowerCase).
                 sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));
        return city;

    }
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    private static void tumHarfBuyukArtanSıradaAlfabetikSırala(List<String> city) {
        System.out.print("3) ");
        city.stream().distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(t-> System.out.print(t+ " "));
    }


    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz.
    private static List<String > bestenBuyukElemanıSil(List<String> city) {
        System.out.print("4) ");
         city.removeIf(t-> t.length()>5);
         return city;
    }





}
