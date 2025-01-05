public class max_subarray_sum {
    public static void max_subarrays(int array[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    //subarray sum
                    currSum += array[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    

    public static void main(String[] args){
        int numbers[] = {1, -2, 6, -1, 3};

        max_subarrays(numbers);
    }
    
}

//O(n3)
