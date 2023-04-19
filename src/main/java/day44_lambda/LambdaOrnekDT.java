package day44_lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaOrnekDT {
    public static <boolen> void main(String[] args) throws IOException {

        //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın.

        System.out.println("Ex 1) ");
        Files.lines(Path.of("src/main/java/day44_lambda/LambdaNot")).
                forEach(t-> System.out.println(t));


        // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.

        System.out.println("Ex 2) ");
        Files.lines(Path.of("src/main/java/day44_lambda/LambdaNot")).
                map(String::toUpperCase).
                forEach(System.out::println);

        // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.

        System.out.println("Ex 3) ");
        boolean k =Files.lines(Path.of("src/main/java/day44_lambda/LambdaNot")).
                anyMatch(t-> t.contains("Java"));
        System.out.println(k);


        // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.

        System.out.println("Ex 4) ");
        Files.lines(Path.of("src/main/java/day44_lambda/LambdaNot")).
                map(t-> t.replaceAll("\\p{Punct}","")).
                map(t-> t.split(" ")).
                collect(Collectors.toList()).
                stream().flatMap(Arrays::stream).distinct().
                forEach(t-> System.out.print (t + " "));
        System.out.println();


        // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.

        System.out.println("Ex 5) ");
        Long letters=Files.lines(Path.of("src/main/java/day44_lambda/LambdaNot")).
                map(t-> t.replaceAll("[^a-zA-Z]","")).
                flatMap(lines-> Arrays.stream(lines.split(""))).
                count();
        System.out.println(letters + " Adet Harf kullanıldı..");


        // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
        System.out.println("Ex 6) ");
        List<String >myList=Files.
                lines(Path.of("src/main/java/day44_lambda/LambdaNot")).
                map(t-> t.replaceAll("[^a-zA-Z]","")).
                flatMap(lines-> Arrays.stream(lines.split(""))).//distinct().
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(myList);



    }
}
