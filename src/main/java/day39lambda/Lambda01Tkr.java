package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01Tkr {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        System.out.print("first: ");
        System.out.println(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printEleman(myList);
        System.out.println();
        tIleBaslayanHaricYazdır(myList);
        System.out.println();
        krkterSayısı4tenAzOlan(myList);
        System.out.println();
        krktrSayısı4tenCokOlanlarıbuyukHarfleYazdır(myList);
        System.out.println();
        tekrarsızVeKucukHarfleYazdır(myList);
        System.out.println();
        buyukHarfileAlfabetikSırayaGore(myList);
        System.out.println();
        buyukHarfileBuyuktenKucugeGoreSırala(myList);
        System.out.println();
        buyukKucukHarfleYazdıran(myList);



        }



    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
        public static void printEl(List<String>myList) {
            System.out.print("1) ");
            for (String w : myList) {
                System.out.print(w + " ");
            }
        }
    public static void printEleman(List<String>myList) {
        System.out.print("1.1) ");
        myList.
                stream().
                forEach(t-> System.out.print(t+ " "));
    }
    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void tIleBaslayanHaricYazdır(List<String>myList){
        System.out.print("2) ");
        myList.
                stream().
                filter(t-> !t.startsWith("T")).
                forEach(t-> System.out.print(t+ " "));
    }
    //Example 3: Bir List'te character sayisi 4'den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void krkterSayısı4tenAzOlan (List<String >myList){
        System.out.print("3) ");
        myList.
                stream().
                filter(t-> t.length()>4).
                forEach(t-> System.out.print(t+" "));// 4ten fazla
        System.out.println();
        System.out.print("3) ");
        myList.
                stream().
                filter(t-> t.length()<4).
                forEach(t-> System.out.print(t+" "));// 4ten az olan

    }
    //Example 4: Bir List'te character sayisi 4'den çok olan tum elemanlari büyük harflerle console'a yazdiran method'u olusturunuz.
        public static void krktrSayısı4tenCokOlanlarıbuyukHarfleYazdır(List<String>myList){
            System.out.print("4) ");
            myList.
                    stream().
                    filter(t-> t.length()>4).
                    map(t-> t.toUpperCase()).
                    forEach(t-> System.out.print(t+" "));
        }
    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle console'a yazdiran method'u olusturunuz.
    private static void tekrarsızVeKucukHarfleYazdır(List<String>myList) {
        System.out.print("5) ");
        myList.
                stream().
                filter(t-> t.length()>4).
                distinct().
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));

    }
    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    private static void buyukHarfileAlfabetikSırayaGore(List<String>myList) {
        System.out.print("6) ");
        myList.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));

    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle küçükten büyüğe siralayarak
    // console'a yazdiran method'u olusturunuz.
    private static void buyukHarfileBuyuktenKucugeGoreSırala(List<String> myList) {
        System.out.print("7) ");
        myList.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));

    }
    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
    private static List<String> buyukKucukHarfleYazdıran(List<String> myList) {
        System.out.print("8) ");
         myList.stream().map(t -> t.substring(0,1).toUpperCase() + t.substring(1)).
                forEach(t -> System.out.print(t + " "));

         return myList;

    }


}
