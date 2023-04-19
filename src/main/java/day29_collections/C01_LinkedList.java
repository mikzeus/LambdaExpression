package day29_collections;

import java.util.LinkedList;

public class C01_LinkedList {
    /*
        1)LinkedList'ler node silme ve ekleme'de cok basarili olduklari icin,
          silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullaniniz.
        2)ArrayList'ler index'leri adres gibi kulanir, bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
        Note: Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi) LinkedlIst,
              "search" islemleri yapacaksa(Amerika eyaletleri gibi) ArrayList kullaniniz.

             ############################# DT#####################################

    1) ArrayList ler eleman silme ve eleman eklemede basarisizdirlar
       o yuzden eleman silme ve ekleme islemlir coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
    2) LinkedListler index kullanmadiklarindan dolayi eleman silme ve eklemede re-index yapilamasina gerek yoktur.
       Bu da Linkedlistlerin eleman ekleme ve silmede cok basarili hale getirir.
       Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda Linklist kullanmak tavsiye edilir
    3) ArrayListlerde "search" islemi kolay yapilir cunku indexler adres gibidir.
    4) Linkedlistlerde search islemi zor yapilir cunku LinkedListler index kullanmmaz.
       index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir
       bu da cok fazla is demektir.

     */

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        System.out.println(s);//[Esra, Steve, Ajda, Muge, Cuneyt, Esra]
        s.add(0, "Esen");
        System.out.println(s);//[Esen, Esra, Steve, Ajda, Muge, Cuneyt, Esra]
        s.addFirst("Kemal");
        System.out.println(s);//[Kemal, Esen, Esra, Steve, Ajda, Muge, Cuneyt, Esra]
        s.addLast("Ajdar");
        System.out.println(s);// [Kemal, Esra, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        s.remove(2);
        System.out.println(s);//[Kemal, Esen, Steve, Ajda, Muge, Cuneyt, Esra, Ajdar]
        s.remove("Ajdar");
        System.out.println(s);//[Kemal, Esen, Steve, Ajda, Muge, Cuneyt, Esra]
        s.remove();// ilk elemanı siler
        System.out.println(s);//[Esen, Steve, Ajda, Muge, Cuneyt, Esra]
        s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Esen, Steve, Ajda, Muge, Cuneyt]
        s.removeLastOccurrence("Esra");
        System.out.println(s);//[Esen, Steve, Ajda, Muge, Cuneyt]

        /*
            peek();
            Retrieves, but does not remove, the first element of this list.
            Returns: the head of this list, or null if this list is empty
         */
        String r1 = s.peek();//Ilk node silmeden size verir. (copy+paste)
        System.out.println(r1);//Kemal
        System.out.println(s);// [Kemal, Esra, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        /*
                poll();
            Retrieves and removes the first element of this list.
            Returns: the head of this list, or null if this list is empty
         */
        String r2 = s.poll();//Ilk node size verir ve list'ten siler.(cut+paste)
        System.out.println(r2);//Kemal
        System.out.println(s);// [Esra, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        /*
            element();
            Retrieves, but does not remove, first element of this list.
            Throws: NoSuchElementException – if this list is empty
            Note: peek() ile element() ikisi de ilk elemani silmeden size verir.
                  Ama peek() list bos oldugunda size "null" verir, element() ise "hata" verir.
        */
        String r3 = s.element();//Ilk elemani silmeden size verir(copy + paste)
        System.out.println(r3);//Esra
        System.out.println(s);// [Esra, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        /*
            pop();
            Removes and returns the first element of this list.
            Throws:NoSuchElementException – if this list is empty
            Note: poll() ile pop() ikisi de ilk elemani siler ve size verir.
                  Ama poll() list bos oldugunda size "null" verir, pop() ise "hata" verir.
         */
        String r4 = s.pop();
        System.out.println(r4);//Esra
        System.out.println(s);// [Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        // ###############################################################

        LinkedList<String> s1 = new LinkedList<>();
        s1.add("Merve");
        s1.add("Murat");
        s1.add("Vildan");
        s1.add("Fatih");
        s1.add("Mustafa");
        s1.add("Fatih");
        s1.add(1, "Caner");
        System.out.println(s1);//[Merve, Murat, Vildan, Fatih, Mustafa, Fatih]

        s1.addFirst("Ahmet");
        System.out.println(s1);//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]

        s1.addLast("Enver");
        System.out.println(s1);//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]


        s1.remove(2);
        System.out.println(s1);

        s1.remove("Ahmet");
        System.out.println(s1);

        s1.removeFirstOccurrence("Fatih");
        System.out.println(s1);

        s1.removeLastOccurrence("Fatih");
        System.out.println(s1);
        s1.remove();
        System.out.println(s1);

        /*Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty
         */
        String r11 = s1.peek();//copy + paste (ilk node u silmeden bize verir)
        System.out.println(r11);//Ahmet
        System.out.println(s1);

        String r22 = s1.poll();
        System.out.println(r22);//Ahmet      (cut + paste ilk node u silip verir)
        System.out.println(s1);//[Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]


        /*Retrieves, but does not remove, the head (first element) of this list.
         Returns: the head of this list
            Throws: NoSuchElementException – if this list is empty
        * */
        String r33 = s.element();
        System.out.println(r33);//Merve ==>ilk elemani silmeden size verir (copy paste)
        System.out.println(s1);//[Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        //poll() ile pop() methodlari ilk node u siler ve size verir
        //poll() list bos oldugunda size null verir, pop() ise "hata" verir
        String r44 = s1.pop();
        System.out.println(r44);
        System.out.println(s1);

    }
}
