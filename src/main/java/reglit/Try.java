package reglit;

//public class OrnekCozumler {
// public static void main(String[] args) {
/*
        int y = -17;
        boolean result = (y % 2 == 0 || y < 13) ? (true) : (y < 0 ? true : false);
        System.out.println(result);

        int i = 1;
        int j = 0;
        switch (i) {
            case 2:
                j += 6;
                break;
            case 4:
                j += 1;
                break;
            case 1:
                j += 4;
                break;
            default:
                j += 2;
        }
        System.out.println("j = " + j);

        char ch = 'a';
        switch (ch) {
            case 'a':
            case 'A':
                System.out.print(ch);
                break;
            case 'b':
            case 'B':
                System.out.print(ch);
                break;
            case 'c':
            case 'C':
                System.out.print(ch);
                break;
            case 'd':
            case 'D':
                System.out.print(ch);
        }
        System.out.println("----------------------------------------");
        String ism= "Ayhan Beyhan";
        System.out.println(ism.replace("han", "ol"));
        System.out.println(ism.length());
        System.out.println(ism.contains("an"));

        System.out.println("---------------------------------");
        String str="Canan Can";
        System.out.println(str.startsWith("a",3));

        String neww []= str.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(neww));

        {


            //Tamsayılardan olusan arrayde bulunan sıfırları, array sonuna yerlestiren kod yazınız.
            //Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)


            int numbers[] = {0, 5, 2, 0, 3};

            int counter = 0;

            for (int w : numbers) {
                if (w == 0)
                    counter++;
                System.out.print(w + " ");
            }


            for (int i3 = 0; i3 < counter; i3++) {

                for (int j3 = 0; j3 < numbers.length; j3++) {

                    if (j3 == numbers.length - 1)
                        break;

                    if (numbers[j3] == 0) {
                        numbers[j3] = numbers[j3] + numbers[j3 + 1];
                        numbers[j3 + 1] = numbers[j3] - numbers[j3 + 1];
                        numbers[j3] = numbers[j3] - numbers[j3 + 1];
                    }
                }

                System.out.println(Arrays.toString(numbers));
            }


              TASK :
             *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
             * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
             * int istenenToplam=9;


            int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
            int istenenToplam = 5;

            for (int i1 = 0; i1 < arr.length; i++) {
                for (int j1 = i1 + 1; j1 < arr.length; j++) {
                    if (arr[j1] + arr[i1] == istenenToplam) {
                        System.out.println(arr[i1] + " ile " + arr[j1] + " toplami =" + istenenToplam);
                    }
                }
            }

            //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
            // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
            // arr1[]={{1,2},{3,4,5}{6}}
            // arr2[]={{7,8,9},{10,11},{12}}


            int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
            int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

            for (int[] w : arr1) {
                for (int[] a : arr2) {

                    if (w.length == a.length) {
                        for (int i2 = 0; i2 < w.length; i2++) {
                            System.out.println(w[i2] + a[i2]);
                        }
                    }
                }
            }
        }


                 //   Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
                 //   Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer>number= new ArrayList<>();
        number.add(12);
        number.add(31);
        number.add(7);
        number.add(13);
        number.add(10);
        System.out.println(number);

        for (Integer w:number){
            if (w==7 || w==10){
               continue;
            }
            number.set(number.indexOf(w),w+2);
        }
        System.out.println(number);


        //String bir listede verilen tüm fiyatların toplamını bulunuz.
        // Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        //
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");

        System.out.println(myList);
        double sum = 0;
        for (String w : myList) {

            sum += Double.parseDouble(w.replace("$", ""));

        }
        System.out.println("$" + sum);


        String s1 = "Java is Java";
        System.out.println(s1.indexOf('v', 5));

        String s = "Learn";
        String t = "Java";
        System.out.println((s.concat(t)));


        Scanner scan = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis değerini giriniz");
        int bit = scan.nextInt();
        int carpim = 1;
        int toplam = 0;

        if(bas<=bit) {
            for(int i=3; i<=5; i++) {
                toplam = toplam + i;
                System.out.println(toplam);
            }
            System.out.println(toplam);
        } else {
            for(int i=bas; i>=bit; i--) {
                carpim = carpim * i;
            }
        }
        System.out.print(carpim);
        System.out.println(toplam);



        Scanner scan =new Scanner(System.in);
        System.out.println("enter a year");
        int year = scan.nextInt();
        System.out.println("enter a month number");
        byte numberOfMonth = scan.nextByte();

        switch (numberOfMonth){
            case 1 : System.out.println(" January " + year + " has a 31 day");
            break;
            case 2: if (year%400==0){
                System.out.println("February " + year + " has a 29 day");

                } else if(year%100!=0 && year%4==0){
                    System.out.println("February " + year + " has a 29 day");

                }else System.out.println("February " + year + " has a 28 day");
                break;
            case 3:
                System.out.println("March " + year + " has a 31 day");
                break;
            case 4:
                System.out.println("April " + year + " has a 30 day");
                break;
            case 5:
                System.out.println("May " + year + " has a 31 day");
                break;
            case 6:
                System.out.println("June " + year + " has a 30 day");
                break;
            case 7:
                System.out.println("July" + year + " has a 31 day");
                break;
            case 8:
                System.out.println("Agust " + year + " has a 31 day");
                break;
            case 9:
                System.out.println("September " + year + " has a 30 day");
                break;
            case 10:
                System.out.println("October " + year + " has a 31 day");
                break;
            case 11:
                System.out.println("November " + year + " has a 30 day");
                break;
            case 12:
                System.out.println("December" + year + " has a 31 day");
                break;
            default:
                System.out.println("Check your data");

        }

    class Student{
        String name;
        static String college ="UNF";
        Student(String n, String college){
            this.name = n;
            this.college = college;
        }
        public static void main(String args[]){
            Student s1 = new Student("Mark", "UCF");
            Student s2 = new Student("Kevin", "FIU");
            System.out.println(s1.name);
            System.out.println(s2.name);
            System.out.println(s1.college);
            System.out.println(s2.college);
    }
}

 */
        class Counter {
    int count = 0;

    Counter() {
        count += 2;
        System.out.println(count);
    }

    public static void main(String args[]) {
Counter c1= new Counter();
        Counter c5= new Counter();
        Counter c2= new Counter();
        Counter c3= new Counter();
        Counter c4= new Counter();
    }
}






