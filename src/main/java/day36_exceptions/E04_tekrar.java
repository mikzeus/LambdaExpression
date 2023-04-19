package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04_tekrar {
    public static void main(String[] args) {


        int arr[] = {9, 8, 7, 6};
        try {
            System.out.print("Good");
            System.out.print(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Better");
        }
        System.out.println("---------------------------------");
        String s2 = null;
        try{
            System.out.println(s2.length());
            System.out.print("Good");
        }catch(NullPointerException e) {
            System.out.print("Better");
        }
        System.out.println("-------------------------");

        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextFile");
        } catch(FileNotFoundException e) {
            System.out.println("Good");
        } catch(IOException  e) {
            System.out.println("Bad");
        //} finally {
         //   System.out.println("Not bad");
        }
    }
}
