package day34_exception;

public class E02 {
    public static void main(String[] args) {
        String[] str = {"A", "V", "A", "J"};
        System.out.println(getElement(str, 4));
        System.out.println(getElement(str, 1));
        System.out.println(getElement(str, 2));
        System.out.println(getElement(str, 3));

        System.out.println(getElement(str, 6));//ArrayIndexOutOfBoundsException
                                                            //Index 5 out of bounds for length 4
        System.out.println(getElement(str,-3));

    }

    // Bir String ARR den istenilen bir elemanı eleman sırasına göre çağıran methodu ouluşturalım
    public static String getElement(String[] str, int numOfElement) {

        String result="";

        try {
            result=str[numOfElement - 1];
        }catch (ArrayIndexOutOfBoundsException e){

            if (numOfElement<0){

                result = str[0];//
            }else
                result=str[str.length-1];
        }

        return result;
    }



}
