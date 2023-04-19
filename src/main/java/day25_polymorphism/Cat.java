package day25_polymorphism;

public class Cat extends Animal{
    public void meow(){
        System.out.println("Cats meow");
    }
    @Override//Override Annotation override kurallarini java tarafindan kontrol edilmesini saglar
    public void eat(){
        //Child daki override edilmis eat() methoduna "Overriding Method" denir
        //Parent taki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Cats eat");
    }
    @Override
    public void drink() {
        System.out.println("Cats drink");
    }
    @Override
    public Cat create() {
        return new Cat();
    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }
    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
    //@Override
   // public double circleArea(double r) {
       // return super.circleArea(r);
    //}

}
