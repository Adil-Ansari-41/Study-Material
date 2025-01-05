public class Abstract {
    public static void main(String[] args) {
        
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); //Cannot create instance of animal in abstract class
    }
}

abstract class Animal {
    
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();  //compalsary to drived class make walk method
}

class Horse extends Animal {
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("walks on 2 legs");
    }
}