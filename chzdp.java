//fibonachi series
/*import java.util.*;
public class chzdp{
    public static int fib(int n,int f[]){
        if(n==0 || n==1){
            return n;
        }
        if(f[n] !=0){
            return f[n];
        }
        f[n] = fib(n-1,f)+fib(n-2,f);
        return f[n];
    }
    public static int fibTabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        int f[]=new int[n+1];
        System.out.println(fib(n,f));
        System.out.print(fibTabulation(n));
    }
}*/
//Climbing stair
/*import java.util.*;
public class chzdp{
    public static int countWays(int n,int w[]){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        if(w[n] != -1){
            return w[n];
        }
        w[n] = countWays(n-1,w)+countWays(n-2,w);
        return w[n];
    }
    public static int climbTabulation(int n){
        int dp[]=new int[n+1]; //0 to n sol hoga
        dp[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        int w[]=new int[n+1];
        Arrays.fill(w,-1);
        //System.out.println(countWays(n));
        System.out.println(countWays(n,w));
        System.out.println(climbTabulation(n));
    }
}*/
//0-1 knapsack
/*import java.util.*;
public class chzdp{
    public static int knapsack(int val[],int wt[],int W,int i,int dp[][]){

        //memoisation
        if(dp[i][W] !=-1){
            return dp[i][W];
        }
        //recursion 
        if(W==0 || i==0){
            return 0;
        }
        if(wt[i-1]<=W){
            //include
            int ans1=val[i-1]+knapsack(val,wt,W-wt[i-1],i-1,dp);
            //exclude
            int ans2=knapsack(val,wt,W,i-1,dp);
            dp[i][W]= Math.max(ans1,ans2);
            return dp[i][W];
        }else{
            dp[i][W]= knapsack(val,wt,W,i-1,dp);
            return dp[i][W];
        }
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack(val,wt,W,val.length,dp));
    }
}*/
//Unbounded knapsack
/*import java.util.*;
public class chzdp{
    public static int UnboundedKnapsack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<W+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    //i se j ki value bhrni h
                    //isme ek case h include ka and second exclude
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }else{
                    //exclude
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.print(UnboundedKnapsack(val,wt,W));
    }
}*/
/*public class chzdp{
    public static int coinChange(int coin[],int sum){
        int n=coin.length;
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<sum+1;j++){
            dp[0][j]=0;
        }
        //i is coin j sum
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1]<=j){
                    dp[i][j]=dp[i][j-coin[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String args[]){
        int coin[]={1,2,3};
        int sum=4;
        System.out.println(coinChange(coin,sum));
    }
}*/
/*public class chzdp{
    //recursion
    public static int lcs(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){//same
            return lcs(str1,str2,n-1,m-1)+1;
        }else{//diff
            int ans1=lcs(str1,str2,n-1,m);
            int ans2=lcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }
    //Memoization
    public static int lcs2(String str1,String str2,int n,int m,int dp[][]){

        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){//same
            return dp[n][m]= lcs2(str1,str2,n-1,m-1,dp)+1;
        }else{//diff
            int ans1=lcs2(str1,str2,n-1,m,dp);
            int ans2=lcs2(str1,str2,n,m-1,dp);
            return dp[n][m]= Math.max(ans1,ans2);
        }
    }
    public static void main(String args[]){
        String str1="abcdge";
        String str2="abedg";
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        //initialise
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs(str1,str2,n,m));
        System.out.print(lcs2(str1,str2,n,m,dp));
    }
}*/
//longest common substring
/*public class chzdp{
    public static int lcsubstring(String str1,String str2,int n,int m,int dp[][]){

        int ans=0;
        if(n==0 || m==0){
            return 0;
        }

        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]= 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String str1="abcdge";
        String str2="abedg";
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        System.out.print(lcsubstring(str1,str2,n,m,dp));
    }
}*/
//longest increasing subsequence
/*import java.util.*;
public class chzdp{
    public static int lcs(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int lis(int arr1[]){

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int arr2[]=new int[set.size()];
        int i=0;
        for(int num:set){
            arr2[i]=num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1,arr2);
    }
    public static void main(String args[]){
        int arr[]={50,3,10,7,40,80};
        System.out.print(lis(arr));
    }
}*/
//Wildcard matching
/*import java.util.*;
public class chzdp{
    public static boolean isMatch(String s,String p){
        int n=s.length();
        int m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];

        //initilise
        dp[0][0]=true;
        //pattern=" "
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        //String=" "
        for(int j=1;j<m+1;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }
        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                //case of i=case of j || j char=?
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String s="baabab";
        String p="****ba****ab";
        System.out.println(isMatch(s,p));
    }
}*/
//catalan and counting node
/*import java.util.*;
public class chzdp{
    public static int catalanRec(int n){

        if(n==0 ||n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans += catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;
    }
    public static int catalanMem(int n,int dp[]){

        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans += catalanMem(i,dp)*catalanMem(n-i-1,dp);
        }
        return dp[n]=ans;
    }
    public static int catalanTeb(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(catalanRec(n));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalanMem(3,dp));
        System.out.println(catalanTeb(4));
    }
}*/
//Matrix chain multiplication
/*import java.util.*;
public class chzdp{
    public static int mcm(int arr[],int i,int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr,i,k);
            int cost2=mcm(arr,k+1,j);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return ans;
    }
    public static int memoMcm(int arr[],int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }
        if(dp[i][j] != -1){
            return -1;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=memoMcm(arr,i,k,dp);
            int cost2=memoMcm(arr,k+1,j,dp);
            //operation is a*b*d
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);
        }
        return dp[i][j]= ans;
    }
    public static void main(String aman[]){
        int arr[]={1,3,5,6};
        int n=arr.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        System.out.println(mcm(arr,1,n-1));
        System.out.println(memoMcm(arr,1,n-1,dp));
    }
}*/
//Min arr jump
import java.util.*;
public class chzdp{
    public static int minJump(int nums[]){
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;

        for(int i=n-2;i>=0;i--){
            int steps=nums[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++){
                if(dp[j] != -1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i]=ans;
            }
        }
        return dp[0];
    }
    public static void main(String args[]){
        int nums[]={2,3,1,1,4};
        System.out.println(minJump(nums));
    }
}