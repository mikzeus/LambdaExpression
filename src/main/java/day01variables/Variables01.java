package day01variables;

        public class Variables01 {

        public static void main(String[] args) {

            //Variable olusturmak
            //Java cumlesi = Statement
            //Java'da esittir demek "==". Yani Matematik'de "=", Java'dd "=="
            //Java'da "=" "assignment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
            //Access Modifier yazmazsaniz "access modifier" "default" demektir
            //Data Type + Variable Name ==> Variable Declaration
            //Assignment Operator(Atama Operatoru)  + Variable degeri ==> Assignment
            //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini(default) koyar.
            //Default degerler sayilar icin sifirdir.
            // Data Type'ini yaziniz   Variable ismi yaziniz  Assignment Operator(Atama Operatoru)   Variable degeri   Ingilizce'deki nokta gibi
            int                      age                     =                                   13                   ;

            //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
            //String'lere verilen degerler cift tirnak icinde olmalidir.
            //String'ler icin "default value" "null" dir.
            String studentName = "Ali Can";

        /*
           Java'da temelde iki tip data vardir;
           1)primitive data type:
                char: Tek karakterler icin kullanilir. A, x, ?, 5
                boolean: boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
                byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir (1 byte)
                short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir (2 byte)
                int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
                long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir. (8 byte)
                float:
                double:
           2)non-primitive data type

         */

            //Ornek 2: char data type'inda ilk ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
            //Note: char data type'inda degerler tek tirnak icine konulmlaidir
            char isminIlkHarf = 'A';

            //Ornek 3: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin.
            boolean emeklimisin = false;

            //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
            byte studentAge = 23;

            //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
            short siteNufusu = 1200;

            //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz
            int countryPopulation = 1864184648;

            //Ornek 7: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
            //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur.
            long cellNumberInHumanBody = 87654321356788L;

          //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
            long weightOfSun = 1234567;

            //primitive data types --> char - boolean - byte - short - int - long - float - double
            //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
            //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)

        //Note 1: primitive data type'larini Java olusturmustur, biz olusturamayiz
        //Note 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
        //Note 3: primitive data'lar data type'lara gore memory de farkli farkli yer kaplarlar
        //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar


                //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
                //Note: Java "Decimal Numbers" i otomatik olarak "double" kabul eder.
                //      Siz data type'ini "float" yazarsaniz hata verir.
                //      float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
                //      float memory'de 4 byte yer kaplar, double 8 byte yer kaplar
                float shirtPrice = 12.99F;
                float shoesPrice = 15.89F;
                //System.out.println() ekrana yazdirir ve "pointer" i bir sonraki satira koyar
                //System.out.print() ekrana yazdirir ve "pointer" i ayni satirda tutar
                System.out.println(shirtPrice + shoesPrice);

                //System.out.println() yazdirmanin kisa yolu ==> "sout" yaz ve Enter'a bas
                System.out.println();

                //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin
                double weightCell = 0.000000000000112;
                double weightAmip = 0.000000000000023;
                System.out.println(weightCell - weightAmip);//8.9E-14 ==> 0.000000000000089 ==> "8.9 carpi 10 uzeri -14"  "E ==> Exponent"

            /*
        Non-Primitive Data Types: String bir non-primitive data type'dir.
                                  Uretilen her bir class ayni zamanda bir "non-primitive data type" dir.
                                  Bu yuzden "non-primitive data type" lar sinirsiz sayidadir denebilir.
                                  Non-primitive data type'larin isimleri buyuk harfle baslar
                                  Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir.

       Interview Sorusu: "primitive" ve "non-primitive" data type'lari arasindaki fark nedir?
                         1)"primitive" ler sadece bizim atadigimiz degeri icerir,
                           "non-primitive" ler bizim atadigimiz deger ve method'lar icerir.
                         2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar.
                         3) "primitive" leri Java uretmistir ve 8 tanedir,
                            "non-primitive" leri Java ve developerlar uretebilir, sinirsiz sayidadir.
                         4) "primitive" ler memory'de data type'ina gore yer kaplar,
                            "non-primitive" ler icin Java memory'de hepayni buyuklukte yer ayirir.
            */


                //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin
                String cityName = "Miami";
                System.out.println(cityName);
           /*

                Java'da method nasil olusturulur?

                1)main method'un disinda olusturulur
                2)Access Modifier + Return Type + Method Ismi + () + {}

                Olusturulan method'lar nasil kullanilir?
                1)main method'un icinden kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz sayilari parantezin icine koyun
            */
            }

        }



