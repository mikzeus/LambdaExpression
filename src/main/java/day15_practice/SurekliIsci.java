package day15_practice;

public class SurekliIsci extends Isci{

    @Override
    public String toString() {
        return "SurekliIsci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


        SurekliIsci surIsc1= new SurekliIsci();
        surIsc1.personelNo=5001;
        surIsc1.isim="Cem";
        surIsc1.soyisim="Oz";
        surIsc1.statu="Isci";
        surIsc1.saatUcreti=11;
        surIsc1.maas= surIsc1.maasHesapla();

        System.out.println(surIsc1.toString());
    }
}
