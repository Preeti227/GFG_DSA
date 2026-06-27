class Solution {
    public String[] splitString(String s) {
       StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                letters.append(c);
            } else if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                special.append(c);
            }
        }
    String[] ans=new String[3];
    ans[0]=letters.length()==0?"-1":letters.toString();
    ans[1] = digits.length() == 0 ? "-1" : digits.toString();
    ans[2] = special.length() == 0 ? "-1" : special.toString();  
    return ans;
    }
}
