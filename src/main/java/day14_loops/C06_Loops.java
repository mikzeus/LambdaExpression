package day14_loops;

public class C06_Loops {

    public static void main(String[] args) {
        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                continue;
            } else System.out.print(ch);

        }
        System.out.println("------------------------------------");
        //break ile continue arasindaki fark nedir?
        // break switch in disina cikmak icin loopu kirmak icin kullanilir
        // continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir

        // bir Stringi ters ceviren kodu yazınız..
        // I.yol
        String str = "Java";
        String ters = "";
        for (int i = str.length() - 1; i >= 0; i--) {//i'inci indexi arıyoruz

            ters = ters + str.substring(i, i + 1);

        }
        System.out.println(str);
        System.out.println(ters);

        // bir sayının rakamları toplamını veren kodu yazınız...

        int sum = 0;
        int num = -12;
        num = Math.abs(num);// mutlak değer içine alma methodu
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println("For döngüsü toplam : " + sum);

        int yeniSum = 0;
        while (num > 0) {
            yeniSum += num % 10;
            num /= 10;

        }
        System.out.println("while döngüsü toplam : " + yeniSum);

    }

}
