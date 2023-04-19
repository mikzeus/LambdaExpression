package day32_maps;

import java.util.HashMap;

public class C01_HashMap {
    public static void main(String[] args) {

        // HashMap'ler entryleri rastgele dizerler, ve code çok hızlı çalışır.
        // entrylerin sıralaması önemli değil ise Hasmap önerilir.
        // HashMaplar sıralama yaparken key'leri dikakte alır, value'leri dikkate almaz.

        HashMap<String,Integer> sdtAges= new HashMap<>();

        sdtAges.put("Ajda",77);
        sdtAges.put("Ezel",38);
        sdtAges.put("Tom",76);
        sdtAges.put("Brad",58);
        sdtAges.put("Angelina",58);
        sdtAges.put("Tom",83);// "Key 'i tekrar kullandığımızda hata vermez ancak ==>
        // aynı key ile farklı value ler eklediğimizde son verilen değeri esas alır.
        // bu yöntem veri güncellemede kullanılır. bu yönteme override denir.

        System.out.println(sdtAges);//{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        sdtAges.replace("Ezel",39);//replace (), Key'leri kullanarak value'leri update yapmak için kullnaılır.
        System.out.println(sdtAges);

        sdtAges.replace("Angelina",58,61);// true
        System.out.println(sdtAges);

        // replace("Angelina",57,61) methodu 'angelina ' 57 varsa 57'i 61'e dönüştürür, yoksa dönüştürmez.
        sdtAges.replace("Angelina",57,61);// false
        System.out.println(sdtAges);

        sdtAges.putIfAbsent("Brad",60);// bu methot entry yoksa değiştirecek
        System.out.println(sdtAges);

        sdtAges.putIfAbsent("Ali",60);
        System.out.println(sdtAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}

        System.out.println(sdtAges.get("Tom"));//83

        //get() methodu ile ornek "Tom" yazdigimizda Map icinde Tom varsa Java, Tom'u verecek. Var olmayan key icin null verir.
        //getOrDefault() methodunda ise ornek "Tom", 0 yazdigimizda Java bize Tom' key'inin Map'deki value'sunu verir. Ornek
        //sadece 83'u verdi, ayrica key olan Tom'u yazdirmadi. Olmayan key halinde bu method null degil, '0' verir.

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        // "get() methodu" ise null verir.

        System.out.println(sdtAges.getOrDefault("Ayse", 0));//0
        System.out.println(sdtAges.getOrDefault("Ayse", 12));//12 i yazdırdı, çünkü böyle bir key yok

        //containsValue(77); methodu value'larin icerisinde 77 nin olup olmadigini kontrol eder.
        System.out.println(sdtAges.containsValue(77));//true
        System.out.println(sdtAges.containsValue(99));//false

        //containsKey("Ali"); methodu key'larin icerisinde Ali'nin olup olmadigini kontrol eder.
        System.out.println(sdtAges.containsKey("Ali"));//true

        //remove("Ali"); methodu "key" kullanarak "entry"i silmeye yarar
        sdtAges.remove("Ali");
        System.out.println(sdtAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez.
        sdtAges.remove("Tom", 81);
        System.out.println(sdtAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}


        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez.

        HashMap<String ,Integer> kidsAge = new HashMap<>();

        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);
        sdtAges.putAll(kidsAge);// putAll bir Map'i diğer Map'in içine koymaya yarar.
        System.out.println(sdtAges);
        System.out.println(kidsAge);
        sdtAges.putAll(kidsAge);
        System.out.println(sdtAges);//{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);// {John=12, Jack=32, Jim=22}





    }
}
