package reglit;

import java.util.Arrays;

import static reglit.CharArray.NameToArray.nameToCharArray;

public class CharArray {
    public class NameToArray {
        public static char[] nameToCharArray(String name) {
            char[] charArray = new char[name.length()];
            for (int i = 0; i < name.length(); i++) {
                charArray[i] = name.charAt(i);
            }
            return charArray;
        }
    }

        public static void main(String[] args) {
            String name = "John";
            char[] charArray = nameToCharArray(name);
            System.out.println(Arrays.toString(charArray));
        }


}
