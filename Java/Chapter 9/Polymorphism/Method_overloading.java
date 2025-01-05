public class Method_overloading {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(3, 2));
        System.out.println(calc.sum(3.2f, 4.2f));
        System.out.println(calc.sum(3, 2, 7));
        
    }
    
}

class Calculator {
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
    
}