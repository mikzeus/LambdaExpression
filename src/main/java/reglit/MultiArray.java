package reglit;

public class MultiArray {

    //Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
    //Input1={1,2,3,4}
    //Input2={5,6}
    //Output={1,2,3,4,5,6}


    public static int[] multiArr(int[] arr1, int[] arr2) {


        int[] result = new int[arr1.length + arr2.length];
        int index = 0;

        for (int w : arr1) {
            result[index++] = w;
        }
        for (int w : arr2) {
            result[index++] = w;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int newArr []=multiArr(arr1,arr2);
        for (int w:newArr){
            System.out.println(w + " ");
        }
    }


}
