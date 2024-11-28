import java.util.*;
public class arrays_operations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Array
        int marks[] = new int[50];

        // int numbers[] = {1, 2, 3, 4};

        // String fruits[] = {"apple", "mango", "orange"};

        //Take input in array
        System.out.println("Enter Physics Marks: ");
        marks[0] = sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        marks[1] = sc.nextInt();
        System.out.println("Enter Maths Marks: ");
        marks[2] = sc.nextInt();

        System.out.println("Physics = " + marks[0]);
        System.out.println("Chemistry = " + marks[1]);
        System.out.println("Maths = " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");

        System.out.println("Array of length " + marks.length);




        sc.close();
    }
    
}
