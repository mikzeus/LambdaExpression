package day18_constructorsstatickeyword;

public class Student {

    // 'Static' Class member"ları (variable + method+constructor+code blocks) tüm "object"ler tarafından paylaşılır.
    // 'Static' Class member"lardaki  değişiklikler tüm objeler tarafından otomatik olarak paylaşılır.
    // "Static Class Member'lar" gökteki ay gibi Class"a bağlıdırlar.
    // Bu yüzden 'static variable'lara "class variable" denir.
    // "Static Class Member'ların nasıl çalıştığını anlamak için cizip yapıp static olanları class'a,
    // olmayanları object'e baglayarak dusunmek bu konuyu kolaylastirir.
    // "Static Class Member'ları çağırmak için object oluşturmak gerekmez ve tavsiye edilmez.
    // "Non- Static Class Member'ları çağırmak için object oluşturmak şsrttır.

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

}