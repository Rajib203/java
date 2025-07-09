import java.util.Arrays;
public class Array_sort {
    public static void main(String[] args) {
        Integer[] numbers={20,7,6,9,10};
        
        Arrays.sort(numbers);
        
        for(int i: numbers)
        {
            System.out.print(i+" ");
        }
    }
}
