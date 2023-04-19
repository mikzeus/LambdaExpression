package day34_exception;

public class E01 {
    public static void main(String[] args) {
        // kod dünyasında umulmadık problemere exception denir.
        // umulmadık problemelere çözüm üretmeye "exception handling" denir.
        //1)"Exception" beklenmedik problem demektir
        //2)"Exception"i hallebilmek icin iki temel yol vardir
        //        i)"Exception"a uygun cozumler uretebilirsiniz "Exception Handling" denir
        //       ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz.
        //           buna da "Throw Exception" denir.
        //3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
        //  "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
        //  Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
        //  "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer
        //  ve "catch block" icindeki kodlar calisir.
        // 4)"try block" da islem yapilirken "Exception" olusursa
        // "try block" icindeki Exception'dan sonraki kodlar calistirilmaz

        System.out.println(divide1(12, 4));
        System.out.println(divide1(12, 0));

        System.out.println(divide2(12, 4));
        System.out.println(divide2(12, 0));
    }

    // I.way Exception i handle etmede ilk ve iğrenç yol
    public static int divide1(int a, int b) {
        if (b == 0) {
            return 0;
        } else
            return a / b;
    }

    // II. yol, Exception'ı handle etmede "harika yol"
    public static int divide2(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("ı m here");

        } catch (ArithmeticException e) {//"ArithmeticException" matematik ile ilgili
                                        // herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("do not divide any number by zero");
        }
        return result;

    }
}


