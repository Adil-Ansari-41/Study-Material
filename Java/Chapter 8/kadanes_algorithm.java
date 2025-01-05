public class kadanes_algorithm {

    public static void kadanes(int array[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0; i<array.length; i++){
            cs = cs + array[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max Subarray sum is " + ms);
    }

    public static void main(String[] args){
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadanes(number);
    }
    
}
