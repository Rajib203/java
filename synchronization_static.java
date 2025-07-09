public class synchronization_static {// This is customer class
    public static void main(String[] args) {
        Bank obj = new Bank(5000);
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj);

        t1.setName("Rajib");
        t2.setName("Rabiya");

        // t1.start();
        // t2.start();

        Bank obj1= new Bank(5000);
        Thread t3= new Thread(obj1);
        Thread t4= new Thread(obj1);
        
        t1.setName("Rahina");
        t2.setName("Rahin");
        t1.start();t2.start();
        t3.start();t4.start();


    }
}
class Bank extends Thread
{
    static int balance=5000;
    static int withdraw;
    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }
    public static synchronized void withdraw()// sychronized method alllow use resource to thread one time only
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=balance)
        {
            System.out.println(name+" withdraw money");
            balance=balance-withdraw;
            // System.out.println("remain"+ balance);
        }
        else{
            System.out.println("Insufficient money");
        }
    }
    public void run()
    {
        withdraw();
    }
}
