public class Abstract_Method {
    public static void main(String[] args) {
        // Animal a=new Animal();
        // a.walk();
        horse h=new horse();
        h.eat();
        h.walk();
        chicken c=new chicken();
        c.eat();
        c.walk();
        // System.out.println(h.color);

        
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called..");//At first called parent constructor
        // color="brown";
    }
    void eat()
    {
        System.out.println("Eats..");
    }
    abstract void walk();
}
class horse extends Animal{
    horse(){
        // super();
        System.out.println("horse constructor is called");//then this constructor
    }
    void changecolor()
    {
        color="pink";
    }
    void walk()
    {
        System.out.println("walks on 4 leg..");
    }
}
class chicken extends Animal{
    void walk()
    {
        System.out.println("walks in 2 leg..");
    }

}
