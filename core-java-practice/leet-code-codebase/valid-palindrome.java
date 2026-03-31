class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str=str+s.charAt(i);
            }
        }
        return (new StringBuilder(str).reverse().toString().equals(str));
    }
}