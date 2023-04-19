package day12_switchcase;

public class C01_SwitchLoop {
    // EX: ekrana 5 kere HI yazdırınız...

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("HI");
        }
        System.out.println("--------------------------");

        // EX: 11 DEN 15 E kadar olan sayıları yazdırın..
        for (int j = 11; j < 16; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        int sum = 0;

        int k;
        for (k = 40; k > 22; k--) {
            if (k % 2 == 0) {
                sum = sum + k;
                
            }
            System.out.print(k+" ");

        }System.out.print("toplam : " + sum + " ");

        System.out.println();
        System.out.println("------------------------------------------");

        for (int m = 18; m < 57; m++) {
            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
        }
    }
}
