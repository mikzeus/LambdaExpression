package day13_switchincreament;

import java.util.Scanner;

public class C02_Loops {
    public static void main(String[] args) {
        // ex: 4 en 24 e kdar tamsayı yazdırın
        Scanner scan = new Scanner(System.in);
            //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz
           // String s="MassachusettsAEİOU";
        System.out.println("lutfen kelime girin: ");
        String s= scan.next();
            for (int i=0; i< s.length();i++){

                char c=s.toLowerCase().charAt(i);

                if (c >= 'a' || c <= 'z') {
                    System.out.print(c+ " ");

                }

            }
        }
    }

