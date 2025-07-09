import java.util.*;
public class sort_words {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Eneter a sentence..");
        String inputSentence=in.nextLine();

        String[] words=inputSentence.split(" ");
        Arrays.sort(words);

        System.out.println("sorted words");

        for(String word:words)
        {
            System.out.println(word);
        }

    }
    
}
