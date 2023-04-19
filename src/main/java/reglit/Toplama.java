package reglit;

public class Toplama {
    /*

Write a Program to find the sum of natural numbers from 1 to 100.
OUTPUT 		:   Sum of Natural Numbers 5050
*/
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<101;i++){
            sum+=i;

        }
        System.out.println(sum);
    }
}
