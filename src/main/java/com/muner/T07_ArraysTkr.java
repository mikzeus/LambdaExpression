package com.muner;

import java.util.Arrays;

public class T07_ArraysTkr {

    public static void main(String[] args) {
 /*       //çok boyutlu Arr ı tek boyutlu Arr e çevirme
        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};
        int toplam=0;
        for (int []w:arr) {
            toplam=toplam+w.length;
            }
        int yeniArr[]=new int[toplam];
        int newindx=0;
        for (int []w:arr){
            for (int k:w){
                yeniArr[newindx]=k;
                newindx++;
            }

        }
        System.out.println("Yeni Dizi : " + Arrays.toString(yeniArr));


    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz


        System.out.println(sayiAdedi(arr));
        int counter = 0;

    }
    private static int sayiAdedi(int[][] arr) {
        int counter = 0;
        for (int[] w : arr) {
            for (int k : w) {
                counter++;
            }
        }
        return counter;

  */
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
                        //[7, 12, 97, 23, 543, 23, 675, 2, 2, 33, 6, 3, 7]
        int sum=0;
        int count = 0;
        // bu işlem ile toplam bulunuyor, kaç elemanlı oldupu bulunuyor
        for (int [] w: arr){
            System.out.print("yeni arr" +Arrays.toString(w));
            sum= sum+w.length;
            System.out.println( w.length);
            }
        System.out.println("Toplam:" +sum);

        int [] yeniArr= new int[sum];// yeni bir arr oluşturuluyor. toplam 13 eleman hesaplandı
        int yenindex=0;
        for (int [] w:arr){
            for (int k: w){
                yeniArr[yenindex]=k;
                yenindex++;
            }

        }

        System.out.println(Arrays.toString(yeniArr));
    }
}

