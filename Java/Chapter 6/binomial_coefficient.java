public class binomial_coefficient {
    public static int factorial(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    } 

    public static int binomial(int n, int r){
        int n_facto = factorial(n);
        int r_facto = factorial(r);
        int n_r_facto = factorial(n-r);

        return n_facto / (r_facto * n_r_facto);
        
    }

    public static void main(String[] args) {
        
        System.out.println(binomial(4, 2));
    }
    
}
