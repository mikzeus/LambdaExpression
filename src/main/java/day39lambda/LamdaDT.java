package day39lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaDT {
    /*  1)Lambda; method create etme degil mevcut method'lari library'den cagirip kullanmaktir
     2)Java 8 ile eklenmistir
     3)Functional Programming dir. Mimari yapiya onem vermez
     4)Hiz , Clean Code ve okunabilirlik acisindan onemlidir
     5) Mapler ile çalışmıyor
     */
    public static void main(String[] args) {

        List<String> city = new ArrayList<>(Arrays.asList("VAN", "Edirne", "Ordu", "VAN",
                "Izmir", "Eskisehir", "Safranbolu",
                "Izmir", "MUS"));

        printElement(city);
        System.out.println();
        printElements(city);
        System.out.println();
        printExclude(city);
        System.out.println();
        printExclude1(city);
        System.out.println();
        printCharecterOfFour(city);
        System.out.println();
        printCharecterOfFour1(city);
        System.out.println();
        printCharecterOfUnique(city);
        System.out.println();
        printCharecterOfUniqueToBigLetter(city);
        System.out.println();
        printCharecterOfUniqueToSort(city);
        System.out.println();
        printCapitalizedFirstLetter(city);
        System.out.println();
        CapitalizedFirstLetter(city);
        System.out.println();
        System.out.println(ilkHarfEveyaS(city));

    }


    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
    public static void printElement(List<String> city) {
        System.out.print("ı.yol) ");
        for (String w : city) {
            System.out.print(w + " ");
        }

    }
    //2.Yol:LAMBDA

    public static void printElements(List<String> city) {
        System.out.print("II.yol) ");
        city.
                stream().// bilgiyi akışa sundu.
                forEach(t -> System.out.print(t + " "));
    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printExclude(List<String> city) {
        System.out.print("2) ");
        city.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }

    // E ile başlayanlar yazdır
    public static void printExclude1(List<String> city) {
        System.out.print("2.1) ");
        city.
                stream().
                filter(t -> t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));
    }


    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printCharecterOfFour(List<String> city) {
        System.out.print("3) ");
        city.
                stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printCharecterOfFour1(List<String> city) {
        System.out.print("4) ");
        city.stream().
                filter(t -> t.length() > 4).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void printCharecterOfUnique(List<String> city) {
        System.out.print("5) ");
        city.
                stream().
                distinct().
                filter(t-> t.length()>4).
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printCharecterOfUniqueToBigLetter(List<String> city) {
        System.out.print("6) ");

        city.
                stream().
                distinct().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }



    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printCharecterOfUniqueToSort(List<String> city) {
        System.out.print("7) ");
        city.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
    }

    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
    public static void printCapitalizedFirstLetter(List<String> city) {
        System.out.print("8) ");
        city.
                stream().
                forEach(t -> System.out.print(t.substring(0, 1).
                        toUpperCase() + t.substring(1).
                        toLowerCase() + " "));

    }
    // II.yol
    public  static List<String> CapitalizedFirstLetter(List<String> city){
        System.out.print("8.1) ");
             city.
                stream().
                map(t-> t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase()).
                forEach(t -> System.out.print(t + " "));
             return city;

    }
    // Example 9: Ilk Harfi "E" veya "S" olanlari Liste halinde yazdiran methodu olusturunuz

    public static List<String > ilkHarfEveyaS(List<String> city){

        System.out.print("9) ");
        return city.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).collect(Collectors.toList());


    }
}

