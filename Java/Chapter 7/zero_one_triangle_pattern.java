public class zero_one_triangle_pattern {
    public static void patter(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int num = i+j;
                if( num % 2 == 0 ){
                    System.out.print(1);
                } else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patter(5);
    }
    
}
