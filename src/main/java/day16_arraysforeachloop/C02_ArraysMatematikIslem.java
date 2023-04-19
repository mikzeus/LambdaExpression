package day16_arraysforeachloop;

import java.util.Scanner;

public class C02_ArraysMatematikIslem {
    public static void main(String[] args) {

        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun

        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */

        Scanner scan = new Scanner(System.in);
        char opr = ' ';

        do {
            System.out.println("enter the operation you want to do +, -, *, /, %");
            opr = scan.next().toLowerCase().charAt(0);

            if (opr == 'q') {
                System.out.println("operation was finished");
                break;
            }
            boolean r = opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%';

            if (!r) {
                System.out.println("Undefined operation");
                break;
            }
            System.out.println("Enter the First number");
            int num1 = scan.nextInt();

            System.out.println("Enter the second number");
            int num2 = scan.nextInt();


            switch (opr) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case '%':
                    System.out.println(num1 + " % " + num2 + " = " + (num1 * num2) / 100);
                    break;
            }
        } while (opr != 'q');
    }
}

