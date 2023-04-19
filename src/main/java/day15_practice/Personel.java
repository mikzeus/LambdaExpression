package day15_practice;

public class Personel {

    // bir fabrikada gerekli olan departmanları;
    // Personel, Muhasebe, Memur, Isci, Surekliİsci, Ustabasi olarak farklı classlara ayırınız
    // Muhasebe departmanı, Personel departmanına baglı olacak
    // Memur ve Isci departmanları, Muhasebe departmanına baglı olacak
    // Surekliİsci ve UstaBasi departmanları, İsci departmanına baglı olacak

    // Memur, Surekliİsci ve UstaBası departmanlarından obje olusturarak,
    // variable'lara kendi departmanlarına gore deger atayınız ve yazdırınız


    //Not: personel class'ı en üst class olduğu için herkes için ortak olan dtaları burada oluşturabiliriz.
    protected int personelNo;
    protected String isim;
    protected String soyisim;
    protected String adres = "Adres girilmedi.";
    protected String tel = "Telefon girilmedi.";


}
