package day22_stringbuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        // ********** reverse mothodu **************

        StringBuilder sb1 = new StringBuilder("Java is easy");
        sb1.reverse();// Stringin ters çevrilmesi loop ile de yapılır, bu kısa bir yoldur.
        System.out.println(sb1); // ysae si avaJ

        // ******************* deleteCharAt () ****************

        sb1.deleteCharAt(6);// verilen indexteki karakteri siler
        System.out.println(sb1);// ysae s avaJ

        // ****************** delete() ****************

        sb1.delete(4, 7);// başlangıç indexinden (dahil) bitiş  indeksine (hariç) kadar olan kısmı siler
        System.out.println(sb1);//ysaeavaJ

        // ************ replace () *****************

        sb1.replace(2, 5, "X");// 2 dahil 5 hariç, index 2,3,4 karakterler yerine x koyar
        System.out.println(sb1); // ysXvaJ

        // ************** insert () *****************

        sb1.insert(3, "2023");
        System.out.println(sb1);//ysX2023vaJ

        // ***************** compareTo () *****************

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);
        //Sonuc 0 ise alfabetik olarak ayni siradalar demektir.
        //Sonuc mesela -3 ise sb2, sb3 den alfabetik olarak 3 onde demektir.
        //Sonuc mesela 3 ise sb2, sb3 den alfabetik olarak 3 sonra demektir.

        // **************** toString () ******************

        // String builder'i nasıl String'e çevrilir?
        String str = sb2.toString().toUpperCase();

        //String nasıl Strinbuilder'e çevrilir?
        StringBuilder newsb2=new StringBuilder(str);
        System.out.println(str);
        System.out.println(newsb2);

        //************ setChart () *******
        // verilen indexteki harfi değiştirir

        StringBuilder str1 = new StringBuilder("LearnJava");
        str1.setCharAt(5, 'L');
        System.out.println(str1);

        // *************** indexOf () ********************
        // string builder deki ilk görünümünün indexi verir.

        StringBuilder str2 = new StringBuilder("LearnJava");
        int index = str2.indexOf("earn");
        System.out.println(index);

        StringBuilder str3 = new StringBuilder("LearnJava");
        int index1 = str3.indexOf("a", 1);
        System.out.println(index1);

    }//main
}//class

