public class parameterized {
    public static void main(String[] args) {
        A r=new A(100, 200);
        r.show();
    }
}
class A{
    int x,y;
    A(int a,int b)
    {
        x=a;x=b;
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
