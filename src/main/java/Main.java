import java.util.*;

public class Main {

    /*
           int arr []= {3,18,7,9,13,-34,-4,-9,24};
           Scanner  scanner= new Scanner(System.in);
           System.out.println("lutfen bir sayi girin: ");
           int istenenToplam=scanner.nextInt();

           for (int i=0;i<arr.length;i++){
               for (int j=i+1; j< arr.length;j++){
                   if(istenenToplam==arr[i]+arr[j]){
                       System.out.println("Cikan sonuc: " + arr[i]+ " + " + arr[j] + " = " + (arr[i]+arr[j]));
                   }
               }
           }
               //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
               // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.


           int arr1[][]={{1,2},{3,4,5},{6}};
           int arr2[][]={{7,8,9},{10,11},{12}};

           for (int [] w:arr1) {
               for (int[] k : arr2) {
                   if (w.length == k.length) {
                       for (int i = 0; i < w.length; i++) {
                           System.out.println(w[i] + k[i] );
                       }

                   }
               }
           }
               // L!stede eleman olarak 15 varsa, tüm 15'ler! 51 olarak deg!st!r!n!z.
                // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
           List<Integer> number= new ArrayList<>();
           number.add(12);
           number.add(15);
           number.add(25);
           number.add(56);
           number.add(12);
           System.out.println(number);
           int aranan = 12;
           int count=0;
           for (Integer w: number){
               if (w==aranan){
                   number.set(count,21);
               }
               count++;
           }
           System.out.println(number);



           // B!r Str!ng l!stes!nde ver!len en düsük ve en büyük f!yatın toplamını bulunuz.
           // Örnek: L!st<Str!ng> myL!st = new L!st<Str!ng>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
           List<String> myList = new ArrayList<>();
           myList.add("$12.99");
           myList.add("$23.60");
           myList.add("$8.25");
           myList.add("$54.45");
           List<Double> myList1=new ArrayList<>();
           for (String w:myList){
               myList1.add(Double.parseDouble(w.replace("$","")));
           }
           Collections.sort((myList1));
           Double toplam=myList1.get(0)+myList1.get(myList.size()-1);
           System.out.println(toplam);


           ////Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod
           //    //yaziniz.
           //    //Not:
           //    //Mountain Array ==> [0, 2, 5, 3, 1]
           //    //Bir array elemanlari en büyük degerine kadar sürekli artan, en büyük deger!nden sonra sürekl
           //    //i azalan deger alıyorsa Maunta!n Array' d!r.
           //    //Mountain Array Deg!l ==> [5, 2, 7, 1, 4]
           //    //Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekl
           //    //i artan deger alıyorsa Mauntain Array degildir.

           Integer[] arr = {0, 2, 5, 3, 1};
           Integer[] arr1 = {5, 2, 7, 1, 4};
           ArrayList<Integer> myList = new ArrayList<>();
           Collections.addAll(myList, arr);
           System.out.println("yeni listem:" + myList);
           int uzunluk = myList.size() / 2;
           boolean sonuc = true;
           System.out.println(" uzunluk : " + uzunluk);
           if (myList.size() % 2 == 0) {
               System.out.println("Array mountain degildir");
           } else {
               for (int i = 0; i < uzunluk; i++) {
                   if (myList.get(i) < myList.get(i + 1)) {
                   } else {
                       sonuc = false;
                       break;
                   }
               }
               for (int i = uzunluk; i < myList.size() - 1; i++) {
                   if ((myList.get(i) > myList.get(i + 1))) {

                   } else {
                       sonuc = false;
                       break;
                   }
               }
           }
           System.out.println(sonuc);


           Scanner inp=new Scanner(System.in);
           System.out.println("lütfen satır sayısını giriniz:");
           int satırSayısı= inp.nextInt();

           for (int satırSırası=1; satırSırası<=satırSayısı; satırSırası++){
               for (int satırBosluk= 1; satırBosluk<=(satırSayısı-satırSırası); satırBosluk++){
                   System.out.print(" ");
               }
               for (int yıldızSayısı=1; yıldızSayısı<=(2*satırSırası)-1; yıldızSayısı++){
                   System.out.print("*");
               }
               System.out.println(" ");

           } for (int satırSırası = satırSayısı - 1; satırSırası > 0; satırSırası--) {
               for (int satırBosluk = 1; satırBosluk <= (satırSayısı - satırSırası); satırBosluk++) {
                   System.out.print(" ");
               }
               for (int yıldızSayısı = 1; yıldızSayısı <= (2 * satırSırası) - 1; yıldızSayısı++) {
                   System.out.print("*");
               }
               System.out.println();
           }


    public abstract class Ab01 {
        public int a = 10;

        public abstract void set(int a);

        public int get() {
            return a;
        }
    }

    public class Test extends Ab01 {
        public void set(int a) {
            this.a = a;
        }

        public void main(String[] args) {
            Test obj = new Test();
            obj.set(20);
            System.out.println(obj.get());
        }
    }


    public static void main(String[] args) {
        int sayac = 0;

        for (int k = 1; k < 101; k++) {
            for (int i = 1; i < k; i++) {
                if (k % i == 0) {
                    sayac++;
                }
            }
            if (sayac == 1) {
                System.out.print(k + " ");
            }
            sayac = 0;
        }
    }

     */

    public static void main(String[] args) {
          /* int arr[] = new int[3];
            System.out.println(arr[1]);

            arr[0] = 11;
            arr[1] = 12;
            System.out.println(Arrays.toString(arr));

            char arer[] = new char[4];
            arer[0] = 'A';
            arer[2] = 'E';
            arer[3] = 'M';
            System.out.println(Arrays.toString(arer));


            int arr[] = {0,11,12, 23, 12, 2, 3};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.binarySearch(arr, 12));



                String str = "Cok calis, mutevazi ol";
                String strArray[] = str.split(",");
                System.out.println(Arrays.toString(strArray));


        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        System.out.println(arr1 == arr2);// false
        System.out.println(arr1 == arr1);// true
        System.out.println(Arrays.equals(arr1, arr2));//true
        System.out.println(arr1.equals(arr2));//false


        char arr[] = new char[4];
        arr[0] = 'A';
        arr[2] = 'E';
        arr[3] = 'M';
        System.out.println(Arrays.toString(arr));//[A,  , E, M]

           //array i tek satırda yazma
        int[][] x = {{2, 1},{1, 7, 1}};

            int toplam=0;
            for (int[] w:x){
               toplam=toplam+w.length;

            }
        System.out.println(toplam);


            int arr[]= new int[toplam];
            int indx=0;
            for (int []w:x){
                for (int k:w){
                arr[indx]=k;
                indx++;

            }


        }
        System.out.println(Arrays.toString(arr));
        System.out.println("#######################################");

        System.out.println(m(x[1]));
    }
    public static int m(int[] m) {
        int result = 0;
        for (int i = 0; i < m.length; i++){
            result += m[i];
        }
        return result;

           */

            int[][] x = {{2, 1}, {5, 7, 6}};
            System.out.println(m(x));
        }
        public static int m(int[][] m) {
            int result = m[0][1];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (result < m[i][j]) {
                        result = m[i][j];
                    }
                }
            }
            return result;







    }

}//class


