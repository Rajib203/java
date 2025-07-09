public class Nullpointer_Exception {
    public static void main(String[] args) {
        String str=null;//null given then show exception
        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException n)
        {
            System.out.println("null cannot cascade");
        }
    }
}
