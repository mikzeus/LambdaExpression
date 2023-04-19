package reglit;

public class Array {
    //Write a method that accepts an array as parameter and returns sum off all elements in the array
    //    // Then print the result in the main method.
    //input : {1,2,3,4,5,6,7,8};
    //output: 36

    public static int arrPrint(){
        int []input ={1,2,3,4,5,6,7,8};
        int sum= 0;
        for (int w:input) {
            sum+=w;


        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        arrPrint();
    }



}
