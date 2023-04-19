package day35_exception;

public class E05 {//mehmet hoca

    public static void main(String[] args) {
        String s="Java";
        getNumberOfChars(s);

        String t="";
        getNumberOfChars(t);

        String u=null;
        getNumberOfChars(u);//NullPointerException

    }
    //String in degeri "null" oldugunda string class daki bazi methodlari kullanmaya calisirsaniz java NullPointerException atar
    public static void getNumberOfChars(String s){
        try{
            int numOfChars = s.length();
            System.out.println(numOfChars);
        }catch (NullPointerException e){
            System.out.println("null degeri icin bazi methodlar kullanilamaz");
        }

    }

}
