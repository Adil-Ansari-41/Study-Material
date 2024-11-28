import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        float radius = sc.nextFloat();
        

        float area = 3.14f * (2 * radius) ;

        System.out.println(area);
        sc.close();
    }
}
