package day17_multidimensionalarray;

import java.util.Arrays;

public class ikiBoyutluArray {
    public static void main(String[] args) {

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        int numbers[][] = { {5, 4}, {2, 3, 2},{3,5,6} }; // ==> { 5, 4, 2, 3, 2 }
       //ilk olarak array'daki eleman sayısını bulacağım

        int elemanSayisi=0;
        for (int[] w: numbers) {
            elemanSayisi=elemanSayisi+ w.length;
        }
        System.out.println(elemanSayisi);

        int newArr []= new int[elemanSayisi];

        int idx=0;
        for (int[] w: numbers){
            for (int k:w){
                newArr[idx]=k;
                idx++;

                for (int t:newArr){

                }
            }
        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr.length);



    }
}
