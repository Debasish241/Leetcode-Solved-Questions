class Graph {
public List<List<int[]>>adj=new ArrayList<>();
    public Graph(int n, int[][] edges) {
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[]:edges){
            addEdge(e);
        }
    }
    
    public void addEdge(int[] edge) {
        int ed[]={edge[1],edge[2]};
        adj.get(edge[0]).add(ed);
    }
    
    public int shortestPath(int node1, int node2) {
        return func(node1,node2);
    }
    public int func(int start,int end){
        int n=adj.size();
    int dis[]=new int[n];
    Arrays.fill(dis,Integer.MAX_VALUE);
    dis[start]=0;
    PriorityQueue<pair>q=new PriorityQueue<pair>((x,y)->x.dist-y.dist);
    q.add(new pair(0,start));

while(!q.isEmpty()){
    pair p=q.peek();
    q.remove();
    int d=p.dist;
    int no=p.node;
    if(no==end)return d;
    for(int edge[]:adj.get(no)){
        int neighbor=edge[0];
        int cost=edge[1];
        int ncost=dis[no]+cost;
        if(ncost<dis[neighbor]){
            dis[neighbor]=ncost;
            q.add(new pair(ncost,neighbor));
        }
    }
}
return ((dis[end]==Integer.MAX_VALUE)?-1:dis[end]);
}

}
class pair{
    int dist;int node;
    pair(int d,int n){
        this.dist=d;
        this.node=n;
    }
}