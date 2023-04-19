package reglit;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter An integer");
        int num = scan.nextInt();
        int sum=0;

        for (int i=1 ; i<num;i++){

            if (num%i==0){
               sum+=i;
            }
        }
        if (sum==num)
            System.out.println("Num is perfect Number..");

        else System.out.println("Num is NOT perfect Number..");

        System.out.println("sum of its positive divisors: " +sum);

    }
}
