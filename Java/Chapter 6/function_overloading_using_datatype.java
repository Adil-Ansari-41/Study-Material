public class function_overloading_using_datatype  {

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }
    

    public static void main(String[] args) {
        System.out.println(sum(10, 5)); 
        System.out.println(sum(2.4f, 3.4f));
    }
}
