public class Hierarchial_inheritance {
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
    void swims() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}