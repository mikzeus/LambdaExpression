package day18_constructorsstatickeyword;

public class MethodOverLoading {
    /*
    1) bir method "aynı isim" ve "farklı parametre"lerle oluşturulursa buna "Method Overloading" denir.
        aynı isimle farklı işler yapabilen methotlar.
    2) "Method Overloading" iyi organizasyon için önemlidir.
    3) "Method Overloading" yaparken parametre 3 şekilde değiştirilebilir:
        a) parametrelerin sayıları değiştirilebilir.
        b) parametrelerin data tipleri değiştirilebilir.
        c) parametrelerin data tipleri farklı ise yerleri değiştirilebilir.
     */
    public static void main(String[] args) {

        String s= "Sabir";
        System.out.println(s.substring(0, 1));

        System.out.println(s.replace("a", "e"));


    }


    public static int add(int a, int b){
        return a+b;

    }public static int add(int a, int b, int c){
        return a+b+c;

    }
    public static double add(double a, int b){
        return a+b;
    }
    public static double add( int a, double b){
        return a+b;
    }

}
