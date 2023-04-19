package day04_practice;

public class MaymunAlive {

/*
     INTERWIEW SORUSU

        Adada yalnız bir maymun var. Her gün 4 muz yemesi gerekiyor.o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

 */
    public static void main(String[] args) {

        int muzSayisi=165;
        int hayattaKlnGun=1;
        boolean maymunYasiyorMu=true;

        do {

            muzSayisi-=4;
            System.out.println("Kalan muz sayısı : " + muzSayisi);
            hayattaKlnGun++;

            if (muzSayisi<4){
                maymunYasiyorMu=false;
                System.out.println("Bugun "+ hayattaKlnGun + ".GUN. Yeterli muz kalmadı.Maymun rahmetli oldu !!!");

            }else
                System.out.println("Bugun" + hayattaKlnGun + ".GUN.Maymun Hala yaşıyor");


        }while (maymunYasiyorMu);

        int muzSayisi1 = 165;
        int gun = 1;

        for (int i = 1; i <muzSayisi1; i++) {
            if (i%4==0){
                gun++;
            }
        }
        System.out.println("Maymun "+gun+" gGUNN hayatta kalir");




















    }
}
