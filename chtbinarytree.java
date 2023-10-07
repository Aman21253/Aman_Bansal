/*import java.util.*;
public class chtbinarytree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        static class BinaryTree{
            static int idx=-1;
            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return null;
                }
                Node newNode=new Node(nodes[idx]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);
                return newNode;
            }
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}*/
//preorder
/*import java.util.*;
public class chtbinarytree{
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            preorder(root.left);
            preorder(root.right);
            System.out.println(root.data+" ");
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.preorder(root);
    }
}*/
//inorder traversal
/*import java.util.*;
public class chtbinarytree{
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.inorder(root);
    }
}*/
//postorder 
/*import java.util.*;
public class chtbinarytree{
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.postorder(root);
    }
}*/
//level order
/*import java.util.*;
public class chtbinarytree{
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.levelorder(root);
    }
}*/
//height of tree
/*public class chtbinarytree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
    }
}*/
//diameter of tree
/*public class chtbinarytree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int dia(Node root){//O(n^2)
        if(root==null){
            return 0;
        }
        int ld=dia(root.left);
        int rd=dia(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdia=lh+rh+1;
        return Math.max(ld,Math.max(rd,selfdia));
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
        System.out.println(dia(root));
    }
}*/
//dia of tree approch 2
/*public class chtbinarytree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    static class Info{
        int dia;
        int ht;
        public Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static Info dia(Node root){//O(n)
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=dia(root.left);
        Info rightInfo=dia(root.right);
        int dia=Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.dia,rightInfo.dia));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(dia,ht);
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
        System.out.println(dia(root).dia);
    }
}*/
//root ke andar iska subroot h ki nhi
/*import java.util.*;
public class chtbinarytree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean identical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }
        if(!identical(node.left,subRoot.left)){
            return false;
        }
        if(!identical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean subTree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(identical(root,subRoot)){
                return true;
            }
        }
            boolean leftans=subTree(root.left,subRoot);
            boolean rightans=subTree(root.right,subRoot);
            return leftans ||rightans;
            //return subTree((root.left,subRoot)) || subTree((root.right,subRoot));
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);
        System.out.print(subTree(root,subRoot));
    }
}*/
//top view
//error dikha rha h
/*import java.util.*;
public class chtbinarytree{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        static class Info{
            int hd;
            Node node;
        }
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
        public static void topView(Node root){
            Queue<Info> q=new LinkedList<>();
            Hashmap<Integer,Node> map=new Hashmap<>();

            int min=0;int max=0;
            q.add(new Info(root,0));
            q.add(null);

            //queue khali nhi ht tk apn remove krenge
            while(!q.isEmpty()){
                Info curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                if(!map.containKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    //isme min se compare krange kyuki -1 ho rha h
                    min= Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
                }
            }
            for(int i=min;i<=max;i++){
                System.out.println(map.get(i).data+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        topView(root);
    }
}*/
//kth level of tree
/*import java.util.*;
public class chtbinarytree{
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
    public static void klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int k=3;
        klevel(root,1,k);
    }
}*/
//lca,kth ancestor,get path
/*import java.util.*;
public class chtbinarytree{
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
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundLeft=getPath(root.left,n,path);
        boolean foundRight=getPath(root.right,n,path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //last equal node i-1 hogi
        Node lca=path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node lcaLeft=lca2(root.left,n1,n2);
        Node lcaRight=lca2(root.right,n1,n2);
        if(lcaRight==null){
            return lcaLeft;
        }if(lcaLeft==null){
            return lcaRight;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left,n);
        int rightDist=lcaDist(root.right,n);
        
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca3=lca2(root,n1,n2);
        int dist1=lcaDist(lca3,n1);
        int dist2=lcaDist(lca3,n2);
        return dist1+dist2;
    }
    public static int kAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=kAncestor(root.left,n,k);
        int rightDist=kAncestor(root.right,n,k);
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        int max=Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static int sumtranform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=sumtranform(root.left);
        int rightChild=sumtranform(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=newleft+leftChild+newright+rightChild;
        return data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=2,n2=4,n=5,k=2;
        System.out.println(lca(root,n1,n2).data);
        System.out.println(lca2(root,n1,n2).data);
        System.out.println(minDist(root,n1,n2));
        System.out.print(kAncestor(root,n,k));
        sumtranform(root);
        preorder(root);
    }
}*/