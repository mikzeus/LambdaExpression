package day23_inheritance;

public class C01_Animal {

    /*
        1)eat() methodu gibi bircok class'in kullanmasi gereken methodlari her class'a ayri ayri
          yazarsak;
            i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir.
            ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
            iii)Tekrar tekrar yazilan method'un tamiri cok zmana alir.
            iv)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir.
            v)Method'u tekrar tekrar yazmak "atomic yapi"ya terstir.
            Inheritance = Miras (Senin  olmayan seyi senin gibi kullanirsin)
          2)private class member'lar child class'lar tarafindan kullanilamaz
            public class member'lar child class'lar tarafindan kullanilabilir
            default class member'lar ayni package'de child class'lar tarafindan kullanilabilir
             protected class  member'lar farkli package'de de olsalar child class'lar tarafindan kullanilabilir.
          3)Javada bir class'ın sadece bir tane parenti olabilir
            Coklu parent'a "Multiple Inheritance" derler,tekli parent e "Single Inheritance" kullanir
          4)Apartman seklindeki inhertance yapisina "Multilevel Inheritance" denir.
            Java "Multilevel Inheritance"i destekler.
     */

    protected void eat() {
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink...");
    }
}
