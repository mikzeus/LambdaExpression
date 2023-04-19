package day01_practice;

import java.util.Scanner;

public class C08_ifElse {
    // Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    // Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    // 5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen hizmet yiliniz giriniz: ");
        int hizmetYili = scan.nextInt();

        System.out.println("lutfen maasinizi giriniz: ");
        int maas = scan.nextInt();

        if (hizmetYili>=5){
            System.out.println("MAASINIZ: "+ (maas+(maas*0.1)));
        }else {
            System.out.println("Zam alabilmek icin " + (5-hizmetYili) + " yil daha calismaniz gerekli");
        }
    }

}
