/*                  FLYODS TRIANGLE
public class pattern{
    public static void flyods_triangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        flyods_triangle(5);
    }
}*/
//              INVERTED HALF PYRAMID
/*public class pattern{
    public static void inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_half_pyramid(5);
    }
}*/
//                  BUTTERFLY{good ques}
/*public class pattern{
    public static void butterfly(int n){
        //                   1st part
        for(int i=1;i<=n;i++){
            //              STAR
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //              SPACE
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //              STAR
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //                  Second part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
        
        public static void main(String args[]) {
            butterfly(7); 
        }
    }*/
/*public class pattern{
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.println(" "+j);
            }
        }
    }
    public static void main(String args){
        diamond(4);
    }
}*/
