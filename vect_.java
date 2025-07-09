import java.util.Vector;
import java.util.Scanner;
public class vect_ {
    public static void main(String[] args) {
        Vector<String> Shoppinglist=new Vector<>();
    
        if(args.length<5)
        {
            System.out.println("please enter 5 item..");
            return;
        }
        for(int i=0;i<5;i++)
        {
            Shoppinglist.add(args[i]);
        }
        System.out.println("ypu shopping list:");
        for(String item:Shoppinglist)
        {
            System.out.println(item);
        }
        
    }
}
