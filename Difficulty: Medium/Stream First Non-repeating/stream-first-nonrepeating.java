
class Solution {
    public String firstNonRepeating(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            // Remove repeated characters from the front (if a char repeated then remove it)
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Add current first non-repeating character
            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }

        return ans.toString();
    }
}