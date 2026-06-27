class Solution {
    public String toggleCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                ans.append(Character.toLowerCase(c));
            else
                ans.append(Character.toUpperCase(c));
        }
        return ans.toString();
    }
}