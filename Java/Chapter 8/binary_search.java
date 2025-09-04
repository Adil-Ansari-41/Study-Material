public class binary_search {
    public static int BinarySearch(int array[], int key){
        int start = 0;
        int end = array.length-1;

        while( start <= end){
            int mid = (start + end) / 2; // formula to find mid index

            //comparision
            if(array[mid] == key){   //found
                return mid;
            }
            if(array[mid] < key){ //right side in 2Half
                start = mid+1; 
            } else {          //left side in 1Half
                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int num[] = {2, 3, 4, 5, 6, 7, 8, 10, 12, 14};
        int key = 10;

        //System.out.println("index for " + key + " is : " + BinarySearch(num, key));
        int index = BinarySearch(num, key);
        System.out.println((index == -1)? "Invalid Key ":" Key Index:" + index);



    }
}
