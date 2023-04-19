package day13_switchincreament;

public class C04_ForLoop
{

    public static void main(String[] args)
    {

        //Example 1: Verilen bir string'de ilk 'a' harfinden onceki tum karakterleri console'a yazdiriniz

        String str = "I Love Java";
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == 'a')
            {
                break;
            }
            System.out.print(ch);
        }

        System.out.println();

        //Ex: verilen string te son "a" dan sonraki tüm karakterleri tersten yazdırınız..

        String s = "Germany";
        for (int i = s.length() - 1; i >= 0; i--) {

            char chr = s.charAt(i);
            if (chr == 'a') {
                break;
            }
            System.out.print(s.charAt(i));
        }
    }
}
