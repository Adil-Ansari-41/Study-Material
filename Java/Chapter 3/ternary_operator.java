// variable = condition ? statement1 : statement2
import java.util.*;

public class ternary_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Check ODD or EVEN
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        
        String var = (a % 2 ==0)? "Even": "Odd";
        System.out.println(var);

        //Check Pass or Fail
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();
        
        String res = (marks > 33)? "PASS": "FAIL"; 
        System.out.println(res);
        sc.close();
    }
    
}
