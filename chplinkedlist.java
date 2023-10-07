/*import java.util.*;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        chplinkedlist ll=new chplinkedlist();
        //idhar doubt h
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}*/
/*import java.util.*;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        chplinkedlist ll=new chplinkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.add(2,9);
        ll.print();
    }
}*/
/*import java.util.LinkedList;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        chplinkedlist list=new chplinkedlist();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(5);
        list.add(2,9);
        list.print();
        System.out.println(list.size);
    }
}*/
//doubt glt output h
//iterative search
/*import java.util.*;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public int removeFirst(){
        if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;
    }
    public int search(int key){
        Node temp=head;
        int i=0;
        if(temp !=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String args[]){
        chplinkedlist ll=new chplinkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addFirst(6);
        ll.print();

        System.out.println(ll.search(1));
    }
}*/
//recursive search,REverse,Delete nth node from end,palindrome
/*import java.util.*;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx ==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNode(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp !=null){
            temp=temp.next;
            sz++;
        }
        //head is equal to nth node
        if(n==sz){
            //head ke next value de denge or head ht jayega
            head=head.next;
            return;
        }
        int i=1;
        int idxTofind=sz-n;
        Node prev=head;
        while(i<idxTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    //slow fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next; //+1
            fast=fast.next.next;//+2
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node midNode=findMid(head);
        //reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //check last and right half
        while(right !=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String args[]){
        chplinkedlist ll=new chplinkedlist();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(1);
        ll.addFirst(5);
        ll.print();

        System.out.println(ll.recSearch(3));
        ll.reverse();
        ll.print();
        ll.deleteNode(3);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}*/
//Detecting cycle in  loop,remove cycle from loop,merge sort by linked list
/*import java.util.*;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean detCycle(){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow== fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        

            //find meeting point
            if(slow==fast){
                slow=head;
                while(slow != fast){
                    prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                }
                //remove cycle
                prev.next=null;
                return;
            }
        }
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head1 !=null && head2 !=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1 !=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 !=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left and right half
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }
    public static void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        /*head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=head;
        
        System.out.println(detCycle());
        removeCycle();
        System.out.println(detCycle());*/
        /*chplinkedlist ll=new chplinkedlist();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(6);
        
        //yha pe kuch error h
        ll.print();
        head=ll.mergeSort(head);
        ll.print();
    }
}*/
//zig zag ll
/*import java.util.*;
public class chplinkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    //error
    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextR,nextL;
        //alternate merging
        while(left != null && right !=null ){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void addFirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        //new node next=head
        newNode.next=head;
        //head=new Node
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        chplinkedlist ll=new chplinkedlist();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(6);

        ll.print();
        ll.zigzag();
        ll.print();
    }
}*/