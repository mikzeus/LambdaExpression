package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
    Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk.
 Listimize add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve
   devaminda Clara'yi bu sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor.
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);//Tom Jim Clara
        System.out.println();
        printEl(myList);//Tom Jim Clara
        System.out.println();
        printElExceptStartsWithT(myList);//Jim Clara
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printBigLetter(myList);
        System.out.println();
        printLittleLetter(myList);
        System.out.println();
        printUniqueLetterSorted(myList);
        System.out.println();
        printBigShortSortedwithLenght(myList);

    }

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1. Yol:
    public static void printElements(List<String> myList) {

        for (String w : myList) {         //==>Structured Programming
            System.out.print(w + " ");

        }
    }

    //2. Yol:
    public static void printEl(List<String> myList) {

        //Functional Programming
        myList.stream().//stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
                forEach(t -> System.out.print(t + " "));
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("T")).forEach(t -> System.out.print(t + " "));
    }
    //Example 3: Bir List'te character sayisi 4'den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String >myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));
    }
    //Example 4: Bir List'te character sayisi 4'den çok olan tum elemanlari büyük harflerle console'a yazdiran method'u olusturunuz.

    public static void printBigLetter(List<String >myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.println(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle console'a yazdiran method'u olusturunuz.
    //Elemanlari azaltan methodlar genellikle once kullanilir. Yazdigimiz kod buyudukce okumak zorlasir.
    // Functional programming sayesinde kodumuzu daha okunur hale getirmis oluruz.
    public static void printLittleLetter(List<String >myList) {
        myList.
                stream().
                distinct().// distinct burada unique yapıyor.
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).// map burada update ediyor
                forEach(t -> System.out.print(t + " "));
    }
    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printUniqueLetterSorted(List<String >myList) {
        myList.
                stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+ " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle küçükten büyüğe siralayarak
    // console'a yazdiran method'u olusturunuz.
    public static void printBigShortSortedwithLenght(List<String >myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
        //Note: Siralamayi bir sarta baglayacaksak sorted(Comparator.comparing()) kullanmaliyiz
    }
   /*
    Listimizi steram'e cevirdik, filterelemeye gerek yok, tekrarsiz olarak istendiginden distinc methodunu kullandik ve
    kucuk harflere cevirmemiz gerektiginden map'den toLowerCase methodunu kullandik. Bizden kucukten buyuge bir
    siralama istendiginden sorted methodunu aldik. Bu method icinde karsilastirma yapilmasi icin Comparator.comparing
    yazdik. Boylece uzunluklara gore siralama olacak. sorted(Comparator.comparing(t->t.length)
    Siralamayi biz yapacaksak Comparator.comparing kullanmaliyiz.
    Methodu main method icinde cagirdik ve ekranda tom iki kez olmasina ragmen bir kez yazildi ve
    length'i en kisa olanlarin basa alindigini, tum elemanlarin kucuk harfle yazildigini gorduk.
    */

}
