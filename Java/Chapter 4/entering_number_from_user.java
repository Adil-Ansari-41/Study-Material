import java.util.*;

public class entering_number_from_user {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter Number : ");
            int num = sc.nextInt();
            if( num % 10 == 0){
                break;
            }
            System.out.println(num);
        } while(true);
        
        sc.close();
    }       
}
           