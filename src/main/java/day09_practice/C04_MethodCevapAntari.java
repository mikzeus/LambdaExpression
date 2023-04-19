package day09_practice;

public class C04_MethodCevapAntari {
    public static void main(String[] args) {

    /*
    10 sorumuz var
    ogrencilerin cevapları:

    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    cevap anahtarı:

    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    Her ogrencinin dogru cevap sayısını method olusturarak yazdıranız??

    output:
    1nolu ogrencinin dogru cevap sayısı: 7
    2nolu ogrencinin dogru cevap sayısı: 6
    3nolu ogrencinin dogru cevap sayısı: 5
    4nolu ogrencinin dogru cevap sayısı: 4
    5nolu ogrencinin dogru cevap sayısı: 8
    6nolu ogrencinin dogru cevap sayısı: 7
    7nolu ogrencinin dogru cevap sayısı: 7
    8nolu ogrencinin dogru cevap sayısı: 7

     */
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        dogruCevapSayisi(answers, keys);

    }

    public static void dogruCevapSayisi(char[][] answers, char[] keys) {

        for (int i = 0; i < answers.length; i++) {// 0'dan öğrenci sayısına kadar döngüye aldık

            int count = 0;// bir sonraki öğrenciye geçerken
                         // dogru cvb sayısını sıfırlamak için sayacı burada oluşturdurduk.

            for (int j = 0; j < answers[i].length; j++) {//j öğrencinin cevabını ifade eder. bu for, 0'dan öğrencinin
                                                        // cvb sayısına kadar döngüye alır

                if (answers[i][j] == keys[j]) {// ogrencinin cvbı, cvp anahatarı ile eşit mi kontrol ettik

                    count++;                  // eşitse sayacı +1 arttırdık
                }
            }
            System.out.println( i+1 +"no'lu ögrencinin dogru cvb sayısı: " +count);
        }
    }
}
