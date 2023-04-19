package day16_arraysforeachloop;

import java.util.Arrays;

public class C03_ArrayIcindeElemanBulma {
    public static void main(String[] args) {

        ///Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        // 1 YOL
        String names [] = {"K","C","R","A","S"};
        String eleman ="A";

        int counter=0;
        for (String w : names ) {

            if(w.equals(eleman)){

                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("Array has ==>" + eleman );
        }else {
            System.out.println("Array does not have ==> "+ eleman);
        }

        //2 YOL
        Arrays.sort(names); //  A C K R S
        int result = Arrays.binarySearch( names  ,   eleman );
        System.out.println(Arrays.toString(names));
        System.out.println(result);

        if(result<0){
            System.out.println("Array does not have ==> "+ eleman);
        }else{
            System.out.println("Array has ==>" + eleman );
        }

        //1) binarysearch() methodunu sort() kullanmadan kullanamayiz, cunku binarysearch() mantigi sirali elemanlar icin gecerlidir
        //2) binarysearch() methodu var olan elemanlar icin size o elemanin index inin verir
        //3) binarysearch() methodundan aldigimiz index 0 veya 0 dan buyuk ise bu aradigimiz eleman arrayde var demektir
        //4) binarysearch() methodu olmayan elemanlar icin negatif deger verir
        //      "-" isaretinin anlami o eleman arrayde yok demektir
        //      "-" isaretinin yanindaki sayi ise eger o eleman arrayda olsaydi kacinci eleman olurdu demektir


    }//main
}//class
