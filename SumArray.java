import java.util.*;

public class SumArray{
    public static int Sum(int numbers[]){
        int Sum = 0;
        for(int i=0;i<numbers.length;i++){
            Sum+=numbers[i];
        }
        return Sum;
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};

        System.out.println("Sum is: " + Sum(numbers));

    }
}