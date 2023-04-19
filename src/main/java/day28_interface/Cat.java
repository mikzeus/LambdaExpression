package day28_interface;

public class Cat implements Mammal{
    @Override
    public void eat() {
        System.out.println("Cats eat food...");
    }

    @Override
    public void drink() {

    }
    //interface'lerde variable cagirirken "inteface" adini kullanarak cagirin.
    //Bu hem "static" variable olmanin geregidir, hem de okunurlulugu artirir.
    public static void main(String[] args) {
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);
        Cat c= new Cat();
        c.eat();

    }
}
