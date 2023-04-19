package day24_inheritancepolymorphism;

public class Honda extends Car {
    public String model = "Civic";
    public int price=20000;
    public void echo(){
        System.out.println("Honda is echo...");
    }
    public Honda (){
        System.out.println(this.model);
        System.out.println(super.model);
    }
}
