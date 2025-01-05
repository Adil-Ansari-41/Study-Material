public class Hybrid_inhritance {
    public static void main(String[] args) {

       Shark s1 = new Shark();
       s1.eat();
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


class Shark extends Fish {

}


class Dog extends Mammal {

}

class Cat extends Mammal{

}