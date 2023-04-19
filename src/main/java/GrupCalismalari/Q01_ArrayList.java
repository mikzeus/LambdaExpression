package GrupCalismalari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q01_ArrayList {
    public static void main(String[] args) {
/*
      //  Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        List<Integer>mylist= new ArrayList<>();
        mylist.add(5);
        mylist.add(12);
        mylist.add(42);
        mylist.add(13);
        mylist.add(8);
        Collections.sort(mylist);
        System.out.println(mylist);//[5, 8, 12, 13, 42]
        int sum = 0;

         for (Integer w: mylist){
             if (w==13){
                 sum=sum+w;
                 break;
             }
             System.out.println(sum);

         }

 */
            /* Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz. Örnek:  (Sarı, Mavi, Kırmızı,
            Yeşil) ==> Çıktı: Azalan sırada değil
            (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
             */
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for(int i=0; i<size; i++){
            if(f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
            System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
        }




    }
}
