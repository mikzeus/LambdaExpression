package day16_arraysforeachloop;

import java.util.Arrays;

public class Array_Tekrar {
    public static void main(String[] args) {

        int arr[] = {10, 11, 9};

        for (int i = 0; i <arr.length; i++) {
            System.out.print("ilk arr: " + arr[i] + " ");
        }
        System.out.println();
        int arr2[]={2,3,7,11,4};
        int are []= {7,4,2,3,11};
        Arrays.sort(arr2);
        Arrays.sort(are);
        System.out.println("Sırala: " + Arrays.equals(arr2,are));//true


        String str = "What about Java, did you like it";
        String arr3 []=str.split("");//
        System.out.println("üçüncü sıra: " + Arrays.toString(arr3));
        String arr1[]=str.replaceAll("[^a-zA-Z]","").split("");
        System.out.println("dorduncu Sıra: " + Arrays.toString(arr1));
        System.out.println("4.nün uzunlugu " + arr1.length);


    }
}
