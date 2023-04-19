package day15_practice;

public class Ustabasi extends Isci{
    @Override
    public String toString() {
        return "Ustabasi{" +
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



        Ustabasi ustabasi1= new Ustabasi();
        ustabasi1.isim="Mustafa";
        ustabasi1.soyisim="Uner";
        ustabasi1.saatUcreti=15;
        ustabasi1.maas=ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="Ustabasi";
        System.out.println(ustabasi1.toString());
        ustabasi1.mesai();

    }
}
