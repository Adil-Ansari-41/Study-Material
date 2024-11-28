import java.util.*;

public class print_largest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter Number 3 : ");
        int c = sc.nextInt();

        if(a >= b  &&  a >= c){
            System.out.println(a + "is largest");
        }
        else if(b >= c){
            System.out.println(b + "is largest");
        }
        else{
            System.out.println(c + "is largest");
        }

        sc.close();
    }
}
