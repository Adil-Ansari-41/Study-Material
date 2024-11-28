//example of call by reference

// import java.util.*;

public class passing_arrays_as_argument {

    public static void update(int array[]){
        for(int i=0; i<array.length; i++){
            array[i]= array[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {87, 55, 90};
        // to print array values
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        
        update(marks);
        // to print updated array values
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
