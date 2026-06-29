class Solution {
    static String decToBinary(int n) {
        String binary="";
        while(n>0){
            int rem=n%2;
            binary=rem+binary;
            n=n/2;
        }
        return binary;
    }
}