package day15_nestedlooparrays;

import java.sql.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        /*
        1)Array, Java'nin "ayni data tipi"nde "coklu data" depolamak icin olusturdugu bir yapidir.
        2) Array,lar "primitive data  type " veya "referans"lar ile çalışır
        3) Array,lar "super fast" dir, "memory"de az yer kaplar.

        */

        // Array nasil olusturulur?

        String stdNames[] = new String[5];

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null] <== null'lar String'in default degerleridir.

        //Array'e nasil eleman eklenir?
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));// [Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        // Ex: Array deki spesifik bir elelmanı nasıl alabiliriz..

        System.out.println(stdNames[3]);

        // Example 1: stdNames Array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz.

        // I.yoll
        for (int i = 0; i < stdNames.length; i++) {// lenght Stringlerde parantezli, Arrays,lerde parantezsiz kullanılır..
            System.out.println(stdNames[i] + "*");
        }

        System.out.println("--------------------------------------------------------");
        // II. yol ==> For-each loop== enhanced (Zenginleştirlmiş zincir) Loop - mümkünse hep for-each kullanın,
        // değilse diğerlerini kullanın.

        for (String w : stdNames) {  //[Ajda, Ayhan, Kemal, Cuneyt, Filiz]
            System.out.println(w + " *");
        }

        //Ex: bir int array oluşturnuz ve 5 eleman ekleyiniz. elemanların toplamını bulup
        // konsola yazdırınız:

        int arr[] = new int[5];
        arr[0] = 1;
        arr[2] = 4;
        arr[1] = 3;
        arr[3] = 7;
        arr[4] = 6;
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int w : arr){
            sum=sum+w;
        }
        System.out.println(sum);
        System.out.println("-------------------------------------------------");
        System.out.println("toplam = " + (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]));

        // Ex: bir char array oluşturunuz, 3 eleman ekleyiniz, elemanların çarpımını konsola yazdırın.

        char ch []= new char[3];
        ch [0]='a';
        ch [1]='b';
        ch [2]='c';
        System.out.println(Arrays.toString(ch));

        int cross=1;
        for (char w: ch){
            cross=cross*w;
        }
        System.out.println(cross);




    }//main
}//class
