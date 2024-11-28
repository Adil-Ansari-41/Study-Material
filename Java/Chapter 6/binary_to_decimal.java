public class binary_to_decimal {

    //for loop
    public static void bin_dec_for(int num){
        int my_num = num;
        int dec = 0;
        int power = 0;
        int len = String.valueOf(num).length();

        for(int i=1; i <= len; i++){
            int last_digit = num % 10;
            dec = dec + (last_digit * (int)Math.pow(2, power)) ;
            // int delete_last_digit = num / 10;
            num = num / 10;
            power++;
        }
        System.out.println("Decimal of " + my_num + " = " + dec);
    }

    //While loop
    public static void bin_dec_while(int num){
        int my_num = num;
        int dec = 0;
        int power = 0;

        while(num > 0){
            int last_digit = num % 10;
            dec = dec + (last_digit * (int)Math.pow(2, power)) ;
            // int delete_last_digit = num / 10;
            num = num / 10;
            power++;
        }
        System.out.println("Decimal of " + my_num + " = " + dec);
    }
    
    public static void main(String[] args) {
        bin_dec_for(101);
        bin_dec_while(10101101);
    }
}
 