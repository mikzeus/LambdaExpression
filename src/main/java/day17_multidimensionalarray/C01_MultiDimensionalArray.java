package day17_multidimensionalarray;

import java.util.Arrays;

public class C01_MultiDimensionalArray {
    public static void main(String[] args) {

        //1)Bir array'in elemanlari da array olursa bu tarz array'lere "Multidimensional Array" denir.

        //"Multidimensional Array" nasil olusturulur?

        String names[][] = new String[3][2];

        //"Multidimensional Array"e eleman nasil eklenir?
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //"Multidimensional Array" leri console'a yazdirmak icin "toString()" method;u degil
        // "deepToString()" method'unu kullaniniz
        System.out.println(Arrays.deepToString(names));// [[A, K], [P, M], [C, Z]]

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(names[1][1]);//M

        //Multidimensional Array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kisa yoldan Multidimensional Array nasil olusturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        System.out.println(Arrays.deepToString(students));

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum = 0;//{ {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"} }

        for (String[] w : students) {
            sum = sum + w.length;
        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        //{ {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"} }

        for (String[] w : students) {

            for (String k : w) {

                if (k.contains("m")) {
                    System.out.println("Icinde M gecen kelimeler: " +k);
                    break;
                }
            }
        }
        System.out.println("Boyle bir harf icermemektedir...");

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int result = 1;

        for (int[] w : nums) {
            for (int k : w) {
                result = result * k;
            }
        }
        System.out.println("Carpim Sonucu: " +result);
        System.out.println("-------------------------------------------------------");

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}}; // ==> { 5, 4, 2, 3, 2,7 }

        //1.Step: Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx = 0;

        for (int[] w : numbers) {
            for (int k : w) {
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println("Yeni Array :" +Arrays.toString(newArr));
        System.out.println("--------------------------------------");

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int ages[][] = {{15, 4}, {12, 43, 21}, {12, 4, 42}, {34}, {54}};
        int small = ages[0][0];// başlangıç değeri olarak varsayıldı.
        int big = ages[0][0];

        for (int[] w : ages) {

            for (int k : w) {

                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(Arrays.deepToString(ages));
        System.out.println(small);
        System.out.println(big);
        System.out.println(big + small);


    }
}






