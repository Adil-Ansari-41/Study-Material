import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter Operator : ");
        char operator = sc.next().charAt(0);
        

        int result = switch (operator) {
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            case '%' -> a%b;
            default -> {
                System.out.println("Invalid Operator");
                yield 0;
            }
        };
        System.out.println("Result: " + result);

        sc.close();
    }
    
}
