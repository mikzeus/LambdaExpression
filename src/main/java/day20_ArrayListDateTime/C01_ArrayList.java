package day20_ArrayListDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {
        // kullanıcının girdiği harf "List " de var ise "Buldum" a cevirin,
        //yoksa harfi "List"e ekleyin
        // String class tercih edilir, çünkü method açısından çok zengindir.
        // kısa yoldan "List.of" ile liste yapılabilir ancak bu listenin elemanları değiştirilemez.
        // ayrıca sonradan eleman eklenmez. silinemez, sırası düzenlenemez

        Scanner scan = new Scanner(System.in);
        //List<String> myList= List.of("A","H","J","K","M");
        List<String> myList=new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        myList.add("K");
        myList.add("M");
        int size=myList.size();

        System.out.println("please Enter A letter: ");
        int count =0;

        do {
            if (count==size){
                break;
            }

            String ch = scan.next().substring(0, 1).toUpperCase();
            System.out.println(myList);

            if (myList.contains(ch)) {
                myList.set(myList.indexOf(ch), "Buldum");
            } else {

                myList.add(ch);
            }
            System.out.println(myList);
            count++;

        }while (true);


    }
}
