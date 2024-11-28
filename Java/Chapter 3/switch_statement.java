import java.util.*;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int var = sc.nextInt(); 
        switch(var){
            case 1 : 
            System.out.println("Number 1");
            break;
            case 2 : 
            System.out.println("Number 2");
            break;
            case 3 : 
            System.out.println("Number 3");
            break;
            case 4 : 
            System.out.println("Number 4");
            break;
            default :
            System.out.println("Number not match");

        }


        //Day
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }


        //Using switch with String
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("Apple is selected");
                break;
            case "banana":
                System.out.println("Banana is selected");
                break;
            default:
                System.out.println("Unknown fruit");
        }


        //Enhanced switch (Java 12+)
        int day2 = 4;
        String result = switch (day2) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default -> "Invalid day";
        };
        System.out.println(result);



        sc.close();
    }
    
}
