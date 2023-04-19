package day18_constructorsstatickeyword;

public class Car {
    String make="Honda";
    String model= "Accord";
    int year=2021;
    int price = 18000;

    // javanın otomatik olarak verdiği constructors "default " construtor denir.
    // defaul cons.ların body si boştur
    // java kıskançtır. default constructor u elle yazıldığında java Object class
    // içindeki default constructor u kullandırtmaz.

/*   1)Constructor nasil olusturulur ?
        Access Modifier + Clas Ismi + () + {} + ;

    2)Method ile "Constructor" arasindaki farklar nelerdir ?

            i)"Method" larda "return type" olur, "Constructor" larda olmaz.
           ii)"Method" lar yaptiklari ise gore isimlendirilirler, "Constructor" ise her zaman
               "Class Is"mi ile isimlendirilirler
          iii)"Method" lar bir aksiyon yapmak icin olusturulur,
               "Constructor" lar ise object olusturmak icindir.
         iiii)"Method" isimleri kucuk harfle baslar,
               "Constructor" isimleri "Class Ismi" ile ayni oldugu icin buyuk harfle baslar

      3) farklı parametreli constructorlar oluşturarak,
         aynı class tan farklı özelliklere sahip nesneler oluşturabiliriz
 */
     public Car (){
     }

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make) {
        this.make = make;
    }
}
