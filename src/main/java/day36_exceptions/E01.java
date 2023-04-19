package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /*
        1-) Run butonuna bastıktan sonra consoldan alınan Exceptionslara
            "Runtime Exceptions " denir
             Aritmetic Exp., NullPointter Exp., NumberFormat Exp., ArrayIndexOf Exp.,
               StringIndexOf Button Exp. 'lar Runtime Exceptions'a örnektir.
            "Runtime Exceptions " lara " UNchecked Exception" da denir

        2-) Code yazarken kırmızı alt cizgi seklinde gözüken Expception'lar vardır.
             Bunlara " Compile Time  Exp. " denir.
             FileNotFoundExpception , IDEException   " CTE" örnektir
             " Compile Time  Exp " lara Checked Expception' da denir.

        3-)  FileNotFoundExpception : Java^ya bir dosyayı bul dediginizde , java "Dosyanın adresi " ve "Dosyanın varlıgı"
                                      konusunda hata olursa ne yapması gerektigini soylememizi ister.

       4)IOException: "IO" Input Output demektir.
                    Note: IOException, FileNotFoundException'in parent'idir.

        5-) Java da hatalar temelde 2 ye aayrılır.
                i) Exception'lar
                ii) Error'lar
                       a--StackOverFlow Error
                       b--Out Of Memory Error
                       c--Virtual Machine Error
             Exception' lar handle edilebilir hatalardir.Lakin Error'lar asla handle edilemezler

           //###############################################################################

        "throws" ile "throw" arasindaki farklar nelerdir?
    1)"throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
    2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
    "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
    3)"throws"dan sonra sadece exception class isimleri yazilir, "throw"dan sonra ise Exception class'dan
    object olusturulur. Ornegin throw new IllegalArgumentException

            * throw ile throws keywordleri arasindaki fark nedir?
        1)"throw" method bodysi icinde, "throws" ise method parantezinden hemen sonra kullanilir.
        2) "throw" method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
            "throws" ise method parantezinden hemen sonra ve sadece 1 kere kullanilabilir.
        3) "throw" dan sonra "new" keyword ve constructor kullanilarak object olusuturulur
        *   "throws" dan sonra sadece Exception Class ismi yazilir
        4) "throw" belli sartlar icin Exception atmada kullanilir
            "throws" ise applicationu Exception attiktan sonra durdurur.

         */
    public static void main(String[] args) throws IOException {
//I.Way: Exception'ı methot()Signiture satırına ekledik
        FileInputStream fis = new FileInputStream("src/main/java/day36_exceptions/TxtFile");

        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);//ascii değeri char'a cevirdik
        }

    }
}
