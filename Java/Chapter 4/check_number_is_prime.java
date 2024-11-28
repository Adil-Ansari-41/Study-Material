import java.util.*;

public class check_number_is_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 2){
            System.out.println(num + "is Prime Number");
        } else{
            for (int i=2; i<=Math.sqrt(num); i++){
                if( num % i == 0){
                    isPrime = false;
                }
                
                if(isPrime == true){
                    System.out.println(num + "is Prime Number");
                } else{
                    System.out.println(num + "is not Prime Number");
                }
            }
        }
        sc.close();
    }
    
}
//2
// import java.util.Scanner;

// public class check_number_is_prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
        
//         if (isPrime(num)) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
        
//         sc.close();
//     }
    
//     public static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;  // Numbers less than or equal to 1 are not prime
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 return false;  // If divisible by any number other than 1 and itself, not prime
//             }
//         }
//         return true;
//     }
// }
