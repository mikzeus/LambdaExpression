package day03_Scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class Car {

    // Class ==> Variable (Pasif Ozellikler) ==> Object
    //Method (Aktif Ozellikler)
    public String model= "Corolla";//pasif ozellikler Variable
    public int fiyat = 200000;

        public void hareket(){//Aktif ozellikler Methodlar
        System.out.println("Toyota hizli hareket eder...");
    }
        public void dur(){//Aktif ozellikler Methodlar
        System.out.println("Toyota guvenle durur...");
    }
    //Scanner classi kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir Class'tir.Java util kutuphanesinden getirildi icin import ister

    public static void main(String[] args) {

        //Class ismini yazin #Objeye isim verin   =   new keywordunu kullanin  Class ismini ()

        Car myCorolla = new Car();
        Car araba= new Car();
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();

        System.out.println("--------------------------------------------");

        Car c1= new Car();
        System.out.println(c1.fiyat);
        System.out.println(c1.model);
        c1.hareket();
        c1.dur();

        System.out.println("******************************************************************************");

        //Kullanicidan Data Almak Icin
        //1.Adim Scanner Class'indan Object olusturun
        Scanner input = new Scanner(System.in);
        //Scanner scan= new Scanner(System.in);

        //2.Adim Kullaniciya ne yapacagini soyle
        System.out.println("Lutfen yasinizi giriniz");

        //3.Adim Kullanicidan aldiginiz datayi variable icine koyun
        byte age= input.nextByte();


        System.out.println("***********************************************************************");
        // Kullaniciya ad , memleket , yas, boy ,
        //yasadigi yeri sevip sevmedigini soran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim= scan.nextLine();//Kullanicidan String bir deger istedik tum satiri almasi ici nextLine sectik
        System.out.println("Lutfen memleketinizi giriniz...");
        String memleket= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz....");
        int yas =scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz....");
        short boy= scan.nextShort();
        System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu = scan.nextBoolean();
        System.out.println("********************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

        System.out.println("**************************************************************************");

        // EX 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz

        //1.Adim Scanner Class'indan Object olusturun
        Scanner inputt = new Scanner(System.in);
        //2.Adim Kullaniciya ne yapacagini soyle
        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");
        //3.Adim Kullanicidan aldiginiz datayi variable icine koyun
        double sayi1= inputt.nextDouble();
        System.out.println("Lutfen toplanacak olan ikinci sayiyi giriniz");
        double sayi2= inputt.nextDouble();
        System.out.println("Toplam "+(sayi1+sayi2));

        System.out.println("*****************************************************************************");

        //Ex : Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        // input==>12345==> 1+2+4+5
        //output ==> = 12

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz ");

        int num= input1.nextInt();//12345
        int ilkIkiRkm=num/1000;
        System.out.println("ilkIkiRkm ==> "+ilkIkiRkm);// 12

        int ilkIkiTop= (ilkIkiRkm % 10)+(ilkIkiRkm /10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);//3

        int sonIkiRkm= num % 100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);//45

        int sonIkiRkmTop = (sonIkiRkm %10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmTop = " + sonIkiRkmTop);//9

        int toplam= ilkIkiTop+sonIkiRkmTop;
        System.out.println("toplam = " + toplam);//12

        System.out.println("********************************************************************");

        //Kullanicidan bir dikdortgenin en ve boyunu alan ve
        // dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz
        //Dikdortgenin Alani =en*boy;
        //Dikdortgenin cevresi = 2*(en+boy)
        Scanner input13 = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        int en=input.nextInt();

        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz ");
        int boy1 = input13.nextInt();

        System.out.println("Alan ==> "+(en*boy1));
        System.out.println("Cevre ==> "+(2*(en+boy1)));

        System.out.println("**********************************************************************");

        //Kullanicidan aldiginiz sekil ile asagidaki gibi bir gorsel olusturunuz
           /*
                  A
                 A A
                A A A
         */
        Scanner input12= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz ");
        char ch= input12.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
        System.out.println("\t\t"+ch+"\t\t");
        System.out.println("\t"+ch+"\t\t"+ch+"\t");
        System.out.println(ch+"\t\t"+ch+"\t\t"+ch);

           /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        ctrl+ alt +l ==> windows icin sayfayi duzenler
        cmd + alt +l ==> mac icin sayfayi duzenler
        ctrl+z==> geri al
        ctrl +s ==> kaydeder
        ctrl+d ==> cogaltir
         */


    }

}
