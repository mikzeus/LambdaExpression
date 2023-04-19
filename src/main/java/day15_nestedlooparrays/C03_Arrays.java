package day15_nestedlooparrays;

import java.util.Arrays;

public class C03_Arrays {
    // Array's ları kısa yoldan nasıl oluşturabiliriz?
    public static void main(String[] args) {

        int grade[] = {45, 90, 100, 70, 67};
        System.out.println(Arrays.toString(grade));

        // Ex: grade arryındeki en küçük ve enbüyük Array'i ekrana yazdırın

        Arrays.sort(grade);
        System.out.println(Arrays.toString(grade));
        System.out.println(grade[0] + grade[grade.length - 1]);

        // Application larda data ile bu dataları işleyen (Logic) kodlar birbirinden yarılır. yani;
        // logic dataya bağımlı olmamalıdır. dataya bağımlı olarak yazılan kodlara "hard kod" denir.
        // "hard kod" hatalı kod demektir.
        // grade arryinde son elemanı almak için "4" veya "grade.length -1" kullanılabilir.
        // 4 kullanılırsa array e bir eleman eklendiğinde kodunuz yanlış çıktı verir
        // "sort" metodu "Sayıları"(numerik data) küçükten büyüğe (ascending) dizer.
        // "sort" metodu "String"leri ise alfabetik sırada dizer.(alphabetically)
        // "ascending" + "alphabetically" ==> Natural Order

        // Ex: size verile bir String Arry deki isimlerden 5 karakterden az karakter içerenleri yazdırın.

        String name[] = {"Ajda", "Cuneyt", "Tom", "Ayhan", "nisa"};
        System.out.println(Arrays.toString(name));

        for (String w : name) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }
        System.out.println("---------------------------------------------------------");

        // Ex :size verile Strin arr deki isimleri alfabetik sıraya koyduktan sonra T ile başlayan isimlerden önceki
        //     isimleri console'a yazdırın

        String names[] = {"Aylin", "Seyhan", "Tarik", "Mercan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        for (String w : names) {
            if (w.startsWith("T")) {
                break;
            }
            System.out.println(w);
        }
        System.out.println("------------------------------------------------------------");

        // Ex :size verile Strin arr deki isimleri alfabetik sıraya koyduktan sonra T ile başlayan isimlerden önceki
        //     isimleri ve "T" ile başlayanları console'a yazdırın

        String names1[] = {"Aylin", "Seyhan", "Tarik", "Mercan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        for (String w : names1) {
            System.out.println(w);
            if (w.startsWith("M")) {
                break;
            }
        }
        System.out.println("--------------------------------------------------");


        //Ex: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "T" ile baslayan
        //    isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(names1);

        for (String w : names1) {
            if (w.startsWith("T")) {
                continue;
            }
            System.out.println(w);
        }


    }//main
}//class
