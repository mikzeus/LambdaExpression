package day35_exception;

public class E06 {//mehmet hoca
    public static void main(String[] args) {
        Object obj = 13;

        try {
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            System.err.println("Her data type i her data type ine cevrilmez");
            //hata mesajini renkli olarak verir.
            //hataya dair mesajin okunabilirligini artirmak icin System.err.println() kullanilabilir
            //ayrica bu sekilde yazdirdigimizda java error mesajlarini ayri bir yerde depolar
        }

        //Birbirine donusturulemeyecek data type'larini donusturmekte israr ederseniz java ClassCastException atar.
    }
}
