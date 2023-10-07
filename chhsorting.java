/*                  ASENDING ORDER
public class sorting{
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2,8,13,12,54,82,21};
        bubbleSort(arr);
        printArr(arr);
    }
}*/
//              Selection sort DOUBT
/*public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int min=i;

        for(int j=i+1; j<arr.length; j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        //swap
        int t= arr[min];
        arr[min]= arr[i];
        arr[i]=t;
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2,8,13,12,54,82,21};
        selectionSort(arr);
        printArr(arr);
    }
}*/
//sorting has 4 type
//(1)BUBBLE SORT (2)SELECTION SORT  (3)INSERTION SORT   (4)COUNTING SORT
//              BUBBLE SORT
/*import java.util.*;
public class chgarray{
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,3,4,1,6};
        bubbleSort(arr);
        printArr(arr);
    }
}*/
//              Selection sort
//                  DOUBT
/*import java.util.*;
public class chgarray{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minValue=1;
            for(int j=i+1;j<arr.length;i++){
                if(arr[minValue]>arr[j]){
                    minValue=j;
                }
            }
            int temp=arr[minValue];
            arr[minValue]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={5,1,3,6,2};
        selectionSort(arr);
    }
}*/
//          insertion sort (doubt)
/*import java.util.*;
public class chgarray{
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={2,7,5,1,4};
        insertionSort(arr);
    }
}*/
//fibbonachi series
import java.util.*;
public class chhsorting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value: ");
        int n=sc.nextInt();
        int firstTerm=0,secondTerm=1;
        for(int i=0;i<n;i++){
            System.out.print(firstTerm+" ");

            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}