package day09_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {
      /*
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
     */
      public static void main(String[] args) {

          Scanner scan =new Scanner(System.in);
          System.out.println("Enter a sentence");
          String sentence= scan.nextLine();

         String str []= sentence.split("");//[j, a, v, a,  , h, a, v, a, t,  , g, ü, z, e, l]
          System.out.println(Arrays.toString(str));

          sesliHarfleriYazdir(str);
      }

    public static void sesliHarfleriYazdir(String[] str) {
          for (int i=0; i<str.length;i++){

              if (str[i].equalsIgnoreCase("a")
                      ||str[i].equalsIgnoreCase("e")
                      ||str[i].equalsIgnoreCase("i")
                      ||str[i].equalsIgnoreCase("o")
                      ||str[i].equalsIgnoreCase("u")){

                  System.out.print(str[i] + " ");
              }
          }
    }
}
