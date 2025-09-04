public class Exception {
    public static void main(String[] args){
        try{
            int arr[] = {1, 2 ,3};
            System.out.println(arr[5]);

            int result = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No value on index 5");
        } catch (ArithmeticException e){
            System.out.println("Cannot devide by zero");
        } finally {
            System.out.println("Finally block always executes");
        }


    }
    
}
