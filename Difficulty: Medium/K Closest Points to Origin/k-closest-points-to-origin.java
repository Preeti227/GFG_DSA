class Solution {
    static class Triplet implements Comparable<Triplet> {
        long dist;
        int x;
        int y;

        Triplet(long dist, int x, int y) {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Triplet t) {
            return Long.compare(this.dist, t.dist);
        }
    }

    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int[] point : points) {

            int x = point[0];
            int y = point[1];

            long dist = (long)x * x + (long)y * y;

            pq.add(new Triplet(dist, x, y));

            if (pq.size() > k) {
                pq.poll();
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        while (!pq.isEmpty()) {

            Triplet top = pq.poll();

            ArrayList<Integer> point = new ArrayList<>();

            point.add(top.x);
            point.add(top.y);

            ans.add(point);
        }
        //Collections.reverse(ans);

        return ans;
    }
}