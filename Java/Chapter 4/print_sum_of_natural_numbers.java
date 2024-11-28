import java.util.*;

public class print_sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int n = sc.nextInt();

        int sum=0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
