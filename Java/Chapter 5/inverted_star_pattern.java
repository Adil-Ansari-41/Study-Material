import java.util.*;
public class inverted_star_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.err.println();
        }
        sc.close();
    }
}



//2
// import java.util.Scanner;

// public class inverted_star_pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a positive number: ");
//         int n = sc.nextInt();

//         // Check for valid input
//         if (n <= 0) {
//             System.out.println("Please enter a positive integer.");
//         } else {
//             // Loop to create the inverted star pattern
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n - i; j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//         sc.close();
//     }
// }
