class Solution {
    static class Pair{
        int node;
        int parent;
        Pair(int node,int parent){
            this.node=node;
            this.parent=parent;
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        for(int i = 0; i < V; i++){
            if(vis[i]==false){
                if(bfs(i,adj,vis)) return true;
            }
        }
        return false;
    }
    static private boolean bfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,-1));
        vis[i]=true;
        while(q.size()>0){
            Pair front=q.remove();
            int node=front.node;
            int parent=front.parent;
            for(int ele:adj.get(node)){
                if(vis[ele]==false){
                    vis[ele]=true;
                    q.add(new Pair(ele,node));
                }
                else if(ele!=parent) return true;
            }
        }
        return false;
    }
}