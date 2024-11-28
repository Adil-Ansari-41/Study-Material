public class inverted_half_pyramid_with_number {
    
    public static void pattern(int n) {
        //1
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //2
        // for (int i = n; i > 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
