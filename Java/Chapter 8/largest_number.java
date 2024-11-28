// import java.util.*;

public class largest_number {
    
    public static void largest(int array[]){
        int lar = Integer.MIN_VALUE;        //-infnity    
        for(int i=0; i<array.length; i++){
            if(array[i] > lar){
                lar = array[i];
            }
        }
        System.out.println("Largest Number is : " + lar);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        largest(numbers);
    }
}
