/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;
    
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String args[]){
        int V=5;
        //here all element are null;
        ArrayList<Edge>[] graph=new ArrayList[V];
        //we want to empty this arraylist
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        graph[4].add(new Edge(4,2,2));

        //neighbor of 2
        for(int j=0;j<graph[2].size();j++){
            Edge e=graph[2].get(j);
            System.out.println(e.dest);
        }
    }
}*/
//dfs,bfs
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }
    
    //tc O(V+E)->adjacencey list
    //this is helper funct of bfs 
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        //src
        q.add(0);
        //jab tk empty nhi ho Queue
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                //curr element ko print krane ke liye
                System.out.print(curr+" ");
                // vis array ko true kr do print krne ke baad
                vis[curr]=true;
                //last tk jayenge and dest ko add kr denge queue mein
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            dfsutil(graph,i,visit);
        }
    }
    public static void dfsutil(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
        
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void main(String aman[]){
        //V is vertex and it is equal to graph.length
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        // graph print ho gya
        createGraph(graph);
        //isme call krke bfs print kr diya
        //bfs(graph);
        dfs(graph,0,new boolean[V]);
    }
}*/
//if any cycle exist
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                //jis node se suruat krte h uska par nhi hota
                if(detectCycleutil(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleutil(ArrayList<Edge>[] graph,boolean vis[],int curr,int par){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //case 3
            if(!vis[e.dest]){
                if(detectCycleutil(graph,vis,e.dest,curr)){
                    return true;
                }
            }
            //case 1
            else if(vis[e.dest] && e.dest !=par){
                return true;
            }
            //case 2
        }
        return false;
    }
    public static void main(String aman[]){
        //V is vertex and it is equal to graph.length
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        System.out.print(detectCycle(graph));
    }
}*/
//Bipartite graph
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
    }
    public static boolean bipartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e=graph[curr].get(j);
                        if(col[e.dest]== -1){
                            int nextcol=col[curr] == 0 ? 1:0;
                            col[e.dest]=nextcol;
                            q.add(e.dest);
                        }else if(col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String aman[]){
        //If graph doesn't have cycle then its not bipartite graph
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        System.out.println(bipartite(graph));
    }
}*/
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
    }
    public static boolean cycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        boolean Stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleutil(graph,i,vis,Stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleutil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean Stack[]){
        vis[curr]=true;
        Stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(Stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycleutil(graph,e.dest,vis,Stack)){
                return true;
            }
        }
        Stack[curr]=false;
        return false;
    }
    public static void main(String args[]){
        int v=4;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        System.out.println(cycle(graph));
    }
}*/
//                  TOPOLOGICAL SORTING by DFS
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void topSort(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortutil(graph,i,vis,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topSortutil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSortutil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}
//          TOPOLOGIGAL SORT BY BFS
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void calcind(ArrayList<Edge>[] graph,int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort2(ArrayList<Edge> graph[]){
        int indeg[]=new int[graph.length];
        calcind(graph,indeg);
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;

                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        topSort2(graph);
    }
}*/
//print all path
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void printAllpath(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllpath(graph,e.dest,dest,path+src);
        }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        createGraph(graph);
        int src=5,dest=1;
        printAllpath(graph,src,dest,"");
    }
}*/
//Dijkstra
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int CompareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph,int src){
        int dist[]=new int[graph.length]; //dist[i]= src to i
        for(int i=0;i<graph.length;i++){
            if(i !=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String aman[]){
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        int src=0;
        dijkstra(graph,src);
    }
}*/
//Bellman ford algorithm
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
    public static void bellmanFord(ArrayList<Edge>[] graph,int src,int V){
        int dist[]=new int[V];
        for(int i=0;i<dist.length;i++){
            if(i != src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        V=graph.length;
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int w=e.wt;
                    //relaxation
                    if(dist[u]!= Integer.MAX_VALUE && dist[u]+w<dist[v]){
                        dist[v]=dist[u]+w;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String aman[]){
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph,0,V);
    }
}*/
//MST
//Override
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    static class pair implements Comparable<pair>{
        int v;
        int cost;
        public pair(int v,int c){
            this.v=v;
            this.cost=c;
        }
        @Override
        public int CompareTo(pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void prims(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0,0));
        int finalCost=0;

        while(!pq.isEmpty()){
            pair curr=pq.remove();
            //curr.v represent curr vertex
            if(!vis[curr.v]){
                // i.e ab vo visit ho gyi
                vis[curr.v]=true;
                finalCost +=curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new pair(e.dest,e.wt));
                }
            }
        }
        System.out.println("The final cost of MST: "+finalCost);
    }
    public static void main(String aman[]){
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}*/
//output nhi de rha
//cheapest flight
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest,price;

        public Edge(int s,int d,int p){
            this.src=s;
            this.dest=d;
            this.price=p;
        }
    }
    public static void createGraph(int flight[][],ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flight.length;i++){
            int src=flight[i][0];
            int dest=flight[i][1];
            int price=flight[i][2];
        
            Edge e=new Edge(src,dest,price);
            graph[src].add(e);
        }
    }
    static class Info{
        int  v,cost,stop;

        public Info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stop=s;
        }
    }
    public static int cheapestFlight(int V,int flight[][],int src,int dest,int k){
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(flight,graph);

        int dist[]=new int[V];
        for(int i=0;i<V;i++){
            if(i !=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stop>k){
                break;
            }
            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);

                int u=e.src;
                int v=e.dest;
                int p=e.price;

                if(curr.cost+p<dist[v] && curr.stop<=k){
                    dist[v]=curr.cost+p;
                    q.add(new Info(v,dist[v],curr.stop+1));
                }
            }
        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String aman[]){
        int V=4;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,dest=3,k=1;
        cheapestFlight(V,flight,0,3,1);
    }
}*/
//connecting cities

import java.util.*;
public class chygraph{
    static class Edge implements Comparable<Edge>{
        int dest,cost;

        public Edge(int d,int c){
            this.dest=d;
            this.cost=c;
        }
    }
    @Override
    public int CompareTo(Edge e2){
        return this.cost-e2.cost;
    }
    public static int connectingCities(int cities[][]){
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[cities.length];

        pq.add(new Edge(0,0));
        int finalCost=0;

        while(!pq.isEmpty()){
            Edge curr=pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest]=true;
                finalCost +=curr.cost;
                for(int i=0;i<cities[curr.dest].length;i++){
                    if(cities[curr.dest][i] !=0){
                        pq.add(new Edge(i,cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String args[]){
        int cities[][]={{0,1,2,3,4},
                    {1,0,50,7},
                    {2,5,0,6,0},
                    {3,0,6,0,0},
                    {4,7,0,0,0}};
        System.out.print(connectingCities(cities));
    }
}
//DISJOINT set ds
/*import java.util.*;
public class chygraph{
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return find(par[x]);
    }
    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }else if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }
    }
    public static void main(String args[]){
        init();
        System.out.println(find(3));
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
    }
}*/
//kruskal method
//error h
/*import java.util.*;
public class chygraph{
    public class Edge implements Comparable<Edge>{
        int src,dest,wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
        @Override
        public int CompareTo(Edge e2){
            return this.wt-e2.wt;
        }
    }
    //yha kuch error h
    static void createGraph(ArrayList<Edge> edge){
        edge.add(new Edge(0,1,10));
        edge.add(new Edge(0,2,15));
        edge.add(new Edge(0,3,30));
        edge.add(new Edge(1,3,40));
        edge.add(new Edge(2,3,50));
    }
    static int n=4;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return find(par[x]);
    }
    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA]=parB;
        }else if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }
    }
    public static void kruskalMst(ArrayList<Edge> edge,int V){
        init();
        Collections.sort(edge);
        int mstCost=0;
        int count=0;
        for(int i=0;count<V-1;i++){
            Edge e=edge.get(i);

            int parA=find(e.src);
            int parB=find(e.dest);
            if(parA != parB){
                union(e.src,e.dest);
                mstCost += e.wt;
                count++;
            }
        }
    }
    public static void main(String args[]){
        int V=4;
        ArrayList<Edge> edge=new ArrayList<>();
        createGraph(edge);
        kruskalMst(edge,V);
    }
}*/
/*import java.util.*;
public class chygraph{
    static class Edge{
        int src,dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }
    public static void topSort(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void kosaraju(ArrayList<Edge>[] graph,int V){
        //step 1
        Stack<Integer> s=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph,i,vis,s);
            }
        }
        //step 2
        ArrayList<Edge> transpose[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));//reverse
            }
        }
        //step 3
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.print("SCC=>");
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        kosaraju(graph,V);
    }
}*/