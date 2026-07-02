class Solution {
    public int lcm(int a, int b) {
        int gcdValue = gcd(a, b);
        return (a * b) / gcdValue;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
   