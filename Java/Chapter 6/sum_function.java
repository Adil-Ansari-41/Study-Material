import java.util.*;

public class sum_function {
    public static int cal_sum(int num1, int num2){  //parameters or formal parameters
        int res = num1 + num2;
        System.out.println("""
                   %d + %d = %d
                   """.formatted(num1, num2, res));

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();

        cal_sum(a, b);       //arguments or actual parameters

        //System.out.println(a + "+" + b + "=" + sum  );

        sc.close();
    }
    
}
