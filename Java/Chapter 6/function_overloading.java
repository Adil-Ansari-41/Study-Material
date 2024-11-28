//function overloading only depends on parameters not data type

public class function_overloading {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    

    public static void main(String[] args) {
        System.out.println(sum(10, 5));
        System.out.println(sum(2, 3, 5));
    }
}
