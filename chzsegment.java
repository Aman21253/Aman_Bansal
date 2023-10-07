/*import java.util.*;
public class chzsegment{
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildSt(int arr[],int sti,int start,int end){
        if(start==end){
            tree[sti]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;
        buildSt(arr,2*sti+1,start,mid);
        buildSt(arr,2*sti+2,mid+1,end);
        tree[sti]=tree[2*sti+1]+tree[2*sti+2];
        return tree[sti];
    }
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if(qj<=si || qi>=sj){
            return 0;
        }else if(si>=qi && sj<=qj){
            return tree[i];
        }else{
            int mid=(si+sj)/2;
            int left=getSumUtil(2*i+1,si,mid,qi,qj);
            int right=getSumUtil(2*i+2,mid+1,sj,qi,qj);
            return left+right;
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumUtil(0,0,n-1,qi,qj);
    }
    public static void updateUtil(int i,int si,int sj,int idx,int diff){
        if(idx>sj || idx<si){
            return;
        }
        tree[i] += diff;
        if(si != sj){
            int mid=(si+sj)/2;
            updateUtil(2*i+1,si,mid,idx,diff);
            updateUtil(2*i+2,mid+1,sj,idx,diff);
        }
    }
    public static void update(int arr[],int idx,int newVal){
        int n=arr.length;
        int diff=newVal-arr[idx];
        arr[idx]=newVal;
        updateUtil(0,0,n-1,idx,diff);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildSt(arr,0,0,n-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println(getSum(arr,2,5));
        update(arr,2,5);
        System.out.println(getSum(arr,2,5));
    }
}*/
import java.util.*;
public class chzsegment{
    try{
        float f1=new float("3.0");
        int x=f1.intValue();
        byte b=f1.byteValue();
        double d=f1.doubleValue();
        System.out.println(x+b+d);
    }
    catch(NumberFormatException e){
        System.out.println("bad number");
    }
}