package day37_exceptionsenums;

public class IllegalGradeExceptions extends Exception{
    /*
    1) Custom Exception Class oluşturarak Exception Class'a extends etmeliyiz, buna Compile Time Exception denir.
    2) Custom Exception Class oluşturken Constructor oluşturmalıyız. bu constructor parent daki constructoru çağırmalıdır.
    bu constructor mesaj vererek veya vermöeyerek şekilde oluşturulur
    3) Custom Exception Class oluşturduğunuzda ismin sonunda Exception kelimesini kulllanmalısınız.

     */
    public IllegalGradeExceptions() {
        super();
    }
   public IllegalGradeExceptions(String message) {
       super(message);

    }


}
