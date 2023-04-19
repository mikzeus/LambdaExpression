package reglit;

public class Decriment {
    public static void main(String[] args) {

        int num = 0;
        System.out.print("Even Numbers from 20 to 0 are:");
        for (int i = 20; i >= 0; i -= 2) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
