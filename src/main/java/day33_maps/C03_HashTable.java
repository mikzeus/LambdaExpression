package day33_maps;

import java.util.Hashtable;

public class C03_HashTable {
    /*
     HashMap ile HashTable arasındaki fark nedir?
     i)HashMap'ler "thread-safe" (çoklu görev) değildir. (en önemli fark)
       HashMap'ler "Synchronized" değildir.
     ii) HashMap'ler bir tane "null" key'e ve istediğimiz kadar null value'e musade eder.
     iii) HashMap'ler HashTable'a göre hızlıdır.
     Note: her ikis de entry'leri rast gele sıralar.

     */
    public static void main(String[] args) {
        Hashtable<String,Integer> stdAge= new Hashtable<>();

        stdAge.put("Tom", 43);
        stdAge.put("Jim", 52);
        stdAge.put("Jack", 21);
        stdAge.put("Henry", 43);
        stdAge.put("Walker", 85);
        //stdAge.put(null, 10);==> HashTableLarın Key'lerine null konulamaz
        //stdAge.put("cruse",null );==> HashTableLarın value'da da null konulamaz

        System.out.println(stdAge);

        stdAge.elements();
    }

}
