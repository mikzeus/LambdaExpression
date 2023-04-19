package day20_ArrayListDateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {



        // Ex 1: bir İnteger List deki birbirine en yakın elemanı bulunuz.
        //[12,23,10,19]

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println("ilk hali: " + nums);
        Collections.sort(nums);// listedeki elemanları "natural order" yapar..
        System.out.println("Sirali hali : " + nums);

        int minDiff = nums.get(1) - nums.get(0);
        for (int i = 1; i < nums.size(); i++) {

            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));

        }
        System.out.println("Aradaki enkucuk fark : " + minDiff);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff) {
                System.out.println("Birbirine enyakin 2 sayi: " + nums.get(i - 1) + " and " + nums.get(i));
            }
        }


    }//main
}//Class
