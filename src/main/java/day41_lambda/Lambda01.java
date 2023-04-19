package day41_lambda;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.print(getTheSumOfSquareOfOdds1(nums));
        System.out.println();
        System.out.print(getTheSumOfSquareOfOdds2(nums));
        System.out.println();
        System.out.println(getTheSumOfSquareOfOdds3(nums));
        System.out.println();
        System.out.print(getTheCrossOfSquareOfpair(nums));
        System.out.println();
        System.out.println(getTheSomeOfEvenMaxAndOddMin(nums));
        System.out.println();
        System.out.println(getEvenLessThanSevenMaxAndOddMinGraterThanEight(nums));


    }
    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.

    public static int getTheSumOfSquareOfOdds1(List<Integer> nums) {
        System.out.print("1) ");
        return nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);//Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini
        // daha sonraki tum degerleri toplamdan alir, "u" ise stream'den alir
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums) {
        System.out.print("2) ");

        return nums.stream().
                filter(t -> t % 2 != 0).
                map(Utils::square).//Ihtiyacimiz olan method Java Class'larinda yoksa Utils Class olusturup icine
                //ihtiyacimiz olan method'u olusturunuz ve method reference kullaniniz
                        reduce(0, Math::addExact);//Class Ismi :: Method Ismi ==> Method Reference

    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums) {
        System.out.print("3) ");
        return nums.stream().
                filter(Utils::isOdd).
                map(Utils::square).
                reduce(Math::addExact).
                get();// get () methodu optional int i integer'e çevirir.
    }

    // Ex 2: verilen bir list'teki çift sayı olan elemanların tekrarsız olarak kareleri çarpımı hesaplayan method
    public static int getTheCrossOfSquareOfpair(List<Integer> nums) {

        return nums.stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                distinct().
                reduce(1, (t, u) -> t * u);
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maksimum degeri ile tek sayi olan elemanalarin minimum degerinin
    //toplamini hesaplayan methodu olusturunuz
    public static int getTheSomeOfEvenMaxAndOddMin(List<Integer> nums) {

        int maxEven = nums.stream().distinct().filter(t -> t % 2 == 0).reduce((t, u) -> t > u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t -> t % 2 != 0).reduce((t, u) -> t < u ? t : u).get();
        return minOdd + maxEven;
    }

    // Ex 4:  Verilen bir list'teki cift sayi olan elemanlarin 7den küçük max değeri,
    // tek sayi olan elemanalarin minimum degerinin toplamini hesaplayan methodu olusturunuz
    public static int getEvenLessThanSevenMaxAndOddMinGraterThanEight(List<Integer> nums) {

        int max = nums.stream().distinct().filter(t -> t % 2 == 0 && t < 7).reduce((t, u) -> t > u ? t : u).get();
        int min = nums.stream().distinct().filter(t -> t % 2 != 0 && t > 8).reduce((t, u) -> t < u ? t : u).get();
        return min + max;
    }

}
