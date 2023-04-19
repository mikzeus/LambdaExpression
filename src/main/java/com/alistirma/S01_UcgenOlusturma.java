package com.alistirma;

import java.util.Scanner;

public class S01_UcgenOlusturma {
    public static void main(String[] args) {
/*        Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise es kenar ucgen

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 tane tamsayi giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean ucgenOlma =
                        (a + b > c & c > a - b &
                        a + c > b & b > a - c &
                        b + c > a & a > b - c);

        if (a == b && b == c) {
            System.out.println("eskenar ucgendir");

        } else if(ucgenOlma){

        System.out.println("bu bir ucgendir");


        } else System.out.println("bu bir ucgen degildir...");


    }
}
