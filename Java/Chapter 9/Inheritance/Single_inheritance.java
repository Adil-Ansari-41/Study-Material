public class Single_inheritance {
    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat(); 
    }
}


class Animal {       //Base class or Parent class
    String color; 

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}


class Fish extends Animal {   //Derived class or Child class
    int fins;

    void swims() {
        System.out.println("swims in water");
    }
}