/*import java.util.*;
public class chubst{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            return root=new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        if(root.data<val){
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        if(root.data<key){
            return search(root.right,key);
        }else if(root.data==key){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        
        if(search(root,9)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}*/
//error de rha h
/*import java.util.*;
public class chubst{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node Delete(Node root,int val){
        if(root.data<val){
            root.right=Delete(root.right,val);
        }if(root.data>val){
            root.left=Delete(root.left,val);
        }else{
            //case 1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 one child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case 3 two children
            Node IS=findinorderSuccesor(root.right);
            root.data=IS.data;
            root.right=Delete(root.right,IS.data);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node findinorderSuccesor(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        inorder(root);
        System.out.println();

        root = Delete(root,1);
        System.out.println();
        inorder(root);
    }
}*/
//output nhi aa rha
//root 2 leaf
//isme kuch else wale mein dikkat h (isValidate);
/*import java.util.*;
public class chubst{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printrootLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null || root.right==null){
            printpath(path);
        }
        printrootLeaf(root.left,path);
        printrootLeaf(root.right,path);
        path.remove(path.size()-1);
    }
    //we can solve inorder transversal
    //if we get sorted array then the tree is valid
    public static boolean isValidate(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min !=null && root.data <= min.data){
            return false;
        }
        if(max!=null && root.data >= max.data){
            return false;
        }
        return isValidate(root.left,min,root) && isValidate(root.right,root,max);
    }
    public static void main(String args[]){
        int values[]={1,1,1};
        Node root=null;
        
        inorder(root);
        System.out.println();
        printrootLeaf(root,new ArrayList<>());
        
        if(isValidate(root,null,null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}*/
/*import java.util.*;
public class chubst{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node Mirror(Node root){
        if(root==null){
            return null;
        }
        Node lst=Mirror(root.left);
        Node rst=Mirror(root.right);

        root.left=rst;
        root.right=lst;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        root=Mirror(root);
        preorder(root);
    }
}*/
// create Bst from sorted array and unsorted arry
//unsorted mein error h 
/*import java.util.*;
public class chubst{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node createBst2(ArrayList<Integer> inorder,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root1=new Node(inorder.get(mid));
        root1.left=createBst2(inorder,start,mid-1);
        root1.right=createBst2(inorder,mid+1,end);
        return root1;
    }
    public static void getinorder(Node root1,ArrayList<Integer> inorder){
        if(root1==null){
            return;
        }
        getinorder(root1.left,inorder);
        inorder.add(root1.data);
        getinorder(root1.right,inorder);
    }
    public static Node balancedBst(Node root1){
        ArrayList<Integer> inorder=new ArrayList<>();
        getinorder(root1,inorder);

        root1=createBst2(inorder,0,inorder.size()-1);
        return root1;
    }
    public static void preorder(Node root1){
        if(root1==null){
            return;
        }
        System.out.print(root1.data+" ");
        preorder(root1.left);
        preorder(root1.right);
    }
    public static Node createBst(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBst(arr,start,mid-1);
        root.right=createBst(arr,mid+1,end);
        return root;
    }
    public static void main(String args[]){
        //int arr[]={3,5,6,8,10,11,12};

        Node root1=new Node(8);
        root1.left=new Node(6);
        root1.right=new Node(10);
        root1.left.left=new Node(5);
        root1.left.left.left=new Node(3);
        root1.right.right=new Node(11);
        root1.right.right.right=new Node(12);

        //Node root=createBst(arr,0,arr.length-1);
        //preorder(root);

        root1=balancedBst(root1);
        getinorder(root1);
    }
}*/
/*import java.util.*;
public class chubst{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst,int size,int min,int max){
            this.isBst=isBst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxBst=0;

    public static Info largestBst(Node root){

        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info rightInfo=largestBst(root.right);
        Info leftInfo=largestBst(root.left);
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBst && rightInfo.isBst){
            maxBst=Math.max(maxBst,size);
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);
    }
    public static void main(String args[]){
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        Info info=largestBst(root);
        System.out.println("Largest Bst size: "+maxBst);
    }
}*/
//Avl
//ek line mein error h
/*import java.util.*;
public class chubst{

    public class Node{
        int data,height;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            height=1;
        }
    }
    public static Node root;

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return root.height;
    }

    public static int max(int a,int b){
        return (a>b)? a:b;
    }

    public static Node rightRotate(Node y){

        Node x=y.left;
        Node T2=x.right;
        //perform rotation
        x.right=y;
        y.left=T2;
        //update height
        y.height=max(height(y.right),height(y.left))+1;
        x.height=max(height(x.right),height(x.left))+1;

        return x;
    }

    public static Node leftRotate(Node x){

        Node y=x.right;
        Node T2=y.left;
        //perform rotation
        y.left=x;
        x.right=T2;
        //update height
        x.height=max(height(x.right),height(x.left))+1;
        y.height=max(height(y.right),height(y.left))+1;
        //return new root
        return y;
    }
    public static int getBalance(Node root){

        if(root==null){
            return 0;
        }

        return height(root.left)-height(root.right);
    }

    public static Node insert(Node root,int key){
        if(root==null){
            //yha error h
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left,key);
        }
        else if(key>root.data){
            root.right=insert(root.right,key);
        }else{
            return root;
        }
        root.height=1+Math.max(height(root.left),height(root.right));
        int bf=getBalance(root);

        //left left case
        if(bf>1 && key<root.left.data){
            return rightRotate(root);
        }
        //right right case
        if(bf<-1 && key>root.right.data){
            return leftRotate(root);
        }
        if(bf>1 && key>root.left.data){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        if(bf<-1 && key<root.right.data){
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public static void preorder(Node root1){
        if(root1==null){
            return;
        }
        System.out.print(root1.data+" ");
        preorder(root1.left);
        preorder(root1.right);
    }

    public static void main(String args[]){
        Node root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,25);

        preorder(root);
    }
}*/