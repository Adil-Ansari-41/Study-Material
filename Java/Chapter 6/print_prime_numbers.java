public class print_prime_numbers {
    
    public static boolean prime(int n){
        if (n == 2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime_range(int num){
        for(int i=2; i<=num; i++){
            // prime(i);
            if(prime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        int num = 100;
        prime_range(num);
    }
}