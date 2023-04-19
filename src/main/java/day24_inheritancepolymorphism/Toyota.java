package day24_inheritancepolymorphism;

public class Toyota extends Car{
    public void hybrid(){
        System.out.println("toyata has goog perfomance");
    }
    public Toyota(){
        this("prius");
        System.out.println("Toyota constructor 1 ...");
    }
    public Toyota(String str){
        super(5);
        System.out.println("Toyota constructor 2 ...");
    }
}
