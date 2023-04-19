package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
        // II.Way
        try {
            FileInputStream fis=new FileInputStream("src/main/java/day36_exceptions/TxtFile");

           int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);//ascii değeri char'a cevirdik
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or file does not exist..");
        } catch (IOException e) {
            System.out.println("Some Characters could be read");
        }


    }
}
