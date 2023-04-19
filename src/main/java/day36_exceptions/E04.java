package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotActiveException;

public class E04 {//mehmet hoca

    /*
    1)FileNotFoundException ve IOException Compile Time Exceptionlardir, yani code'u yazarken hata aliriz
    2)FileNotFoundException path'in dogrulugu ve dosyanin varligi ile ilgilidir
      IOException tum input ve output islemleri ile ilgilidir
    3)IOException Class, FileNotFoundException Class'in parent'idir
    4)Istenirse FileNotFoundException yerine IOException da kullanilabilir
    5)IOException class ve FileNotFoundException beraber kullanilcaksa FileNotFoundException ustte, IOException
    altta kullanilmalidir
 */

    public static void main(String[] args) throws FileNotFoundException {

        try {

            FileInputStream fis = new FileInputStream("src/main/java/day36_exceptions/TxtFile");// okumamı istediğin dosyanın adresini gir

            int k = 0;
            while (((k = fis.read()) != -1)) {
                System.out.print((char) k);

            }
        }catch (FileNotFoundException e){
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
