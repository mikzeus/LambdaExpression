package reglit;

import java.util.Scanner;

public class HarfBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");
        String word = scan.nextLine().toLowerCase();

        System.out.println("enter a character");
        char ch1 = scan.next().charAt(0);

        int numberOfCharacter = 0;

        for (char i = 0; i < word.length(); i++) {
            if ((word.charAt(i) >= 'a') && (word.charAt(i) <= 'z')) {
                if (word.charAt(i) == ch1)
                    numberOfCharacter++;
            }
        }
        System.out.print(numberOfCharacter + " ");
    }
}
