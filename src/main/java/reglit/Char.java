package reglit;

import java.util.Arrays;

public class Char {
    /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.

                (do not use toCharArray() method)

        Input : John

        Output :[J, o, h, n]

     */
    public static void main(String[] args) {
        String name = "John";

        char[] arr = charArray(name);
        System.out.println(Arrays.toString(arr));
    }

    private static char[] charArray(String name) {

        char[] arr = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            arr[i] = name.charAt(i);
        }
        return arr;
    }
}



