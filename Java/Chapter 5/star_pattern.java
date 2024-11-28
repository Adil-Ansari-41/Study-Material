// public class star_pattern {
//     public static void main(String[] args) {
//         for(int i=1; i <=4; i++){
//             System.out.println("*" .repeat(i));
//         }
//     }
// }


public class star_pattern {
    public static void main(String[] args) {
        for(int i=1; i <=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
