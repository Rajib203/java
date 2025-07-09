public class overside {
    public static void main(String[] args) {
    B b= new B();
    b.show();
    b.disp(); 
    }
}
class A{
    
    void show(){
        System.out.println("super class..");
    }
    void disp(){
        System.out.println("Anothe method");
    }
}

class B extends A{
    @Override
    void show(){
        super.show();
       System.out.println("sub class..");
    }
}
