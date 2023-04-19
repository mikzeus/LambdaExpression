package com.muner;

public class T10_ArraysTkr {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi Array 'dir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   Array  = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   Array = $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {

        String[]arr={"$13", "$15", "$20"};
        String[]arr1={"$-13", "$0", "$0"};

        System.out.println(getSum(arr));
    }
    private static int getSum(String[] x) {
        int toplam=0;
        for (String w:x) {
            String str=w.replace("$","");

            toplam+=Integer.parseInt(str);
        }
        if (toplam<0){
            return -1;
        }else {
            return toplam;
        }
    }
}


