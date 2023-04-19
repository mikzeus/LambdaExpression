package day14_loops;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.IconUIResource;
import java.util.Locale;
import java.util.Scanner;

public class C03_WhilLoops {
    public static void main(String[] args) {

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String str = "miamı";
        int m = 0;

        while (m < str.length()) {
            String ch = str.substring(m, m + 1);
            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }
            m++;// bu unutulursa sonsuz loop oluşur.infinite loop application donar..
        }

        System.out.println();

        // verilen tamsayının rakalmarı toplamını yazdıran kodu yazınız.

        int r = -578;
        r=Math.abs(r);
        int sum = 0;

        while (r > 0) {

            sum= sum+r%10;


            r = r / 10;
        }
        System.out.println(sum);

            // kullanıcıdan alınan sayı için çarpım tablosu oluşturan kodu yazınız:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        short a= scan.nextShort();
        int u=1;
        while (u<11){

            System.out.println(a + "x" + u +"=" + (a*u));

            u++;
        }
        // kullanıcıdan alınan string deki sessiz harfleri konsola yazdırın.

        System.out.println("Enter a word :");
        String y = scan.next();

        int z=0;
        while (z<y.length()){
            char ch= y.charAt(z);

            boolean t = ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='ı'||ch=='u'|| ch=='ü'
                    ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';

            if (t){
                z++;
                continue;
            }else {
                System.out.print(ch);
            }

           z++;
        }
    }
}
