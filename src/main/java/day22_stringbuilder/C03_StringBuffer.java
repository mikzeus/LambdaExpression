package day22_stringbuilder;

public class C03_StringBuffer {
    public static void main(String[] args) {
        // StringBuffer Java'da String üreten Calss'tır.
        // StringBuffer StringBuilder'e çok Benzez, ikisi de "mutable" String üretir.
        // StringBuffer "multi-thread" dir (çoklu iş), StringBuilder "multi-threat" değildir.
        // Java StringBuffer'ı StringBuilder'dan daha önce üretti.
        // StringBuilder "multi-thread" olmadığı için daha hızlı çalışır.
        // Multi-threat yapılırken yapılan işlerin sıralaması önem arz eder, yapılan işleri mantıklı sıraya koymak;
        //  "synchronization" olarak adlandırlır.
        // StringBuffer "multi-thread" olduğu için aynı zamanda "synchronized dir


        // 3 tane String oluşturan Class Öğrendik.Hangisini nezaman kullanılacak?
        // 1) immutable (değiştirilemez )Strinhg kullanılacaksa "String" Clas kulllanılacak.
        // 2) mutable String lazımsa; StringBuffer veya StringBuilder kullanılır
        //        i) StringBuilder'i multi-threat gerekmezse kullanırız
        //        ii) StringBuffer'i multi-threat gerekirse kullanırız

        StringBuffer sbf1= new StringBuffer("Java");

        System.out.println(sbf1);

        StringBuilder strBld = new StringBuilder("LearnJava");
        strBld.substring(3);
        System.out.println(strBld);

        //strBld.insert(0,"You");
        System.out.println(strBld);

        //strBld.reverse();
        System.out.println(strBld);

        strBld.delete(5, 9);
        System.out.println(strBld);



















    }//main
}//class
