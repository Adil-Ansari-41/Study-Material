public class max_subarray_sum_shorthand {
    public static void max_subarray_sum(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; 
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        //calculate prefix array
        for(int i =1; i<array.length; i++){
            prefix[i] = prefix[i-1] + array[i]; 
        }

        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
               
               
                currSum = (i == 0) ? prefix[i] : prefix[j] - prefix[i-1];
                

            
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args){
        int numbers[] = {1, -2, 6, -1, 3};

        max_subarray_sum(numbers);
    }
    
}

//O(n2)

