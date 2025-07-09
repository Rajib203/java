public class Static {
    public static void main(String[] args) {
        student s1=new student();
        s1.schoolname="FIT";
        student s2=new student();
        System.out.println(s2.schoolname);
    }
}
class student{
    int roll;
    String name;
    static String schoolname;

    void setname(String name)
    {
        this.name=name;
    }
    String getname()
    {
        return this.name;
    }
    void setroll(int roll)
    {
        this.roll=roll;
    }
    int getroll()
    {
        return this.roll;
    }
}
