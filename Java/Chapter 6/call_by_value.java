public class call_by_value {
    public static void change(int a){
        a = 10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a= 5;
        
        change(a);   //here parameter pass copy of (a)

        System.out.println(a);
    }
    
}
