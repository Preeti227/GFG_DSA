class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = (a / gcdValue) * b;

        return new int[]{lcmValue, gcdValue};
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