public class sychronized_demo {
    public static void main(String[] args) {
        Bus r= new Bus(1);

        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.setName("Rajib");
        t1.setName("rahi");
        t1.setName("hh");

        t1.start();
        t2.start();
        t3.start();


    }
}
class Bus implements Runnable
{
    int passenger,available=1;
    Bus(int passenger)
    {
        this.passenger=passenger;
    }
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(available>=passenger)
        {
            System.out.println(name+" seat reserved");
            available=available-passenger;
        }
        else{
            System.out.println("seat not available");
        }
    }
}
