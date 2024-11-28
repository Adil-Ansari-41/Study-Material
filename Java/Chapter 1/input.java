import  java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        // String input = sc.next();      //Single Word
        // System.out.println(input);
        
        String name = sc.nextLine();    //Multiple Words
        System.out.println("The name is : " + name);
        
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        System.out.println("The Number is : " + number);
        
        System.out.println("Enter Price: ");
        float price = sc.nextFloat();
        System.out.println("The price is : " + price);
        sc.close();
    }   
}
