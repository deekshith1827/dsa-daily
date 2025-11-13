import java.util.*;

public class Largest{
    public static int Largest( int numbers[]){
        int Largest = numbers[0];
        for(int i=0;i<numbers.length;i++){
        if(numbers[i]>Largest){
            Largest = numbers[i];
        }
    }
    return Largest;
}


    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};

        System.out.println("Largest is: "+Largest(numbers));
    }
}