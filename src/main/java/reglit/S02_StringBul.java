package reglit;

import java.util.Arrays;
import java.util.Scanner;

public class S02_StringBul {
    public static void main(String[] args) {
/*

        String str = "Javaisalsoeasy";
        String result = "";

        for (int i = 0; i < str.length(); i++){

            String ch= str.substring(i,i+1);
            if(str.indexOf(ch)!=str.lastIndexOf(ch) && !result.contains(""+ch)){

                result+=ch;
            }

        }
        String arr []= new String[ch];



        String s="Javaisalsoeasy";

        String ss[]=s.split("");
        String str="";
        for (String w:ss){
            if (s.indexOf(w)!=s.lastIndexOf(w) && !str.contains(w)){
                str+=w+" ";
            }
        }
        System.out.println(str);

 */


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s1 = input.nextLine();
        char ch[] = new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            ch[i] = s1.charAt(i);
        }

        Arrays.sort(ch);
        System.out.println("Sıralı hali = " + Arrays.toString(ch));

        char helperChar = ' ';
        int counter = 0;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (ch[i] != helperChar) {
                if (ch[i] == ch[i + 1]) {
                    counter++;
                    helperChar = ch[i];
                }
            }
        }
        System.out.println("Tekrarlı eleman sayısı : " + counter);

        char tekrarliKarakterler[] = new char[counter];

        int j = 0;
        helperChar = ' ';
        for (int i = 0; i < s1.length() - 1; i++) {
            if (ch[i] != helperChar) {
                if (ch[i] == ch[i + 1]) {
                    tekrarliKarakterler[j] = ch[i];
                    helperChar = ch[i];
                    j++;
                }
            }
        }

        System.out.println("Tekrarlı Karakterler Listesi : " + Arrays.toString(tekrarliKarakterler));


    }
}
