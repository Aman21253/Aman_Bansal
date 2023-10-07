//override pe error h
/*import java.util.*;
public class chvheap{
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int CompareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq=new PriorityQueue<>();

        pq.add(new Student("A",3));
        pq.add(new Student("B",1));
        pq.add(new Student("C",33));
        pq.add(new Student("D",13));

        while(!pq.isEmpty()){
        System.out.print(pq.peek().name+"=>"+pq.peek().rank);
        pq.remove();
        }
    }
}*/
//error aa rha h out of bound ka
/*import java.util.*;
public class chvheap{
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x=arr.size();
            int par=(x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size() && arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }
            if(minidx !=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heapify(minidx);
            }
        }
        public int remove(){
            int data=arr.get(0);

            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap h=new Heap();
        h.add(1);
        h.add(4);
        h.add(6);
        h.add(3);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}*/
/*import java.util.*;
public class chvheap{
    public static void heapify(int arr[],int i,int size){

        int left=2*i+1;
        int right=2*i+2;
        int maxidx=i;

        if(left<size && arr[left]>arr[maxidx]){
            maxidx=left;
        }
        if(right<size && arr[right] > arr[maxidx]){
            maxidx=right;
        }
        if(maxidx != i){
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;

            heapify(arr,maxidx,size);
        }
    }
    public static void heapSort(int arr[]){
        int n=arr.length;

        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i=n-1;i>0;i--){

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}*/
/*import java.util.*;
public class chvheap{
    public static void main(String args[]){
        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int min=pq.remove();
            int min2=pq.remove();
            cost=cost+min+min2;
            pq.add(min+min2);
        }
        System.out.println("Cost of connecting: "+cost);
    }
}*/
//override pe error aa rha h
/*import java.util.*;
public class chvheap{
    static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        public Row(int soldier,int idx){
            this.soldier=soldier;
            this.idx=idx;
        }
        @Override
        public int CompareTo(Row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }else{
                return this.soldier-r2.soldier;
            }
        }
    }
    public static void main(String args[]){
        int army[][]={{1,0,0,1},
        {1,1,1,1},
        {1,0,0,0},
        {1,1,1,0}};
        int k=2;

        PriorityQueue<Row> pq=new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count=count+army[i][j]==1 ? 1:0;
            }
            pq.add(new Row(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}*/