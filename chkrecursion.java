/*      recursion use in trees,graph,dp;
    what is recursion= lets take an ex f(x)=x^2;f(f(x))
                then f(f(x))=(x^2)^2; 
                jab ek functn khud hi khud ko call krta h 
lets take example of factorial 5 = 5*fact4 ant then fact4=4*fact3...so on*/


//          Decreasing/Increasing ordrer of nto 1
public class chkrecursion{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1); 
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==1){
            return 1; 
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static int printSum(int n){
        if(n==1){
            return 1; 
        }
        int snm1=printSum(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2 =fib(n-2);
        int fn=fib(n-1)+fib(n-2);
        return fn; 
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1); 
    }
    public static int firstOccur(int arr[],int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
}
    //          DOUBT
    /*
    public static int lastOccur(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound=lastOccur(arr,key,i);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1; 
        return xn;
    }
        // another method if n is even then x^n/2*x^n/2
        // and if n is odd then x*x^n/2*x^n/2
        //time complexity km ho jaye gi
    public static int optimizedPower (int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedPower(a,n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2 !=0){
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
//giving 2*n floor and tile has 2*1 then find total number of ways
// n=0 i.e 2*0 ways=1
//n=1 i.e 2*1 ways=1 horizontal case nhi liya
//n=2 i.e 2*2 ways =2 ek baar dono horizontal and ek baar dono vertical
//n=3 i.e 2*3 ways=3.... 
// base condn kya h n=0,1 pe ways 1 h
//let we fill vertical tile then 2*1 is area then total area remaining 2*n-1
//i.e we put vertical+f(n-1) 
// for horizontal =horizontal+2*n-2; 
//f(n-1)+f(n-2)=total ways 
public static int tilingProblem(int n){//floor size=2*n
    //base case
    if(n==0 || n==1){
        return 1;
    }
    //kaam
    //vertical choise 
    int fnm1=tilingProblem(n-1);
    //horizontal
    int fnm2=tilingProblem(n-2);

    int totalWays=fnm1+fnm2;
    return totalWays;
}
public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){
    if(idx==str.length()){
        System.out.println(newStr);
        return; 
    }
    //kaam
    char CurrentChar=str.charAt(idx);
    if(map[CurrentChar-'a']==true){
        //duplicate
        removeDuplicate(str,idx+1,newStr,map);
    }else{
        if(map[CurrentChar-'a']=true){
            removeDuplicate(str,idx+1,newStr.append(CurrentChar),map); 
        }
    }
} 
public static int friendPairing(int n){
    //base case
    if(n==1 || n==2){
        return n;
    }
    //kaam
    //single choise 
    int fnm1=friendPairing(n-1);
    //pair 
    int fnm2=(n-1)*friendPairing(n-2);

    int totalWays=fnm1+fnm2;
    return totalWays;
}
    public static void main(String args[]){
        //ye number print sorting ke liye nhi h uske liye aray hai
        System.out.println("Enter value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        //printDec(n);
        //printInc(n);
        //System.out.println(fact(n));
        //System.out.println(printSum(n));
        //System.out.println(fib(n));
        //int arr[]={1,5,6,4,6,8,9};
        // System.out.println(isSorted(arr,0));
        //System.out.println(firstOccur(arr,6 ,0));
        //          DOUBT HAI LASTOCCUR
        //System.out.println(lastOccur(arr,6 ,0)); 
        //System.out.println(power(3,n)); 
        //System.out.println(optimizedPower(5,n)); 
        //System.out.println(tilingProblem(n));
        //String str="amanbansal";
        // removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
        System.out.println(friendPairing(n));
    }
}*/