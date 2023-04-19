package day04_practice;

import java.util.prefs.BackingStoreException;

public class ButceRunner {
    public static void main(String[] args) {
        Butce baba= new Butce();
        System.out.println("Maas oncesi Butce : "+ Butce.butce);
        baba.maasAl(30000);
        System.out.println("Maas sonrası Butce: "+Butce.butce);
        baba.harclıkAl(100);
        baba.butcedenHarca(80);
        System.out.println(Butce.butce);
        System.out.println(baba.harclık);

        Butce anne = new Butce();
        anne.maasAl(50000);
        System.out.println("Maas sonrası Butce: "+Butce.butce);
        anne.harclıkAl(500);
        anne.butcedenHarca(500);

        System.out.println(Butce.butce);
        System.out.println(anne.harclık);

        Butce cocuk= new Butce();
        cocuk.harclıkAl(200);
        cocuk.butcedenHarca(180);
        System.out.println(Butce.butce);
        System.out.println(cocuk.harclık);

        System.out.println("Son durum: " + Butce.butce);
    }
}
