package day24_inheritancepolymorphism;

public class Car {

    String model="CAR";
    int price=0;

  public void move(){
      System.out.println("Cars moved...");
    }
    public void getBrake(){
        System.out.println("Cars brakes...");
    }
    public void engine(){
        System.out.println("Cars has engine...");
    }
    public Car(){
        System.out.println("Car constructor 1 ...");
    }
    public Car(int i){
      this();
        System.out.println("Car constructor 2 ...");
    }
}
