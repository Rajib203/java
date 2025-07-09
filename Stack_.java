import java.util.Stack;
public class Stack_ {
    public static void main(String[] args) {
        Stack<String> Name=new Stack<>();
        Name.push("Rajib");
        Name.push("Rabiya");
        Name.addFirst("Rojina");
        System.out.println("The Name is "+Name);
        System.out.println(Name.peek());
    }
}
