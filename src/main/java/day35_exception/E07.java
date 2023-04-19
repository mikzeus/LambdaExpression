package day35_exception;

public class E07 {
    /*
       * throw keyword bir method bodysi icinde istedigimiz yerde, istedigimiz kosullar icin,
       istedigimiz kadar Exception atmamizi saglar
       * throw keywordu yazildiktan sonra bir Exception Class Objecti olusturulur.
       * Exception class constructor inin parantez icine istedigimiz Exception mesajini yazabiliriz

   */
    public static void main(String[] args) {
        printAge(160);


    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else if(age>150){
            throw new IllegalArgumentException("Yas 150 den buyuk olamaz");
        }
        else{
            System.out.println(age);
        }


    }

}
