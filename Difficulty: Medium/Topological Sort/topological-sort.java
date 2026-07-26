class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        boolean[] visited=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!visited[i]) dfs(i,visited,adj,ans);
        }
        Collections.reverse(ans);
        return ans;
    }
    private void dfs(int i,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        visited[i]=true;
        for(int ele:adj.get(i)){
            if(!visited[ele]) dfs(ele,visited,adj,ans); 
        }
        ans.add(i);
    }
}