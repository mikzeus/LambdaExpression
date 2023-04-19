package reglit;

public class OrtalamaHesap {
   // Write a java program that calculates the average value of array elements

    //input[]= {1,2,3,4,5,6,7}

    //Output : 4
    public static void main(String[] args) {
        int toplam=0;
        int ort=0;
        int input[]= {1,2,3,4,5,6,7};
        for (int w:input){
            toplam+=w;
           ort= toplam/w;
        }
        System.out.print(ort);
    }

}
