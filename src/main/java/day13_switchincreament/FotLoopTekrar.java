package day13_switchincreament;

import java.util.Scanner;

public class FotLoopTekrar
{
    public static void main(String[] args)
    {
        // Ex: kullnıcıdan alınan stringin ilk a harfinden sonra gelen karakterleri tersten yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scan.nextLine();

        for (int i= str.length()-1; i>=0;i--)
        {

            char ch = str.charAt(i);
            if (ch=='m')
            {
                break;
            }
            System.out.println("belirtilen harften sora gelen harfler: " +ch);
        }

        System.out.println("----------------------------------------------");

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz

        for (int j= 0; j<str.length(); j++)
        {

            String s = str.substring(j,j+1);

            if (j%2==0)
            {
                System.out.println("çift sayı olan karaketeler: " +s);
            }
        }
        System.out.println("-------------------------------------");

        //Example 1: Verilen bir string'de ilk 'a' harfinden onceki tum karakterleri console'a yazdiriniz

        for (int k=0; k<str.length(); k++)
        {

            char ch = str.charAt(k);
            if (ch=='a')
            {
                break;
            }
            System.out.println("a harfinden önceki tüm harfler: " + ch);

        }

    }
}
