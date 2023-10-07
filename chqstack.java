/*when we talk about stack only we have to remeber four things 
in that
1)Push 0(1)
2)Pop 0(1)
3)Peek 0(1)
4)isEmpty*/
//              Stack using arrylist
/*import java.util.*;
public class chqstack{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
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
//Stack using LinkedList
/*import java.util.*;
public class chqstack{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
            //push
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
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
//stack by collection framework
/*import java.util.*;
public class chqstack{
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
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
public class chqstack{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(!s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        s.push(9);

        pushAtBottom(s,7);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}*/
/*import java.util.*;
public class chqstack{
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str="abc";
        String result=reverseString(str);
        System.out.print(result);
    }
}*/
//          Reverse stack
/*import java.util.*;
public class chqstack{
    public static void pushAtBottom(Stack<Integer> s,int data){
        while(!s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        while(!s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(8);

        reverseStack(s);
        printStack(s);
    }
}*/
//          Stock Span problem
/*import java.util.*;
public class chqstack{
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=0;i<stocks.length;i++){
            int currPrice=stocks[i];
            while(!s.isEmpty() && currPrice> stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}*/
//nextgreater
/*import java.util.*;
public class chqstack{
    public static void main(String args[]){
        int arr[]={6,8,0,1,3}; 
        Stack<Integer> s=new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<=nextGreater.length-1;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}*/
//          VALID PARANTHESIS
//          OUTPUT MEIN DOUBT H
/*import java.util.*;
public class chqstack{
    public static boolean isValid(String str){
        Stack<Character> s=new Stack();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' && ch=='{' && ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') 
                || (s.peek()=='{' && ch=='}')
                || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String str="({[]()})";
        System.out.println(isValid(str));
    }
}*/
//              DUPLICATE PARANTHESIS
/*import java.util.*;
public class chqstack{
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str2));
    }
}*/
//      output nhi aa rha
//      max area in histogram
/*import java.util.*;
public class chqstack{
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<arr.length;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //curr area
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println(maxArea+"Max Area of histogram= ");
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}*/
/*import java.util.*;
public class chqstack{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}*/