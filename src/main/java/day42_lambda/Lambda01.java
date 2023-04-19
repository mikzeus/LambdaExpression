package day42_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));

        System.out.println(atLeastOneLengthLessThanFour(names));
    }
    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//Normalde distinct elemanlari depolamak icin "Set" kullanilir.
        //ama Lambda'daki collect(Collectors.toSet()); method'u elemanlari
        //rastgele siralar  halbuki bu soruda rastgele siralama kabul edilmiyor.
        //Bu yuzden mecburen collect(Collectors.toList());
    }

    //Example 2: List elemanlarini character sayilarina gore ters sirada'da kucuk harfle bir list'in icinde return ediniz.
    //           Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [Alexander, Michael, Alex, Alex, Mary, Jim, Tom]
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
        return names.
                stream().                  // [tom, alex, jim, michael, mary, alexander, alex]
                        map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){
        return names.stream().allMatch(t->t.length()>2);
    }

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanThree(List<String> names){
        return names.stream().noneMatch(t->t.length()<3);
    }

    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
        return names.stream().anyMatch(t->t.length()<4);
    }
}
