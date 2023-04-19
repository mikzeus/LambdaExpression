package day10_practice;

import java.time.LocalDate;

public class C02_LocalDate {
     /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */
     public static void main(String[] args) {

         LocalDate birthOfAli= LocalDate.of(1923,10,29).plusYears(45)
                                                      .plusMonths(8).plusDays(5);
         System.out.println(birthOfAli);// 1969-07-04

         LocalDate birthOfVeli=LocalDate.of(1993,9,15).minusDays(11)
                                             .minusMonths(2).minusYears(24);
         System.out.println(birthOfVeli);// 1969-07-04

         if (birthOfAli.equals(birthOfVeli)){

             System.out.println("Ali ile Veli Aynı tarihte doğmuşlar...");
         }
         else System.out.println("Hayır !!! dogum tarihleri farklıdır...");



















     }

}
