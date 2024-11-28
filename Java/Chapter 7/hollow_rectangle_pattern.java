public class hollow_rectangle_pattern {

    public static void hollow_rec(int tol_row, int tol_col){
        for(int i=1; i<=tol_row; i++){
            for(int j=1; j<=tol_col; j++){
                //cell - (i,j)
                if( i == 1 || i == tol_row || j == 1 || j == tol_col){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        hollow_rec(4, 5);
        
    }
    
}
