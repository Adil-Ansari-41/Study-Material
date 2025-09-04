public class Method_overriding {

    public static void main(String[] args) {
        
        Deer d = new Deer();
        d.eat();

        Animal a1 = new Deer();
        a1.eat();
    }
    
}

class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    // @Override
    void eat() {
        System.out.println("Eat grass");
    }
}