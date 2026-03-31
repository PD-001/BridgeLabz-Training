class Solution {
    public int strStr(String haystack, String needle) {
        // int i=needle.length();
        // int j=0;
        int index=haystack.indexOf(needle);
        if(index!=-1) return index;
        else return -1;
    }
}