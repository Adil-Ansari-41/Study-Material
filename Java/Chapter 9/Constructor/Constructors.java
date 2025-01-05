public class Constructors {

    public static void main(String[] args){


        Student s1 = new Student("Zaid");   //passing argument in constructor
        System.out.println(s1.name);

        // Student s2 = new Student(15);
        // Student s3  =new Student();

        //copy constructor object
        Student s4 = new Student(s1);
        System.out.println(s4.name);

    }
}

class Student {
    String name;
    int roll;

    Student(String name) {    //constructor  with parameter
        this.name = name;
    }

    Student(){               // Non-Parameterized constructor
        System.out.println("Creating Constructor");
    }

    Student(int roll) {    //Parameterized Constructor
        this.roll = roll;
    }


    //copy Constructor

    Student(Student obj){
        this.name = obj.name;
        this.roll = obj.roll;
    }

}