package day24_inheritancepolymorphism;

public class CarRunner {
    public CarRunner() {
    }

    /*    inheritance de constructor yapısı nasıl çalışır?

        Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
        Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
        Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
        Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
        Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
        Super parent demektir. O yuzden once parent'e gidilir.
        Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
        En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
        Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.

        1) Inheritance'da object olustururken constructor'lar yukaridan(Parent) asagiya(Child) dogru calisir.
        2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
        3)super() her constructor'in ilk satirinda gorunmez olarak bulunur. Isterseniz gorunur sekilde de yazabilirsiniz
        4) Super() sizi parent class daki Constructor a taşır.
        5) this() aynı Class içindeki Constructor'larda gezmemizi sağlar.
        6) this() aynı Class içindeki variable'larrı, super parent class'taki variable'ları çağırmaya yarar
        7) Eğer data type'leri arasında "IS-A ve "HAS-A" ilişkisi varsa bu data tiperine "COVARIANT" denir.

        1)polymorphism ==> Çoklu şekil
        yani bir methodun çoklu şekillerde karşımıza gelmesi..
        Polymorphism=Overloading + Overriding
        2) "Overriding" işlemi "Parentler"daki methodu "Child"lara göre özelleştirme işlemidir.
        3) Overriding işleminde method'un body'si değiştirlir.
        4) Overriding işleminde "method signiture"na dokunulmaz



     */
    public static void main(String[] args) {
        //Toyota t1=new Toyota();
        //t1.model="Auris";
       // System.out.println(t1.model);
        //Honda h1=new Honda();
        Volvo v1=new Volvo();

    }
}
