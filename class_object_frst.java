public class class_object_frst {
    public static void main(String[] args) {
        pen p1=new pen();//create a pen object clled p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);
        Bankaccount myacc=new Bankaccount();
        myacc.name="rajib";
        // myacc.password="abcdw";
        myacc.setpassword("acvcbvc");
    }
}
class pen{
    String color;
    int tip;

    void setcolor(String newcolor)
    {
        color=newcolor;
    }

    void settip(int newTip)
    {
        tip=newTip;
    }
}
class Bankaccount{
    public String name;//This two basically ex of access modifier
    private String password;
    public void setpassword(String pwd)
    {
        password=pwd;
    }
}
