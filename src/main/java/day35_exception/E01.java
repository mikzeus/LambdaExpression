package day35_exception;

public class E01 {
    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2);
        System.out.println(convertStringToInt("12ab") + 2);

    }

    //Bir String'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str){

        try{
            return Integer.valueOf(str);
        }catch(NumberFormatException e){//NumberFormatException valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.
            str = str.replaceAll("[^0-9]", "");
            return Integer.valueOf(str);
        }
    }
}
    /*
    Stringden karakter almak icin charAt() kullaniriz. getCharFromString isimli methodumuz icine
    parametre olarak String olan "Java"yi yazdik ve virgul sonrasi index olarak 2 yazdik
    ve Java sout icine bunu yazip calistirmamiz ile hata verdi. Olmayan indexi istedigimiz icin
    exception olustu. indexin negatif bir sayi olmasi halinde Math.abs() methodu ile negatif indexi
    pozitife cevirebiliriz. Exception'i handle ederken catch kisminda Math.abs(idx); yazarak problemi
    giderebiliriz. Pozitif sayiya donusen indexi int olan index'e tekrar aktardik.

    Index 8 ise, 8.indeximiz yok. Bunun exception'a neden olmamasi icin indexi modules
    kullanarak lengthden az cikmasini saglariz. Modules bize kalani verir ve kalan lenghden daha kucuk olacaktir.
    Ornegimizde 8. indexi modules ile 4'e bolduk ve kalan 2 oldu. Neden 4'e bolduk? Cunku bizim Stringimizin
    lengthi 4'tur. Modules islemi sayesinde olmayan degil olan indexi istemis oluruz.
     */
