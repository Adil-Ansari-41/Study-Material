import java.util.*;

public class if_else_statement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("Your are aligible for vote");
        }
        // else if (age > 13 && age < 18){
        //     System.out.println("Teenager");
        // }
        else{
            System.out.println("Your are not aligible for vote");
        }
        sc.close();
    }
}