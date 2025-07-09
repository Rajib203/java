public class constructor {
    public static void main(String[] args) {
        student s1=new student("raji");
        System.out.println(s1.name);
    }
}
class student{
    String name;
    int roll;

    student(String name)//constructor
    {
        this.name=name;
        // this.roll=roll;
    }
}
