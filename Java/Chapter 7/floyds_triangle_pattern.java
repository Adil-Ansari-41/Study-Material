public class floyds_triangle_pattern {

    public static void patter(int n){
        int num = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++,num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patter(5);
    }
    
}
