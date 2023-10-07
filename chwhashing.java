/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        
        //insert-O(1)
        hm.put("India",150);
        hm.put("China",20);
        hm.put("us",100);
        System.out.println(hm);

        //Get-O(1)
        int pop=hm.get("India");
        System.out.println(pop);

        //Contain key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove key
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        //Size
        System.out.println(hm.size());
        //clear hashmap
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        
        //insert-O(1)
        hm.put("India",150);
        hm.put("China",20);
        hm.put("us",100);
        hm.put("Indonesia",21);
        hm.put("Neo",23);

        //Iterate
        Set<String> key=hm.keySet();
        System.out.println(key);
        //for each h google se pdhna h
        for(String k:key){
            System.out.println("key"+k+",value: "+hm.get(k));
        }
    }
}*/
//doubt
/*import java.util.*;
public class chwhashing{
    static class hashmap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int arr[];
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SupressWarnings("unchecked")
        public void HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            //ye data ki form change kr deta h
            int hc=key.hashCode();
            //size 4 h toh rem 0 to 3 hoga and vo hi idx hoga
            return Math.abs(hc)%N;
        }
 
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;

            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SupressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;
            for(int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(Node.key,Node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=SearchInLL(key);
            if(di !=-1){
                Node node=buckets[bi].get(di);
                node.value=value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lamda=(double) n/N;
            if(lamda>2.0){
                rehash();
            }
        }
        public boolean containsKey(){
            int bi=hashFunction(key);
            int di=SearchInLL(key);
            if(di !=-1){
                return true;
            }else{
                return false;
            }
        }
        public V get(){
            int bi=hashFunction(key);
            int di=SearchInLL(key);
            if(di !=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }
        public V remove(){
            int bi=hashFunction(key);
            int di=SearchInLL(key);
            if(di !=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> key=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll){
                    key.add(node.key);
                }
            }
            return key;
        }
    }
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",150);
        hm.put("China",20);
        hm.put("us",100);
        hm.put("Indonesia",21);
        hm.put("Neo",23);
        ArrayList<String> keys=hm.keySet();
        for(String key:key){
            System.out.println(key);
        }
    }
}*/
//linked hash map is also same like hashmap
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("china",10);
        lhm.put("USa",16);
        lhm.put("Iran",300);
        System.out.println(lhm);
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(Integer key:hm.keySet()){
            if(hm.get(key)>arr.length/3);
            System.out.println(key);
        }
    }
}*/
//Doubt h
/*import java.util.*;
public class chwhashing{
    public static boolean isAlgram(String s,String t){
    HashMap<String,Integer> hm=new HashMap<>();

    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        //error
        hm.put(c,hm.getOrDefault(c,0)+1);
    }
    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        if(hm.get(ch) != null){
            if(hm.get(ch)==1){
                hm.remove(ch);
            }else{
                //error
                hm.put(ch,hm.get(ch)-1);
            }
        }else{
            return false;
        }
    }
    return hm.isEmpty();
    }
    public static void main(String args[]){
        String s="race";
        String t= "care";

        System.out.println(isAlgram(s,t));
    }
}*/
//hash set
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(3);
        hs.add(1);

        System.out.println(hs);
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<>();
        cities.add("delhi");
        cities.add("Jaipur");
        cities.add("Bengluru");
        cities.add("rajgarh");

        //Iterator it=cities.iterator();
        //while(it.hasNext()){
        //    System.out.println(it.next());
        //}
        //App 2
        //for(String city:cities){
        //  System.out.println(city);
        //}
        LinkedHashSet<String> cities2=new LinkedHashSet<>();
        cities2.add("delhi");
        cities2.add("Jaipur");
        cities2.add("Bengluru");
        cities2.add("rajgarh");
        for(String city:cities2){
            System.out.println(city);
        }
        TreeSet<String> ts=new TreeSet<>();
        ts.add("delhi");
        ts.add("Jaipur");
        ts.add("Bengluru");
        ts.add("rajgarh");
        System.out.println(ts);
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        int num[]={1,4,2,5,1,5,7,9,8};
        HashSet<Integer> Dc=new HashSet<>();
        for(int i=0;i<num.length;i++){
            Dc.add(num[i]);
        }
        System.out.println(Dc.size());
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> union=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        System.out.println(union.size());
        union.clear();

        //intersection
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(union.contains(arr2[i])){
                count++;
                union.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static String start(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("che","ben");
        tickets.put("mum","del");
        tickets.put("goa","che");
        tickets.put("del","goa");
        String start=start(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}*/
/*import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hm.containsKey(sum)){
                len=Math.max(len,j-hm.get(sum));
            }else{
                hm.put(sum,j);
            }
        }
        System.out.print("Lar subarray: "+len);
    }
}*/
import java.util.*;
public class chwhashing{
    public static void main(String args[]){
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,ans=0;
        for(int j=0;j<arr.length;j++){
            sum +=arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}