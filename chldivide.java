//what is divide and conqur= we can break a big problem to small-2 problem
//and finding soln of that small problems and from that a big problem solve
//              MERGE SORT
//[6|3|9||5|2|8]is an array wehave toputin asce. order so we can take a mid portion 
//mid=stating index+(e.i.-s.i.)/2
/*

                    DOUBT
import java.util.*;
public class chldivide{
    public static void printArr(int arr){
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        //base
        if(si>=ei){
            return; 
        }
        //kaam
        int midValue=si+(ei-si)/2; 
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int tempidx=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i]; 
                i++;
            }else{
                temp(k)=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++]; 
        }
        while(j<=ei){
            temp[k++]=arr[j++]; 
        }
        for(k=0,i=si;k<=arr.length-1;k++,i++){
            arr[i]=temp[k]; 
        }
    }
    public static void main(String args[]){
        int arr[]={2,6,8,3,7,9};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}*/
// quick sort
//last element as pivot
//partition  
/*import java.util.*;
public class chldivide{
    public static void printArr(int arr){
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //partition
        int partitionIdx=partition(arr,si,ei);
        quickSort(arr,si,partitionIdx-1);
        quickSort(arr,partitionIdx+1,ei); 
    }
    public static void partition(int arr,int si,int ei){
        int pivot=arr[ei];
        int i =si-1;

        for(j=si;j<=ei;j++){
            if(arr[j]<=pivot){
                i++;
                int c=arr[j];
                arr[j]=arr[i];
                arr[i]=c; 
            }
        }
        i++;
        int c=pivot;
        arr[ei]=arr[i];
        arr[i]=c;
        return i;
    }
    public static void main(String args[]){
    int arr[]={2,6,8,3,7,9};
    quickSort(arr,0,arr.length-1);
    printArr(arr);
    }
}*/