package day13_switchincreament;

public class C03_ForLoop {
    public static void main(String[] args) {
        // Ex: 21 den 180 e kadar hem dört hem de 6 ile bölünebilen tamsayıları ekrana yazdıarn kodu yazınız..

        for (int i = 21; i < 181; i++) {

            if (i % 6 == 0 && i % 4 == 0) {

                System.out.print(i + " ");

            }
        }

        System.out.println();
        //Example 2 : Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//             ankara ==> AKR

        //Note : Bir string'de son index her zaman length()-1
        //Note : Yazdiginiz kod belli senaryolar icin calisiyor ancak tüm senaryolar icin calismiyorsa;
        //bu tarz koda ==> hard-code denir ==> ve mutlaka düzeltilmelidir

        String s = "finished";

        for (int i = 0; i < s.length(); i++)
        {
            String ch = s.substring(i, i + 1);
            if (i % 2 != 0)
            {
                System.out.print(ch.toUpperCase());
            }

        }
        System.out.println("----------------------");

       for (int i=s.length()-1 ; i>=0;i--){ // stringi tersten yazdırır
           char sc= s.charAt(i);
           System.out.print(sc);
       }
    }
}


