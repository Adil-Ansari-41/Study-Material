import java.util.*;

public class print_number_from_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int n = sc.nextInt();

        int i = 1;
        while( i <= n){
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
