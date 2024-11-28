import java.util.*;

public class sum_input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();

        int sum = a + b ;
        
        System.out.println(sum);
        sc.close();
    }
    
}
