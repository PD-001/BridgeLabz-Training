class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char c:s.toCharArray()){
            ans^=c;// xor all chars of s into ans
        }
        for(char c:t.toCharArray()){
            ans=(char)(ans^c);// xor all char of t into ans leading to cancel of same chars 
        }
        return ans;
    }
}