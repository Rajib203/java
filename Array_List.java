import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Rajib");
        Name.add("Rabiya");
        System.out.println(Name);
        Name.add("kiyamuddin");
        System.out.println(Name);
        Name.add(0,"Rojina");
        System.out.println(Name);
        Name.remove(0);
        System.out.println(Name);
        Name.set(0,"Rahi");
        System.out.println(Name);
        System.out.println(Name.get(0));
        Name.clear();
        System.out.println(Name);

        
    }
}
