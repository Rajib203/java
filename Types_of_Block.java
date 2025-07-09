public class Types_of_Block {
    public static void main(String[] args) {
        A r=new A();
    }
}
class A{
    A()
    {
        System.out.println("This is constructor..");
    }
    {
        System.out.println("This is instance Block..");
    }
    static{
        System.out.println("This is static Block..");
    }


}

