package day28_interface;

public interface Animal {
/*
    Class --> Class'a parent olur  : extends ile
    interface -- > interface'e parent olur : extends ile
    interface-->class'a  parent olur : implements ile
    Class --> interface'e parent olamaz : olamaz
    ikisi de Ayni ise "extends", farkli ise "implements" ile child parent iliskisi kurulabilir.
    interface'i Class'in child'i yapmayiz.

    ABSTRACT CLASS ILE INTERFACE ARASINDAKI FARKLAR:

    1. METHOD OLARAK FARKLAR:
    i) Abstract classlar hem abstract hem de concrete methodlar icerebilirler interfaceler ise sadece abstract class icerir.
    ama interfacelerde istersek default ve static keywordlerini kullanarak concrete method uretebiliriz.
    ii) Abstract classlar multiple inheritance i desteklemez ama interfaceler destekler

    2. VARIABLE OLARAK FARKLAR:

    i)Abstract classlar icinde her turlu variable olusturulabilir. interfacelerde variablelar public static ve final olmak zorundadir.
    ii)Interface, classin child i olamaz ama abstract, classin child i olabilir

 */

    public abstract void eat();

    void drink();

    /*
        1) interface içindeki tüm variable'i oluşturduğumuzda mutlaka değer ataması yapmalıyız.bu yüzden
      interface içindeki variable'i oluşturduğumuzda mutlaka değer ataması yapmalısınız.
      Final variable'ların değeri değiştirlemez.
       2) interface variable ototmatik(default) olarak "public" olur.
       3)interface variable ototmatik(default) olarak "static" olur.

     */
    int age = 12;

}
