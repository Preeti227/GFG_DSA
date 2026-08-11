class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        for(int ele:arr){ //nlogk
            pq.add(ele);
            if(pq.size()>k){
                arr[i]=pq.remove();
                i++;
            }
        }
        while(pq.size()>0) arr[i++]=pq.remove();//for the last remaining elements
    }
}
