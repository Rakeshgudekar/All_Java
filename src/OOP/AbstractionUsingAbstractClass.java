package OOP;

public class AbstractionUsingAbstractClass {
    public static void main(String[] args) {
             Horse h1=new Horse();
             h1.walk();
             h1.eat();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
       abstract  void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}
class Hen extends Animal{
    void walk(){
        System.out.println("Hen walks on 2 legs");
    };
}