package day33_maps;

import java.util.HashMap;

public class C02_HashMap {
    // HashMap arkasında çalışan mekanizma nasıl çalışır.
    public static void main(String[] args) {

        //Java Hashing Tecnic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
        //Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode", "key" ve "value" u koyar.
        //Bir bucket'a istediginiz kadar entry koyabilirsiniz
        //Java bucket'larin icinde LinkedList kullanir

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.put("Italy", "Roma");
        capitals.put("Turkiye", "Ankara");
        capitals.put("Turkiye", "Istanbul");

        System.out.println(capitals);

      /*  HashMap<String, String> capitals=new HashMap<>(); olusturdugumuzda Java memoryde 16 kutucuk olusturur
        ve o kutulari siarasiyla 0'den 15'ya kadar indexler. Kutularin ici bostur. Bu kutulara BUCKET denir.
        HashMap ilk olusturuldugunda kutular bostur.

        capitals.put("USA", "Washington"); yazdigimizda, java ilk isim icin bir hashcode uretiyor. Java
        birbirine benzemeyen kodlar uretir, ornegin bunun icin 34 uretiyor. Java key icin 34 hashcode urettiğini
        farzedelim. Bu hashcode'u 16'ya boler. 34:16 kalan 2'yi verir. Java kalana odaklanir ve indexi 2 olani bulur,
        sonra bos kutu olan yani 2.inci indexteki bucket'a once hashmap kodu olan 34'u koyar, yanina USA onun yanina
        Washington'i koyar.

        capitals.get("USA"); methodunu kullanirken, java USA icin urettigi kodu bildiginden onu bize verir.

        capitals.put("Italy", "Roma"): yazdigimizda key olan Italy icin bir hashcode mesela 65'i uretecek
        ve 16'ya bolecek. kalan 1'dir. Java indexi bir olan bucket'in uc bolmeli yapisinda ilk bolmeye 65, 2.ye
        Italy, 3. bolmeye Roma'yi koyar.

        codun 16'ya bolunmesi halinde 16 index olarak siralan bucket'larin disina kalanlar ile cikilmamis olacak.

        capitals.put("Turkiye", "Ankara"); bunun codu ornegin 82. 82/16 kalan 2, Java onceden doldurulmus olsada
        2. index'e uc bolmeli bir entry daha ekleyecek ve once 82, sonra TR ve sonra Ankara'yi yazacak.

        Java bucketlar icinde LinkList kullanir. Entryleri birbirine bagliyor. Indexte birden fazla entry olduysa
        onlari node yapisi gibi birbirine baglar.

        capitals.get("Turkiye"); Java Turkiye icin olusturdugu hashcode'i biliyor 82. 82 index 2'de.
                Java buraya gelerek 82'yi alir.

        Biz Turkiye'yi bir kere daha koyarsak, Turkiye icin uretilen hashcode ayni olur, yeni bir hashcode uretmez.

        capitals.put("Turkiye", "Istanbul"); Java onceden urettigi 82'yi bilir ve index 2'ye gider. Orada iki
        entry olsa da 82'yi secer ancak hashcode'a dokunmayan java Ankara üzerine Istanbul yazar.

       */




















    }
}
