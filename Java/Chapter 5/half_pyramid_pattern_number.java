import java.util.*;

public class half_pyramid_pattern_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter Number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}