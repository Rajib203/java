public class static_interface {
    public static void main(String[] args) {
        A.show();
        // // B b=new B();
        // // b.show();
        // B.show();
    }
}
interface A{
public static void show(){
    System.out.println("can't override static methods");
}
}
class B implements A{
      public static void show(){
         System.out.println("Error");  
     }
 }