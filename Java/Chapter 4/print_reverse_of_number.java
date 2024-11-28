//to find the last digit of number modulo number by 10 remainder == n%10
//to delete the last digit of number divide number by 10    remove last digit == n/10

public class print_reverse_of_number {
    public static void main(String[] args) {
        
        int n = 10899;

        for(int i=1; i <=5; i++){
            int last_digit = n%10;
            System.out.print(last_digit);
            int remove_last_digit = n/10;
            n = remove_last_digit;
        }

        System.out.println("");
        
        int num = 56223;
        while(num > 0){
            int last_digit = num%10;
            System.out.print(last_digit);
            num = num/10; 
        }
        
        System.out.println("");
        
        int rev = 0;
        int number = 35675;
        while(number > 0){
            int last_digit = number%10;
            rev = (rev*10) + last_digit;
            number = number/10; 
        }
        System.out.println(rev);
        
    }
    
}
