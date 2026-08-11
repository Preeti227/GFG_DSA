class Solution {
    public int minCost(int[] arr) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        int total=0;
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            int cost=a+b;
            pq.add(cost);
            total+=cost;
        }
        return total;
    }
}