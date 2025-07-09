public class Simple_inheritance {
    public static void main(String[] args) {
            Ankit a=new Ankit();
            a.input();
            a.show();
        }
    }

class student{
    int roll,marks;String name;
    void input(){
        System.out.println("Take input..");
    }
}
class Ankit extends student{
    void show(){
        roll=3;marks=87;name="Rajib";
        System.out.println(roll+" "+marks+" "+name);
    }
}

