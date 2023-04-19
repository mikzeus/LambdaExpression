package day34_exception;

public class E03 {
    /*
            Method olusturduktan sonra bir string olusturduk. s isimli String sayesinde length
        methodunu kullanabildik. String'imiz "Java" idi. length 4'u verdi. String "Money" oldugunda
        length methodu ile 5'i aldik. Bos String'de "", 0 verdi. sout icine String olarak null
        koyunca hata verdi, ekranda exception gorduk. Cunku bazi String methodlari null ile calismaz.

        Hata alinca bu hatayi nasil handle edebiliriz?
        try ve catch kullanmaliyiz. catch parantezi icinde NullPointerException e yazdik,
        oncesinde int result=0; yazmamiz gerektigini hatirladik ve yazdik.
        Olumsuz senaryoya karsi return 0; yazarak null'i bos String gibi kabul ettik. Daha sonra
        return result; yazdik ve bize 0'i verdi.

        Daha sonra sout icinde bir mesaj vermeye karar verdik.
        "Some String methods do not work with null..."
        Javada daha teknik mesajlar verilebilir.
        Exeption yaninda e harfi yazili ve biz e'yi aldik,
        e.getMessage() yazdik sout icinde. Bu mesaj ile java null yazdirdi.
        Javanin exception icin urettigi teknik mesaji varsa verir.
        NullPointerExeception String class'da null ile uyumlu olmayan methodlar kullanildiginda atilir.
     */
    public static void main(String[] args) {

        System.out.println(getNumofChars("java"));
        System.out.println(getNumofChars("Money"));
        System.out.println(getNumofChars(""));
        System.out.println(getNumofChars(null));

    }
    // Bir String'deki character sayısını veren methot oluşturunuz.

    public static int getNumofChars(String s){

        int result=0;
       try {
           result=s.length();

       }catch (NullPointerException e){
           System.out.println("Some String methods are not work via null");
           System.out.println(e.getMessage());
       }
       return result;

    }
}
