public class synchronized_block {
    public static void main(String[] args) {
        msg m= new msg();
        ourthread t1= new ourthread(m, "Rajib");
        ourthread t2= new ourthread(m,"Rahina");
        t1.start();
        t2.start();
    }
}
class msg
{
    public void show(String name)
    { 
        ;;// 100 loc
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("How are you"+name);
            }
        }
    }
}
class ourthread extends Thread{
    msg m;
    String name;
    ourthread(msg m,String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
