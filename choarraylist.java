/*arraylist is inbuilt datastructure mtlb isme kuch nhi 
banana vo phle se mna hua h just implemen krna h*/
//it is linear structure
//it is dynamic(change) size
//it cant store primitive datatype
//primitive datatype is int,float,char,boolean


//* replace by Arraylist as well
/*import java.util.ArrayList;
public class choarraylist{
    public static void main(String args[]){
        //oops mein Classname name=new Classname(); similar
        //we use int like this down ward line
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //add operation
        list.add(1);//time complexity is O(1)
        list.add(2);
        list.add(5);
        list.add(7); 
        //ye value add kr diya
        list.add(2,9);
        System.out.println("Add new element: "+list);

        //if kisi index ki value jan ni ho
        //get operation
        int number=list.get(3);
        System.out.println("Value at index: "+number);

        //kisi element ko hatane ke liye time complexity O(n)
        list.remove(2);
        System.out.println("Removed: "+list);
        
        //agr koi value change krni ho
        list.set(1,10);
        System.out.println("Setting new value: "+list);

        //counting the size
        System.out.println("Size of list: "+list.size());

        //print all value of array
        System.out.print("All value of array: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //Reverse order
        System.out.print("Reverse matrix: ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //koi value array mein exixt krta h ki nhi
        //yha error h
        //System.out.println(list.contain(1));
    }
}*/
//              BIGGEST NUMBER FROM ARRAY
/*import java.util.ArrayList;
public class choarraylist{
    public static void main(String args[]){
        //oops mein Classname name=new Classname(); similar
        //we use int like this down ward line
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();

        //add operation
        list.add(1);//time complexity is O(1)
        list.add(2);
        list.add(5);
        list.add(7); 
        list.add(3);
        list.add(29);
        list.add(21);

        int min=
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
                //or we can written as max=Math.max(max,list.get(i));
            }
        }
        System.out.println("max element: "+max);
    }
}*/
//          SWAP
/*import java.util.ArrayList;
public class choarraylist{
    public static void Swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        //imp line or syntax
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(18);
        list.add(7);
        list.add(5);
        int idx1=1, idx2=5;
        System.out.println(list);
        Swap(list, idx1, idx2);
        System.out.println(list);
    }
}*/
//in arraylist we are also doing sorting
//collections is a class whereas collection is a interface
//in array we are using array.sort(array) for sorting our array
//here we use collections.sort(arr) in ascending order

//                  SORTING
/*import java.util.ArrayList;
import java.util.*;
public class choarraylist{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(18);
        list.add(7);
        list.add(5);

        //ascending
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //Decending
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}*/
//      MULTI DIMENSIONAL
/*import java.util.*;
public class choarraylist{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(4);
        mainList.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list.add(2);list.add(3);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+"\t");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}*/
//                CONTAINER WITH MAST WATER
/*import java.util.*;
public class choarraylist{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        //loop for 1st
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int water=ht*width;
                maxWater=Math.max(water,maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(2);
        height.add(6);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(9);
        System.out.println(storeWater(height));
    }
}*/
//  CONTAINER WITH MAST WATER whose time complexity isO(n)
/*import java.util.*;
public class choarraylist{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            //calculate water area
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(maxWater,currWater);
            //update water area
            if(height.get(rp)<height.get(lp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(2);
        height.add(6);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(9);
        System.out.println(storeWater(height));
    }
}*/
//          PAIR SUM 1
/*import java.util.*;
public class choarraylist{
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(pairSum1(list,target));
    }
}*/
//          pair sum 1 time comlexity O(n)
/*import java.util.*;
public class choarraylist{
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(rp!=lp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }else if(list.get(rp)+list.get(lp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=15;
        System.out.println(pairSum1(list,target));
    }
}*/
//          pair sum 2 in this array is sorted but rotated
//      time complexity O(n)
/*import java.util.*;
public class choarraylist{
    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(rp!=lp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                //imp line
                lp=(lp+1)%n;
            }else{
                //imp
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));
    }
}*/
/*import java.util.*;
public class choarraylist{
    public static boolean isMonotonic(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }
        return inc||dec;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(isMonotonic(list));
    }
}*/
//              DOUBT
/*import java.util.*;
public class choarraylist{
    public static boolean isLonely(ArrayList<Integer> list){}
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        System.out.println(isLonely(list));
    }
}*/
/*import java.util.*;
public class choarraylist{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        //Add            TC=O(1)
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(16);
        list.add(22);
        System.out.println(list);
        //get operation       TC=O(1)
        int element=list.get(2);
        System.out.println(element);
        //Remove operation    TC=O(n)
        int element2=list.remove(3);
        System.out.println(element2);
        System.out.println(list);
        //set
        list.set(4,10);
        System.out.println(list);
        //contain
        System.out.print(list.contains(5)+"  ");
        System.out.println(list.contains(20));
        //add in array in any index
        list.add(1,3);
        System.out.print(list);
    }
}*/
/*import java.util.ArrayList;
public class choarraylist{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(66);
        list.add(8);
        list.add(11);
        list.add(16);
        list.add(22);
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int j=list.size()-1;j>=0;j--){
            System.out.print(list.get(j)+" ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            //we can replace it by
            //max=Math.max(max,list.get(i));
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("max value: "+max);
    }
}*/
/*import java.util.*;
public class choarraylist{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(66);
        list.add(8);
        list.add(11);
        list.add(16);
        list.add(22);
        int idx1=3,idx2=4;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
        //Ascending order
        Collections.sort(list);
        System.out.println(list);
        //Decending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}*/
//              Doubt
//                      MULTI-DIMENSIONAL
/*import java.util.*;
public class choarraylist{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currlist=mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
        }
        System.out.println();
    }
}*/
