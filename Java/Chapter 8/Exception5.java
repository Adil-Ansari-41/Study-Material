public class Exception5 {
    public static void main(String[] args){

        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("Null Value");
        }

        try{
            int num = Integer.parseInt("ABC");
        } catch  (NumberFormatException e) {
            System.out.println("Invalid Number Format");
        }

        try{
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Value not found");
        }

        try{
            int result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("Cannot Devide");
        }

        try {
            Object obj = new Integer(10);
            String str =(String) obj;
        } catch (ClassCastException e){
            System.out.println("Invalid Type Casting");
        }

    }
    
}
