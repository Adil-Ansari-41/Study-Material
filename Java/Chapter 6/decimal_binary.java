public class decimal_binary {

    public static void dec_bin(int num){
        int my_num = num;
            int bin = 0;
            int power = 0;

        while(num > 0){
            int rem = num % 2;
            bin = bin + (rem * (int)Math.pow(10, power));
            
            num = num /2;
            power++;
        }
        System.out.println("Binary of " + my_num + " = " + bin);
    }
    public static void main(String[] args) {

        dec_bin(7);
        
    }
    
}
