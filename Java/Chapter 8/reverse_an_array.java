
public class reverse_an_array {
    public static void reverse(int array[]){
        int first = 0;
        int last = array.length-1;

        while( first < last){
            //swap
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }
    }   
    
    public static void main(String args[]){

        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] +  " ");
        }
    }
}
