public class Var_args {
    public static void main(String[] args) {
    A r=new A();
    r.add();
    r.add(10,20,50);
    }
}
class A{
    void add(int...a){
        int sum=0;
        for(int X:a)
        {
            sum=sum+X;
        }
        System.out.println("Sum "+sum);
    }
}
