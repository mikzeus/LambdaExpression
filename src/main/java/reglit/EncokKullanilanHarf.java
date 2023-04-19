package reglit;

import java.util.Arrays;

public class EncokKullanilanHarf {

    // Write a Java program to get a String from user as input and find the maximum occurring character in that string.
    //    (Ignore case sensitivity)
    public static void main(String[] args) {
        String str = "Learning java is easy";
        String newStr=str.toLowerCase();


        int [] arr = new int[26];
        for (int i = 0; i < newStr.length(); i++) {
          char ch= newStr.charAt(i);
          if (ch>= 'a' && ch<='z'){
              arr[ch- 'a']++;
          }
        }
        int maxCount=0;
        char maxChar=' ';
        for (int i = 0; i <arr.length ; i++) {
            if (maxCount<arr[i]){
                maxCount=arr[i];
                maxChar= (char) (i + 'a');
            }

        }
        System.out.println( maxChar);
    }
}



