package day04_practice;

public class Butce {

// Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin kullanildigi bir butce ile kisisel
// harcamalarin yapildigi harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce;
    public int harclık;

    public void maasAl(int alınanMaas) {
        butce += alınanMaas;
    }
    public void harclıkAl (int alınanHarclık){
        butce-=alınanHarclık;
        harclık+=alınanHarclık;
    }
    public void butcedenHarca (int harcanacakPara){
        butce -= harcanacakPara;
    }



}
