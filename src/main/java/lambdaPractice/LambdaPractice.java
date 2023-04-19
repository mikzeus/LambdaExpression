package lambdaPractice;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        elemanYazdir(nums);
        System.out.println();
        arrElemanYazdir (nums);
        System.out.println();
        ciftElemanYazdir (nums);
        System.out.println();


    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanYazdir(List<Integer> nums){
        System.out.print("1) ");
        for(Integer w:nums){
        System.out.print(w+ " ");
        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void arrElemanYazdir (List<Integer> nums) {
        System.out.print("2) ");
        nums.stream().forEach(t-> System.out.print(t + " "));

    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElemanYazdir (List<Integer> nums){
        System.out.print("3) ");
        for (Integer w:nums){
            if (w%2==0){
                System.out.print(w+ " ");
            }
        }
        System.out.println();
        System.out.print("3.1) ");
        nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+ " "));
    }



    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
/*

        Bu sorudaki fark ayrica sayilarin toplami istenmis. reduce metodu kullanmaliyiz. reduce ile coklu data tekli dataya
        donecek. metodumuzu integer olarak olusturduk. Parametresi arraylist
        stream ile elemanlar yukaridan asagiya siralandi. Benzersiz dendigi icin basta distinct metodu kullanilarak
        elemanlar azaltildi. filter metodu ile cift sayilari aldik. map metodu ile sayilarin kareleri alindi.
        Devaminda reduce metodu icinde Math Class'indan addExact ile toplama yapildi ve get metodu eklendi.
        Cunku integer olarak sonucu almak istedik. get metodu optional data type'ini integer'a ceviriyor.
        Get metodunu kullnamasaydik, hata alirdik. Bu defa forEach metodu ile yazdirma yapilmadi.
        Metodumuz integer olup bize integer dondurulmesi icin baslangic kismina return keywordu ile basladik.
         Main metod icinde sout'u yazdirinca sonucu ekranda gorduk.
*/


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz


    //9)Liste ogelerinden max degeri veren bir method olusturunuz

/*

        Bu sorudaki fark elemanlardan max deger isteniyor. Metodumuzu olusturduk.
        1. Yol:
        Maximum degeri bulabilmek icin coklu datayi tekli dataya dusurmeliyiz. Cunku birden fazla ayni sayilar olabilir.
        reduce metodu icinde Integer Classini yazarak bu Class'daki metodlari kullandik. Uygun olan MIN_VALUE olup devaminda
        parantez icine iki sayi verdik. Bu sayilari t ve u harfleri temsil edecek sekilde yazdik. ve devaminda ternary
        yapisi ile sayilardan t u'dan buyukse diye sorduk. Kodumuzu max isimli Integer bir conteynerine assign ettik.

        int Max=nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->>u ? t: u);

        stream metodu ile elamanlari stream'e cevirdik ve hepsi alt alta yazildi. reduce metodu ile elemanlari indirge dedik.
        reduce metodu icinde Integer.MIN_VALUE baslangic deger demektir. t her zaman ilk degerini baslangic degeri
        dedigimiz Integer.MIN_VALUE'yi alir,  Integer.MIN_VALUE degeri -2 milyar.
        Bu sabit bir deger. u ise stream icinde siralanan bastaki degeri alir. t daha sonra stream'deki
        ikinci degeri alir.  Sirasiyla t>u kisminda iki sayi deger aldikca karsilastirilir.
        Basta -2 milyar>12  12 daha buyuk. Bu sekilde biz buyuk olani bulduk.

        3.YOL(Son yaptigimiz)/2.yol olarak yazdik.
        burada sorted metodu kullanmadik. distinct ve reduce metodlarini yine kullandik. reduce metodu icinde nums.get(0)
        nums'in ilk indexteki elemanini, degeri aldi dedik. nums.get(0), (t,u)->t>u ? t :u );
        get(0) ile ilk degerimiz 0.nci indexteki deger olacak.
        Iki onceki yolda baslangic degerimiz Integer.MIN_VALUE idi. Simdi t baslangictaki
        deger olarak 0.nci indexteki degeri alir. Listimizde ilk eleman 12 idi. U ise ikinci indexteki elemani alacak.
        Listimiz icinde 2. index 9. Burada 12 9'dan buyuk mu diye bakacagiz.
        Buyuk oldugu icin true olacak ve sirasiyla bu sekilde devam edecek.
        Boylece en buyuk sayi elimizde kalacak ve sonucta gorebiliriz.
*/


    //10)Liste ogelerinden minumum degeri veren method olusturunuz
    /*
    Integer min=nums.stream().distinct().reduce(Integer.MAX_VALUE(t,u)->t<u ? t : u) ;
    reduce metodu icinde t ve u'yu kullaninca ve baslangic degerleri alinirken stream icindeki datalarin alinmasina gore sabit deger olan
    Integer.MIN_VALUE ya da Integer.MAX_VALUE'dan alinmasi halinde kodumuz daha hizli calisir.
    MAX_VALUE burada 2 milyar olup bu sabit bir degerdir.
    Buarada t 2 milyar ile basladi ve u ile kiyaslama yapilinca kucuk olan sayi hep elimizde kalir.
    Bu sabit degeri almak daha kolaydir. Sorumuza gore MAX ya da MIN_VALUE'yu baslangic degeri yapariz.
    Reduce metodu icinde onceki soru cozumunden farkli olarak t<u mu diye sorduk. Oncekinde t>u mu demistik.
     Cunku burada en kucuk olani bulmaliyiz.
     */

}
