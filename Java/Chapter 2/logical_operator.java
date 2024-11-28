public class logical_operator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // logical AND (&&)
        System.out.println( (3>2) && (5>1));
        System.out.println( (3<2) && (5>1));
        System.out.println( (3>2) && (5<1));
        System.out.println( (3<2) && (5<1));

        System.out.println("");
        
        // logical OR (||)
        System.out.println( (3>2) || (5>1));
        System.out.println( (3<2) || (5>1));
        System.out.println( (3>2) || (5<1));
        System.out.println( (3<2) || (5<1));
        
        System.out.println("");

        // logical NOT (!)
        System.out.println( !(3>2));
        System.out.println( !(3<2));
    }
    
}
