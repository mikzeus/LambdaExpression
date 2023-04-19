package day41_lambda;

public class Utils {
    // day41_lambda.Utils her projede vardır, utilities, helper gibi kullanımları vardır. faydalı methodların depolandığı yerdir.
    public static int square(int a) {// karesini al
        return a * a;
    }


    public static boolean isOdd(int s) {// tek mi çift mi
        return s % 2 != 0;
    }

    public static int getSumOfDigits(int a){// rakamları topla
        int sum = 0;
        while(a>0){
            sum = sum + a%10;
            a = a/10;
        }
        return sum;
        }
    }



