package day18_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueEleman {
    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(benzersizYap(arr)));
    }

    private static int[] benzersizYap(int[] arr) {

        Set<Integer> uniqueNum = new TreeSet<>();
        for (int each : arr){
            uniqueNum.add(each);
        }
        System.out.println(uniqueNum);//[1, 2, 3, 4, 5]

        int arr2[]=new int[uniqueNum.size()];
        int indx=0;//setlerin indeksi olmadığından indexi kendimşz oluşturduk
        for ( Integer each:uniqueNum ) {
            arr2[indx]=each;
            indx++;
        }
        System.out.println(Arrays.toString(arr2));

        arr=arr2;
        return arr2;


    }

}
