package day44_lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //Ex: verilen texteki yazıyı konsola yazdıran bir kod yazınız
        System.out.println("1) ");
        Files.lines(Path.of("src/main/java/day44_lambda/txt.file")).
                forEach(System.out::println);

        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz
        System.out.println("2) ");
        Files.lines(Path.of("src/main/java/day44_lambda/txt.file")).map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        System.out.println("3) ");
        boolean r1 = Files.lines(Paths.get("src/main/java/day44_lambda/txt.file")).anyMatch(t->t.contains("Java"));
        System.out.println("java kelimesi var mı:" + r1);
        /*

        Oncelikle String bir List olusturduk. text'imiz files.lines ve devamini assign ettik. files.lines kismi ile biz
        file'a ulasiriz. Bu satir yanina sirasiyla map methodunu yazdik.
         Map icinde once noktalama isaretlerini silmemiz ve sonrasinda split metodu ile kelimeleri almamiz lazim.
          Once replaceAll metodu icine {"\\p{Punct}" yazarak noktalama isaretlerini sildik ve
           yine map icinde split metodunu kullandik. split metodu
        icine " " yazarak bosluklar cikarilinca bize kelimeler kaldi. Istersek map'i bir kerede istersek iki kez kullanabiliriz.
         split metodu bize array verir. Kelimelerimiz bir array icinde oldu. map metodu yaninda flatMap metodu kullandik.
          flatMap array icine girmemizi saglar, metni cevreleyen duvarlar flatMap ile kirildi.
           stream icindeki kelimeler ile calisacaksak icine girebilmek icin flatMap kullaniriz.
           Bu metod icine Arrays::stream yazarak ardindan distinct metodunu ekleyerek farkli kelimeleri aldik.
           ve collect(Collector.toList) ile kalan tum farkli kelimeleri bir liste koyduk.
         En son sout icinde listimizin words olan ismini yazarak kodumuzu calistirdik.
         */

        //Example 4: Text icinde kullanilan farkli kelimeleri bir list icinde return edecegiz.
        System.out.println("4) ");

        List<String> words = Files.lines(Path.of("src/main/java/day44_lambda/txt.file")).
                map(t-> t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        System.out.println("5) ");
        long numOfLetters =  Files.lines(Path.of("src/main/java/day44_lambda/txt.file")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);

        /*Example 6: Text icindeki text'de toplam kac harf oldugunu bulacagiz.

        Once Files.lines...ile textimizi aldik. Harfler disinda ne varsa silebilmemiz icin map metodu icinde replaceAll metodunu kullandik.
        Bu defa bir map icinde birden fazla metod kullanmak yerine ikinci bir map metodu yazdik ve
        icinde split metodunu kullanarak hicliklerden kelimeleri degil, harfleri aldik. Elimizdeki harfler bir stream'in ve array'in icinde.
        Bu elemanlara ulasmak icin array parantezini kirmak icin flatMap metodunu yazdik.
       flatMap icine Arrays::stream yazarak elemanlara ulastik. Devaminda count () metodu kullanmaya karar verdik.
       Cunku bu metod ile toplam harf sayisini alabiliriz. count metodu bize long verir.
        Biz de tum kodumuzu yeni olusturdugumuz long numOfLetters conteynerina assign ettik.
       Son olarak sout icine numOfLetters koyarak kodumuzu calistirdik.
       lambda da bazi metodlar kendisinden sonra metod gosterir, bazi metodlar son kullanim amacli olup, ondan sonra baska metod kullanamiyoruz.
      Ornek anyMatch() ya da count(), forEach() yanlarina nokta koyunca baska metodlari
        ekranda sirali halde goremedik. count() gibi kendisinden sonra metod kullanilmasina musaade etmeyen metodlara terminal method denir.

         */
        System.out.println("6) ");
        List<String> letters =   Files.
                lines(Paths.get("src/main/java/day44_lambda/txt.file")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);

        /*
        Example: Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return
edecegiz.

                1. adim:List olustur

                2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...

                3.adim:map metodu ile harf disindaki karakterleri sil

                4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.

                5.adim:flatMap ile duvari kir ve harflere ulas

                6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala

                7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.

                sout icine listin ismini yaz ve calistir
         */

    }

}
