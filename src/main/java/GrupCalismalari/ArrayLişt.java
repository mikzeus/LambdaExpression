package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;

public class ArrayLişt {
    public static void main(String[] args) {

        //Bir listedeki ogelerin azalan sırada olup olmadigini kontrol ediniz.
        //  Örnek :(Sarı,Mavi,Kırmızı,Yesil)==>Cikti: Azalan sırada degil
        //  (Kırmızı,Yesil,Mavi,Sari)==>Cikti: Azalan sıradadır
        // List<String> list=new ArrayList<>();
        // list.add("Yellow");//6
        // list.add("Green");//5
        // list.add("Blue");//4
        // list.add("Red");//3
  /*
        List<String> list = new ArrayList<>();
        list.add("Yellow");//6
        list.add("Green");//5
        list.add("Blue");//4
        list.add("Red");//3

        int uzunluk = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                } else {
                    uzunluk = 1;
                }
            }
        }
        if (uzunluk == 0) {
            System.out.println("Siralidir");
        } else {
            System.out.println("Sirali degildir");
        }


        // L!stede eleman olarak 15 varsa, tüm 15'ler! 51 olarak deg!st!r!n!z.
        // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(11);
        nums.add(15);
        nums.add(34);
        nums.add(15);
        nums.add(43);

        int aranan=15;
        int count=0;
        for(Integer w:nums){
            if (w==aranan){
                nums.set(count,51);
            }
            count++;
        }
        System.out.println(nums);

   */
        /*
    L!stede 15 veya 13 varsa, bu elemanları kaldırınız.
    Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
 */
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(31);
        nums.add(15);
        nums.add(13);
        nums.add(54);
        nums.add(13);

        System.out.println(nums);
        for (int i=0;i<nums.size();i++) {

            if (nums.get(i) == 15 || nums.get(i) == 13) {
                nums.remove(nums.get(i));
                i--;

            }

        }System.out.println(nums);

    }
}
