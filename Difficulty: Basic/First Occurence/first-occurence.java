class Solution {
    int firstOccurence(String txt, String pat) {
        if(txt.contains(pat)) return txt.indexOf(pat);
        return -1;
    }
}