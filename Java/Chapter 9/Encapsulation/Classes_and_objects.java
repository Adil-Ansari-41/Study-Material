public class Classes_and_objects {
    public static void main(String[] args){

        //Object
        Pen p1 = new Pen(); //created a object p1  and Pen() is a constructor
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

    }
    
}


//Class
class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
