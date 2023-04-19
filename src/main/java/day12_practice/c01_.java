package day12_practice;

public class c01_ {
    String isim;
    int yas;
    String telefon;

    public c01_(String mustafa, int i, String s) {
        this.isim=mustafa;
        this.yas=i;
        this.telefon=s;
    }


    public static void main(String[] args) {
        c01_ newobj= new c01_("mustafa",23,"0560");
    }

}
