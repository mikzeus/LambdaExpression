package day14_loops;

import java.util.Scanner;

public class C05_Loops {
    public static void main(String[] args) {
        // kullanıdan username ve passwordu gir mesini isteyiniz
        // 3 kereden fazla yanlış girerse "Your Account was Blocked !!! " mesajı alsın
        // 3 kereye kadar yanlış girerse "Invaalid username or pasvord, try Again" mesajı alsın
        // doğru girerse "Welcome to your account

        Scanner scan = new Scanner(System.in);
        byte counter = 0;
        String validUserName = "mustafa";
        String validPassword = "12345";

        do {
            if (counter == 3){
                System.out.println("Your Account was Blocked !!! ");
                break;
            }

            System.out.println("Please Enter your username");
            String userName = scan.next();

            System.out.println("Please Enter your password");
            String password = scan.next();

            counter ++;

            if (userName.equals(validUserName) && password.equals(validPassword)){
                System.out.println("Welcome to your account");
                break;
            } else {
                System.out.println("Invalid username or pasvord");
                System.out.println(3-counter + " hakkiniz kaldi");
            }

        } while (true);

    }
}
