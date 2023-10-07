/*import java.util.*;
public class chxtrie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
    
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow=true;
    }
    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}*/
//error h
/*import java.util.*;
public class chxtrie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
    
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow=true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=0;i<key.length();i++){
            if(search(key.substring(0,i)) &&
                wordBreak(key.substring(i))){
                    return true;
                }
        }
        return false;
    }
    public static void main(String args[]){
        String words[]={"I","like","sam","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String key="Ilikesamsung";
        System.out.println(wordBreak(key));
    }
}*/
//error h
//prefix pro
/*import java.util.*;
public class chxtrie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int freq;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=1;
        }
        public static Node root=new Node();
        Node curr=root;
        public static void insert(String word){
            for(int i=0;i<word.length();i++){
                int idx=word.charAt(i)-'a';
                if(curr.children[idx]==null){
                    curr.children[idx]=new Node();
                }else{
                    curr.children[idx].freq++;
                }
            }
            curr=curr.children[idx];
        }
        //yha error bta rha h
        curr.eow = true;
    }
    public static void findPrefix(Node root,String ans,int idx){
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children !=null){
                findPrefix(root.children[i],ans+(char)(i+'a'),idx+1);
            }
        }
    }
    public static void main(String args[]){
        String arr[]={"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq=-1;
        findPrefix(root," ");
    }
}*/
import java.util.*;
public class chxtrie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow;

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        int lev=0;
        int len=word.length();
        int idx=0;
        Node curr=root;
        for(;lev<len;lev++){
            idx=word.charAt(lev)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        int lev=0;
        int len=key.length();
        int idx=0;
        Node curr=root;
        for(;lev<len;lev++){
            idx=key.charAt(lev)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        return curr.eow=true;
    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        String str="ababa";
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}