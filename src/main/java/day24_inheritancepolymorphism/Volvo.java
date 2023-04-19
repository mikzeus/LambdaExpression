package day24_inheritancepolymorphism;

public class Volvo extends Car{

    public void secure(){
        System.out.println("Volvo is the best secure...");
    }

    @Override // @ işaretiyle başlayanlara "Annotation" denir. bu, override kurallarını kontrol eder, hata varsa uyarır.
    public void move() {
        System.out.println("Volvo moves ...");
    }
}
