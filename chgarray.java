/*import java.util.*;
public class array{
public static void main(String args[]){
    int marks[]=new int[40]; 
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    marks[3]=sc.nextInt();
    System.out.println("Physics: "+marks[0]);
    System.out.println("Chemistry: "+marks[1]);
    System.out.println("math: "+marks[2]);
    System.out.println("math: "+marks[3]);
    } 
}*/
/*import java.util.*;
public class array{
public static void main(String args[]){
    int marks[]=new int[40]; 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter each subject number");
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    marks[3]=sc.nextInt();
    System.out.println("Physics: "+marks[0]);
    System.out.println("Chemistry: "+marks[1]);
    System.out.println("math: "+marks[2]);
    System.out.println("math: "+marks[3]);

    int percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
    System.out.println("percentage: "+percentage+"%");
    } 
}*/
//                   UPDATE MARKS 
/*import java.util.*;
public class array{
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;

        }
    }
    public static void main(String args[]){
        int marks[]={97,99,95};
        update(marks);

        // Print our marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}*/
//                  LINEAR SEARCH
/*import java.util.*;
public class chgarray{
    public static int linearSearch(int numbers[],int key){

        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // index ek km aayega kyuki 0 se start hota h
        int numbers[]={2,3,5,7,8,0,12};
        int key=12;
        int index = linearSearch(numbers,key);
        if(index==-1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("key is an index: "+index);
        }
    }
}*/
//                     BINARY SEARCH
/*import java.util.*;
public class array{
    public static int binarySearch(int numbers[],int key){
        int start=0;int end=numbers.length-1;
        
        while(start <= end){
            // Mid term ko difine kiya h
            int mid=(start+end)/2;
            //comparision
            // mid term h toh mid term ka index aa jayega
            if(numbers[mid] ==key){
                return mid;
            }
            //ek ek km hota jayega
            else if(numbers[mid]<key){
                start=mid-1;
            }
            //ek ek badhta jayega
            else{
                start=mid+1;
            }
        }
        return -1 ;
    }
    public static void main(String args[]){
        // number difine kiya h
        int numbers[]={2,4,6,7,9,12,15};
        int key=7;
        System.out.println("Key index is: "+binarySearch(numbers,key));
    }
}/*

//                      DOUBT
/*import java.util.*;
public class array{
    public static void reverse(int number){
        int first=0,last=numbers.length-1; 
        while(first<last){
            int c=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=c; 
            first++;
            last--;
        }
    }
}
public static void main(String args[]){
    int numbers={2,4,5,6,8,3};
    reverse(numbers);
    for(int i=0; i<numbers.length ;i++){
        System.out.println(numbers[i]+" ")
    }
    System.out.println();
}*/
//                      PAirs print ke liye
/*import java.util.*;
public class chgarray{
    public static void printPairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int c=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+c+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("total pairs: "+tp);
    }

public static void main(String args[]){
    int numbers[]={2,4,5,6,7,8};
    printPairs(numbers);
}
}*/
//                  subarray print krne ka 
/*import java.util.*;
public class chgarray{
    public static void printSubarray(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=1;k<j;k++){
                    System.out.print(numbers[k]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[]= {2,4,5,6,8,12};
        printSubarray(numbers);
    }
}*/
//                   RAINWATER TRAPPING
//                         Doubt

/*import java.util.*;
public class array{
    public static void trappedRainwater(int height[]){
        //Calculate left max boundary
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //Calculate right max boundary
        int righttMax[]=new int[height.length];
        righttMax[height.length-1]=height[height.length-1 ];
        for(int i=height.length-2; i>=0 ; i++){
            rightMax[i]=Math.max(height[i],righttMax[i+1]);
        }
        int trappedRainwater=0; 
        //loop
        for(int i=0; i<=height.length; i++){
            //water level = min(left max boundary-right max boundary)
            int waterlevel= Math.min(leftMax[i],rightMax[i]);
            trappedRainwater=waterlevel-height[i]; 
        }
        return trappedRainwater; 
    } 
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2};
        System.out.println(trappedRainwater(height));
    }
}*/
//              bit manipulation even or odd
//               public class mein error h
/*import java.util.*;
public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.print("even"); 
        }else{
            System.out.print("odd");
        }
    }
    public static void main(String args[]){
        oddOrEven(8);
        oddOrEven(5);
    }
}*/
/*import java.util.*;
public class array{
    public static int countSetBits(int n){
        int count=0;
        while(n>0) {
            if((n&1)!=0) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countSetBits(15));
    }
}*/
/*public class chgarray{
public static int Expo(int a,int n) {
    int ans=1;
    while(n>0){
        if((n&1) !=0) {
            ans= ans*a;
        }
        a=a*a; 
        n=n>>1;
    }
    return ans;
}
public static void main(String args[]) {
    System.out.println(Expo(3,5)); 
}
}*/
/*import java.util.*;
public class chgarray{
    public static void main(String args[]){
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        System.out.println("phy: "+marks[0]);
    }
}*/
/*import java.util.*;
public class chgarray{
    public static void updateMarks(int marks[]){
        for(int i=0;i<=marks.length-1;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={94,95,96,04,98};
        updateMarks(marks);

        for(int i=0;i<=marks.length-1;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.print("\n");
    }
}*/
//              Linear search
//               Galt h code
/*import java.util.*;
public class chgarray{
    public static void linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,5,7,4,2,10};
        System.out.println("Enter key: ");
        int key=5;
        int index = linearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is in index: "+index);
        }
    }
}*/
//              LARGEST NUMBER
/*import java.util.*;
public class chgarray{
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,4,8,2,5}; 
        System.out.println("Largest number is: "+getLargest(numbers));
    }
}*/
//              BINARY SEARCH
/*import java.util.*;
public class chgarray{
    public static int binarySearch(int numbers[],int key){
        int first=1;int end=numbers.length-1;
        while(first<=end){
            int mid=(first+end)/2;
            if(numbers[mid]==key){
                return mid;
            }else if(numbers[mid]>key){
                end= mid-1;
            }else if(numbers[mid]<key){
                first= mid+1;
            }
        }
        return -1;
    }
    public static int reverse(int numbers[]){
        int first=1;int end=numbers.length-1;
    }
    public static void main(String args[]){
        int numbers[]={2,5,6,7,9,10};
        //int key=3;
        //System.out.println("Key is:"+binarySearch(numbers,key));
        System.out.println("Reverse array is: "+reverse(numbers));
    }
}*/
//Doubt
/*import java.util.*;
public class chgarray{
    public static int reverse(int numbers[]){
        int first=1,end=numbers.length-1;
        while(first<end){
            //swap number
            int temp=numbers[first];
            numbers[first]=numbers[end];
            numbers[end]=temp;
            first++;
            end--;
            //swap two number without using 2 variable
            //a=a+b;
            //b=a-b;
            //a=a-b;
        } 
    }
    public static void main(String args[]){
        int numbers[]={2,5,6,7,9,10};
        reverse(numbers);
        for(int i=0;i<numbers.length-1;i++){
            System.out.println("Reverse array is: "+numbers[i]);
        }
        System.out.println();
    }
}*/
//  max sum of subarray
//  TIME COMPLEXITY IS O(n^3) which is very bad
/*import java.util.*;
public class chgarray{
    public static void sumSubarray(int number[]){
        //if we use Integer then we always use import java.util.*
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        //i=first
        for(int i=0;i<number.length;i++){
            //j=end
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    //basic concept of sum
                    currSum=currSum+number[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                //this is for sum of each subarray
                System.out.println(currSum);
            }
        }
        System.out.println("max sum= "+maxSum);
    }
    public static void main(String args[]){
        int number[]={2,-4,6,8,1,-4};
        sumSubarray(number);
    }
}*/
//Another method of max subarray
//time complexity is less
/*import java.util.*;
public class chgarray{
    public static void sumSubarray(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        //i=first
        for(int i=0;i<number.length;i++){
            //j=end
            for(int j=i;j<number.length;j++){
                currSum=i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= "+maxSum);
    }
    public static void main(String args[]){
        int number[]={2,-4,6,8,1,-4};
        sumSubarray(number);
    }
}*/
//It is a brute force whose time complexity is O(n^2)
/*import java.util.*;
public class chgarray{
    public static boolean Distinct(int number[]){
        for(int i=1;i<number.length-1;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int number[]={1,4,23,22,2,8};
        System.out.print(Distinct(number));
    }
}*/
//best way it is done by HashSet which we study in further chapter 
//see it from pdf 
//              Another question
/*import java.util.*;
public class chgarray{
    public int Profit(int price[]){
        int buy=price[0];
        int profit=0;
        for(int i=1;i<=price.length;i++){
            if(buy<price[i]){
                profit=Math.max(price[i]-buy,profit);
            }else{
                buy=price[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int prices[]={1,3,6,2,9};
        //iss line pe doubt h
        System.out.print(Profit(price));
    }
}*/
/*import java.util.*;
public class chgarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,sum=0;

        //creating array
        System.out.print("Total no of digit: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //printing the digit
        for(i=0;i<arr.length;i++){
            System.out.print("Enter digit: ");
            arr[i]=sc.nextInt();
        }

        //sum
        for (i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.print("The sum of arr is: "+sum);
    }
}*/