class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        ArrayList<Integer> ans=new ArrayList<>();
        Queue <Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[V];
        q.add(0);
        vis[0]=true;
        while(q.size()>0){
            int front=q.remove();
            ans.add(front);
            for(int ele:adj.get(front)){
                if(!vis[ele]){
                    vis[ele]=true;
                    q.add(ele);
                }
            }
        }
        return ans;
    }
}