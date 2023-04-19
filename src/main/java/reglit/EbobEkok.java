package reglit;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int GCD = 1, LCM;

        for (int i = 1; i <= s1 && i <= s2; i++) {
            if (s1 % i == 0 && s2 % i == 0) {
                GCD = i;
            }

        }
        System.out.println("GCD for s1 and s2 : " + GCD);

        LCM = (s1 > s2) ? s1 : s2;

        for (int i = LCM; i < s1 * s2; i++) {
            if (i % s1 == 0 && i % s2 == 0) {

            }
        }
        System.out.println("Ekok : " + LCM);
    }

}
