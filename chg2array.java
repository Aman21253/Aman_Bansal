/*import java.util.*;
public class chg2array{
    public static boolean search(int Matrix[][],int key){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]==key){
                    System.out.print("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int Matrix[][]=new int[3][3];
        int n=3,m=3;
        //another method int n=Matrix.length;m=Matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
    
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
//          Standard ques[SPIRAL]
/*import java.util.*;
public class chg2array{
    public static void spiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){

            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                //if row ek hi h toh phir vo do baar print na ho isliye
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=startCol+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,0,1,2},
                        {3,4,5,6}};
        spiral(matrix);                
    }
}*/
//          DIAGONAL SUM
/*import java.util.*;
public class chg2array{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //i==j for primary diagonal
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}*/
//Another method of Diagonal sum
/*import java.util.*;
public class chg2array{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //i==j for primary diagonal
        for(int i=0;i<matrix.length;i++){
            //prim diagonal
            sum+=matrix[i][i];
            //sec diagonal i+j=n-1
            //ye jb h agr odd matrix h toh ek diagonal overlap krega
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}*/
//      STAIRCASE SEARCH
//      time complexity is O(n+m)
/*import java.util.*;
public class chg2array{
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        //first method is (0,m-1) wala h
     //or another method is (n-1,0) se bhi ho skta h or screeshot dekh
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
    int matrix[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9},
                    {10,11,12},
                    {13,14,15}};
    int key=18;
    staircaseSearch(matrix,key);
    }
}*/