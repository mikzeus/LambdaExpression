package reglit;

import java.util.Arrays;

public class StringRakamTopla {
   // Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
    // Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir yöntem yazın.
   public static void main(String[] args) {
       String str="ade1r4d3";
       String[] newstr =str.replaceAll("[^0-9]","").split("");
       System.out.println(Arrays.toString(newstr));

       int toplam=0;
       for (int i=0; i<newstr.length; i++){
           toplam+= Integer.parseInt(newstr[i]);
       }
       System.out.println(toplam);
   }
}
