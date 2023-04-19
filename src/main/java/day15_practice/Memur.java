package day15_practice;

public class Memur extends Muhasebe{

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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

        Memur memur1= new Memur();

        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="098765432";

        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas= memur1.maasHesapla();

        System.out.println("personelNo: " +memur1.personelNo);//1001
        System.out.println("Maas: " + memur1.maas);//2400

        // toString methodu objelerin tüm özelliklerini yazıdran kod bloğu
        System.out.println("Memur1: " + memur1.toString());

        Memur memur2= new Memur();
        memur2.personelNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println("Memur2: " + memur2.toString());



    }

}
