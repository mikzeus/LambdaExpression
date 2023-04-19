package day30_collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C01_Sets {

    // bütün collection'lar non-primitive data kullanılar.
    /*
        1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
        2)3 tane Set Class vardir;
            i)HashSet Class:
                    "Hash" benzersiz ID olusturma teknigidir. Bu teknige "Hashing Technique" denir.
                    "HashSet" elemanlari rastgele siralar.
                    "HashSet" elemanlari siralamadigindan cok hizli calisir.
                    "HashSet"ler "null"i eleman olarak kabul eder.
                    "HashSet"ler tekrarsiz eleman depolamak icindir.

            ii)LinkedHashSet Class:
                    "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
                    "HashSet"lere gore yavastirlar.
                    "LinkedHashSet"ler tekrarsiz eleman depolamak icindir.

            iii)TreeSet Class:
                    "TreeSet"ler elemanlari natural order'a gore dizerler.
                    "TreeSet"ler elemanlari natural order'a gore dizdiklerinden cooooook yavastirlar.
                    En yavas Set "TreeSet"tir.
        3)TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz.
     */
    public static void main(String[] args) {
 /*     HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Ajda");
        hs.add("");
        hs.add(null);
        System.out.println(hs);// tekrarlı elemanı eklediğimizde kod hata vermez elemanı sadece sadece bir kez ekler.

        System.out.println(hs.hashCode());//2038751948
        System.out.println(hs.clone());

        //############################### linkedHashSet #########################################################
        // bizim sıraladığımız şekilde sıralar.insertion order
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);//[234, 87, -32, 124]

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(451);
        lh.add(87);
        lh.add(231);
        lh.add(124);
        lh.add(null);

        lhs.retainAll(lh);// ortak olmayanları siler, aynı sepete ortak olanları döndürür
        System.out.println(lhs);//[451, 87, 231, 124, null]
        System.out.println(lh);

        //###################### treeSet #############################################

  */

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('?');
        //ts.add(null); TreeSet'lere null eklenmiyor, hata veriyor.
        System.out.println(ts);//[?, A, G, R, U, Z]
        System.out.println(ts.first());//A ilk indexi verir
        System.out.println(ts.lower('R'));//Verilen elemandan önceki elemanı verir.
        System.out.println(ts.lower('D'));//olmayan eleman girince kendinden önceki elemanını verdi
        System.out.println(ts.lower('A'));// null verir
        System.out.println(ts.higher('K'));// verilen harften sonraki R verir
        System.out.println(ts.headSet('R'));// [A, G] ==> parantez içindeki R dahil değildir.
        System.out.println(ts.headSet('R', true));//[A, G, R]//ilk indexten verilen elemana kadar
        System.out.println(ts.tailSet('G'));//[G, R, U, Z]//verilen indexten sonuna kadar
        System.out.println(ts.tailSet('G', false));//[R, U, Z]
        System.out.println(ts.ceiling('R'));// R==> eleman Set'in içinde varsa kendisi return olur.
        System.out.println(ts.ceiling('K'));//R ==> eleman Set'in içinde yoksa sonraki return olur.
        System.out.println(ts.floor('G'));//G ==> eleman Set'in içinde varsa kendisi return olur.
        System.out.println(ts.floor('J'));//G ==> eleman Set'in içinde yoksa önceki return olur.

        System.out.println(ts.subSet('G', 'U'));//[G, R] ==> ilk parametre dahil, ikinci parametre hariç
        System.out.println(ts.subSet('G', 'Z'));// [G, R, U]
        System.out.println(ts.subSet('G', false, 'Z', true));//[R, U, Z]


    }
}
