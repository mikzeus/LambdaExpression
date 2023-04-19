package day18_constructorsstatickeyword;

public class NonStaticBloks {

    String name;
    boolean isOld=false;
    int price;

    public NonStaticBloks(){

        System.out.println("first constructor");

    }
    public NonStaticBloks(int price){

        System.out.println("second constructor");

    }
    public NonStaticBloks(String name){

        System.out.println("third constructor");

    }
    public NonStaticBloks(boolean isOld){

        System.out.println("forth constructor");

    }
    // Non-Static Block, constructorlerde çalıştırılması gereken "ortak kodları" içerir. non static blokların içerisine
    // yazılan kodlar her constructor icin çalıştırılır.

    {
        System.out.println("I am Constructor");
    }

    public static void main(String[] args) {
        NonStaticBloks o1=new NonStaticBloks();
        NonStaticBloks o2=new NonStaticBloks(12);
        NonStaticBloks o3=new NonStaticBloks("gomlek");
        NonStaticBloks o4=new NonStaticBloks(false);


    }

}
