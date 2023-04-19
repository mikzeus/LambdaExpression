package day14_loops;

public class C02_Loops {
    public static void main(String[] args) {
        // Ex: 3 ten 8 e kadar olan tmasayıları ekrana yazdırın

        // I.way
        for (int i=3; i<9; i++) {
            System.out.print(i + " ");
        }

        // II.Way

        int i = 3;
        while (i<9){
            System.out.print(i + " ");
            i++;
        }

    }
}
