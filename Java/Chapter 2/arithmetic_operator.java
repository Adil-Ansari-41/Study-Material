public class arithmetic_operator {
    public static void main(String[] args) {
        
        //Binary Operators

        int a = 35;
        int b = 15;

        System.out.println("Add  a + b :" + (a+b));  
        System.out.println("sub  a - b :" + (a-b));  
        System.out.println("Mul  a * b :" + (a*b));  
        System.out.println("Div  a / b :" + (a/b));  
        System.out.println("Remainder  a % b :" + (a%b));  
        System.err.println("");

        //Unary Operator

        // Pre Increment and Decrement
        int c = 5;
        int d = 5;
        System.out.println("c + 1 = " + (++c));   
        System.out.println("d - 1 = " + (--d));
        System.err.println("");

        // Post Increment and Decrement
        int e = 5;
        int f = 5;
        System.out.println("e + 1 = " + (e++));   //Increment execute after this line execute
        System.out.println("f - 1 = " + (f--));   //Increment execute after this line execute
        
        System.err.println("");
        System.out.println("e + 1 = " + (e++));   
        System.out.println("f - 1 = " + (f--));
    }
    
}
