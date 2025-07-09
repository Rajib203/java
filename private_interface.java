public class private_interface {
    public static void main(String[] args) {
        B b=new B();
        b.sub(100, 50);b.call();
    }
}
interface A{
    default void call()
    {
        add(100, 200);
    }
    private void add(int x,int y){
        System.out.println("The addition is "+(x+y));
    }
}
class B implements A{
    public void sub(int x,int y)
    {
        System.out.println("The subtraction is "+(x-y));
    }
}