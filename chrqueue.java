//queue by using array
//doubt circular array mein bhi doubt h
/*import java.util.*;
public class chrqueue{
    //front toh hme pta hoga
    static class Queue{
    static int arr[];
    static int size;
    static int rear;

    Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    }
    public static void add(int data){
        int rear,size;
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    }
        //          remove
    public static int Remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
//Queue in LinkedList
/*import java.util.*;
public class chrqueue{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        // isme isfull ki jarurat nhi h becz ll mein apn kitne hi element add kre
        //add
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
//queue by java collection framework
/*import java.util.*;
public class chrqueue{
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
/*import java.util.*;
public class chrqueue{
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop()); 
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(); 
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
/*import java.util.*;
public class chrqueue{
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>(); 
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack(); 
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/
/*import java.util.*;
public class chrqueue{
    public static void nonRepeating(String str){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String args[]){
        String str="aabcxcb";
        nonRepeating(str);
    }
}*/
//interhalves i.e 1 6 2 7 3 8 4 9 5 10
/*import java.util.*;
public class chrqueue{
        public static void interLeave(Queue<Integer> q){
            Queue<Integer> firstHalf=new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size/2;i++){
                firstHalf.add(q.remove());
            }while(!firstHalf.isEmpty()){
                q.add(firstHalf.remove());
                q.add(q.remove());
            }
        }

        public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}*/
//          number ko reverse krna 
/*import java.util.*;
public class chrqueue{
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}*/
//Deque
/*import java.util.*;
public class chrqueue{
    public static void main(String args[]){
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        d.addFirst(5);//5,4,3,2,1
        d.addLast(7);
        d.addLast(9);//5,4,3,2,1,7,9
        System.out.println(d);
        d.removeFirst();
        d.removeLast();
        System.out.print(d);
    }
}*/
//kuch error aa rha h
/*import java.util.*;
public class chrqueue{
    static class Stack{
        Deque<Integer> d=new LinkedList();
        public void push(int data){
            d.addLast(data); 
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.removeLast();
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek= "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}*/