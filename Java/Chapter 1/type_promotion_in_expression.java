public class type_promotion_in_expression {
    public static void main(String[] args) {
        char a = 'a';
        short b = 55 ;
        int ans = a+b;
        System.out.println(ans);


        int c = 10;
        float d = 20.65f;
        long e = 347;
        double f = 34.65;

        double ans2 = c+d+e+f;
        System.out.println(ans2);


        byte g = 5;
        g = (byte) (g*2);
        System.out.println(g);


        int $ = 34;   //this is valid
        System.out.println($);
    }
    
}
