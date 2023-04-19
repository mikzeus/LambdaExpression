package day32_maps;

import java.util.Arrays;
import java.util.HashMap;

public class C02_HasMap {
    // Interview Question
    //Example 1: Type code to print the number of occurrences of words in a sentence
    ////like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim

    public static void main(String[] args) {

        // Javaya gore bu cumlede like 2 kez yazildi, cunku sondaki like farkli olarak unlem isareti
        //ile yazilmis. Javaya like kelimesinin uc kez yazildigini soylemek istersek, unlemi silmeliyiz ya da
        //kelime yanina konulan tum noktalama isaretleri silinmeli ki kelime java icin ayni gorunsun.
        //Noktalama isaretlerinin tamamini silersek sonuca emin bir sekilde ulasabiliriz.

        String s = "I like you, you like like I!";

        //I.Step
        s=s.replaceAll("[\\p{Punct}]","");
        System.out.println(s);// I like you like like

        //II.Step
        // kelimeleri alabilmem için Split Methodunu kullanacağız.
        String word []= s.split(" ");
        System.out.println(Arrays.toString(word));

        //3.Step
        // şimdi HashMap kullanacağız.
        HashMap<String,Integer> usedWord = new HashMap<>();
        // word Array'in içindeki kelimeler Map de var mı yok mu kontrol edilecek.
        //word Array'in içindeki kelimeler Map de yoksa Map'e value'su 1 olarak yerleştrilecek.
        //word Array'in içindeki kelimeler Map de varsa Map'ta varolan Value'e 1 eklencek.

        for (String w: word){
            Integer numOfusedWord=usedWord.get(w);// HashMap e gir ve kelimenin var olup olmadığına bak

            if (numOfusedWord==null){// null olması o kelimenin map de olmadığı anlamına gelir.
                usedWord.put(w,1);
            }else {
                usedWord.replace(w,numOfusedWord+1);
            }
        }
        System.out.println(usedWord);
















    }
}
