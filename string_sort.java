import java.util.Arrays;
import java.util.Scanner;;
public class string_sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
    
        String inputsentence=in.nextLine();

        String[] words=inputsentence.split(" ");
          Arrays.sort(words);
        
        System.out.println("sorted words");

        for(String word : words)
        {
            System.out.println(word);
        }
    }
}
