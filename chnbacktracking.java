//         ISME ARR MEIN -2 HOGA
/*import java.util.*;
public class chnbacktracking{
    public static void changeArr(int arr[],int i,int value){
        if(i==arr.length-1){
            printArr(arr);
            return; 
        }
        arr[i]=value;
        changeArr(arr,i+1,value+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++)
        System.out.print(arr[i]+" ");
    }
    //subset jaise abc h toh a,b,c,ab,bc,ca,abc,"null"
    public static void findSubset(String str,String ans,int i){
        //base
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //kaam(yes)
        findSubset(str,ans+str.charAt(i),i+1);
        //no 
        findSubset(str,ans,i+1);
    }
    public static void findPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<=str.length()-1;i++){
            char curr=str.charAt(i);
            //substring mein last wala include nhi hota
            String newstr=str.substring(0,i)+str.substring(i+1,str.length()-1);
            findPermutation(newstr,ans+curr);
        }
    }
    
    public static void main(String args[]){
        /*int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);*/
        /*String str="abc";
        findSubset(str,"",0);*/
        //Doubt
        /*String str="abcde";
        findPermutation(str," ");
    }
}*/
//          DOUBT
/*import java.util.*;
public class chnbacktracking{
    public static void nQueen(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j<=board.length-1;j++){
        board[row][j]='Q';
        nQueen(board,row+1);
        board[row][j]='.';
        }
    }
    public static void printBoard(char board[][]){
        System.out.print("chess board");
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board.length-1;j++){
                System.out.println(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                board[i][j]='.';
            }
        }
    }
}*/
/*import java.util.*;
public class chnbacktracking{
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1=gridWays(i+1,j,n,m);
        int w2=gridWays(i,j+1,n,m);
        return w1 + w2;
    }
    //its time complexity is 2^(n+m) 
    //so direct fomula is (n-1+m-1)!/(n-1)!(m-1)! here tc is linear
    public static void main(String args[]){
        System.out.println("enter value of n,m");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(gridWays(0,0,n,m));
    }
}*/
/*import java.util.*;
public class chnbacktracking.java{
    public static boolean isSafe()
    public static boolean sudokuSolver(int sudoku[],int row,int column){
        if(row==9 && column==9){
            return true;
        }else if(row==9){
            return false;
        }
        int nextRow=row;int nextColumn=column+1;
        if(col+1==9){
            nextRow=row+1;
            nextcolumn=0;
        }
        if(sudoku[row][column]!=0){
            return sudokuSolver(sudoku,nextRow,nextColumn)
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,column,digit)){
                sudoku[row][column]=digit;
                if(sudokuSolver(sudoku,nextRow,nextColumn));
                return true;
            }
            sudoku[row][column]=0;
        }
        return false;
    }
    public static void main(String args[]){

    }
}*/
//      DOUBT
//Output nhi aa rha h
/*public class chnbacktracking{
    public static boolean isSafe(char board[][],int row,int col){
        //Vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diogonal left up
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        }
        //Diogonal right up
        for(int i=row-1;i>=0;i--){
            for(int j=col+1;j>=0;j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q'; 
            nQueens(board,row+1);  //function call
            board[row][j]='.';     //backtracking
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("---------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+"  ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
    }
}*/
/*public class chnbacktracking{
    public static boolean isSafe(int sudoku[][],int i,int j,int digit){
        for(int i=0;i<=8;i++){
            if(sudoku[i][j]==digit){}
        }
    }
    public static boolean sudokuSolver(int sudoku[][],int i,int j){
        //base case
        if(i==9 && j==9){
            return true;
        }
        else if(i==9){
            return false;
        }
        //recursion
        int nextRow=i;int nextCol=j+1;
        if(nextCol==9){
            nextRow=i+1;
            nextCol=0;
        }
        if(sudoku[i][j]!=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,i,j,digit)){
                sudoku[i][j]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[i][j]=0;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int sudoku[][]={0,0,8,0,0,0,0,0,0};
        {4,9,0,1,5,7,0,0,2};
        {0,0,3,0,0,4,1,9,0};
        {1,8,5,0,6,0,0,2,0};
        {0,0,0,0,2,0,0,6,0};
        {9,6,0,4,0,5,3,0,0};
        {0,3,0,0,7,2,0,0,4};
        {0,4,9,0,3,0,0,5,7};
        {8,2,7,0,0,9,0,1,3};
    }
}*/
//              CHANGE ARRAY
/*public class chnbacktracking{
    public static void changeArr(int arr[],int i,int val){
        //base
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}*/
//                  SUBSETS
/*public class chnbacktracking{
    public static void findSubset(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursion(yes)
        findSubset(str,ans+str.charAt(i),i+1);
        //No
        findSubset(str,ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        findSubset(str,"",0);
    }
}*/
//                  PERMUTATION
/*public class chnbacktracking{
    public static void findPermutation(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<=String.length()-1;i++){
            char curr=str.charAt(i);
            //in this we have abcde and we want to remove c from that 
            //then we add "a+b" and"d+e"
            //if we cant wrin=te n-1 then it has no problem
            str=str.subString(0,i)+str.subString(i+1,n-1);
            findPermutation(str,ans+curr);

        }
    }
    public static void main(String args[]){
        String str="abc";
        findPermutation(str.ans);
    }
}*/
//                  DOUBT(IN THIS IT IS NOT WORK FOR >3)
//                  nqueens
/*import java.util.*;
public class chnbacktracking{
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diogonal left up
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
        }
        //diogonal right up
        for(int i=row-1,j=col+1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        //base
        if(row==board.length-1){
            printBoard(board);
            count++;
            return;
        }
        //column
        for(int j=0;j<=board.length-1;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board,row+1);
            board[row][j]='.';
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("---------------chess-------------");
        for(int i=0;i<=board.length-1;i++){
            for(int j=0;j<=board.length-1;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n");
        int n=sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
        System.out.println("total ways to count n Queen= "+count);
    }
}*/
//              SUDOKU SOLVER
//  iska sol nhi dikha rha h (DOUBT)
public class chnbacktracking{
    //i and j are the value it contain 1-9 digits
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base
        if(row==9 && col==9){
            return true;
        }else if(row==9){
            return false;
        }
        //recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col] !=0){
            return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int row=0;row<=9;row++){
            for(int col=0;col<=9;col++){
                System.out.print(sudoku[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution exist");
            printSudoku(sudoku);
        }else{
            System.out.println("Sol does not exist");
        }
    }
}
//                           Assignment
//nhi aa rha
/*public class chnbacktracking{
    public static void solution(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static boolean isSafe(int maze[][],int x,int y){
        if(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]=1){
            return true;
        }
    }
    public static boolean solveMaze(int maze[][]) {
       int N = maze.length;
       int sol[][] = new int[N][N];
       if (solveMazeUtil(maze, 0, 0, sol) == false) {
           System.out.print("Solution doesn't exist");
           return false;
       }
       printSolution(sol);
       return true;
    }
    public static boolean solveMazeUtil(int maze,int x,int y,int sol[][]){
        if(x=maze.length-1 && y=maze.length-1 && maze[x][y]=1){
            sol[x][y]=1;
            return true;
        }
    }
    public static void main(String args[]){
        int maze[][]={{1,0,0,0},
                      { 1, 1, 0, 1 },
                      { 0, 1, 0, 0 },
                      { 1, 1, 1, 1 } };
        solveMaze(maze);
    }
}*/