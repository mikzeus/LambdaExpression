package day21_datetime;

public class C03_Varargs {
    public static void main(String[] args) {
        add(2, 3, 7, 8, 3, 5);
       getInitials("Ali Can", "Kemal Han");
    }
    //Ex 1:toplama işlemi yapan bir method oluştur

    // aşağıdaki gibi methodlar oluşturarak iş yapamayız.
    // çünkü kullanıcı farklı sayida sayıları toplamak isteyebilir.
    // her ihtimail için bir method oluşturamayız.
/*
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

 */

    // Farklı sayıdaki parametrelerin hepsini kabul eden bir yapı oluşturuldu.
    // bu yapıya "VARARGS" denir.. varargs ... üç nokta ile sembolize edilir.
    // Varargs arkada "Array" yapısını kullanır. her data tipi varargs de kullanılabilir.
    /*
        1)Bir method parantezinde bir'den fazla "Varargs" kullanilamaz.
        2)Bir method parantezinde bir'den fazla parametre kullanilacaksa "Varargs" en sonda olmalidir.
    */

    public static int add(int... a) {
        int sum = 0;
        for (Integer w : a) {
            sum = sum + w;

        }
        System.out.println(sum);
        return sum;
    }

    // Ex 2: verilen isimleri ilk harflerini konsola yazdıran kodu yazınız.
    // Ali Can ==> AC veya Kemal Han ==>KM

    public static void getInitials(String... s) {

        String initials = "";
        for (String w : s) {
            initials += w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }


    }
}
