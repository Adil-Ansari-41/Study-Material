import java.util.*;

public class entering_number_from_user_and_print_except_multiple_of_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter Number : ");
            int num = sc.nextInt();
            if( num % 10 == 0){
                continue;
            }
            System.out.println("You entered: " + num);
            if (num == -1) {  // Condition to exit the loop, e.g., -1
                break;
            }
        } while(true);
        sc.close();
    }     
    
}
