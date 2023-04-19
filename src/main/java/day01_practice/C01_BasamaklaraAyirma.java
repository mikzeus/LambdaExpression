package day01_practice;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {

        // 12345 sayısının rakamları toplamını bulunuz..

        int a = 12345;

        // birler basamağı
        int birlerBasamagi = a % 10;
        System.out.println("Birler Basmagi:" + birlerBasamagi);
        int newNum= a/10;
        System.out.println("Yeni Sayi : " + newNum);
        int onlarB= newNum%10;
        System.out.println("Onlar Basamagi: "+ onlarB);
        int newN=newNum/10;
        System.out.println("Yeni Sayi : " +newN);
        int yüzlerB= newN%10;
        System.out.println("Yuzler Basamagi: "+yüzlerB);
        int newr=newN/10;
        System.out.println("Yeni Sayi : " +newr);
        int binlerB= newr%10;
        System.out.println("Binler Basamagi: "+binlerB);


/*
        // 12345 sayısının rakamları toplamını bulunuz

        int x = 12345;

        int birler = x%10;   // 5

        int onlar = (x/10)%10;  // 4

        int yuzler = (x/100)%10;  // 3

        int binler = (x/1000)%10;  // 2

        int onbinler = x/10000;   // 1

        System.out.println(birler + onlar + yuzler + binler + onbinler);
*/

    }
}
