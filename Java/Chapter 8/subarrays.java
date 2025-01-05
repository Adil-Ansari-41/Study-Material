public class subarrays {
    public static void print_subarrays(int array[]) {
        int tol = 0;
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(array[k]+"");
                }
                tol++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + tol);
    }
    

    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};

        print_subarrays(numbers);
    }
}
