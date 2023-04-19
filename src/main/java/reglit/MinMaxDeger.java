package reglit;

import java.util.Arrays;

public class MinMaxDeger {
    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
    Input : {3,2,5,4,1,6}
    Output :
    min: 1
    max: 6

     */

    public static void main(String[] args) {
        integerArray();
    }

    private static void integerArray() {
        int[] input = {3, 2, 5, 4, 1, 6};
        Arrays.sort(input);
        System.out.println("Min: " + input[0] );
        System.out.println("Max: " +input[input.length - 1]);


    }
}


