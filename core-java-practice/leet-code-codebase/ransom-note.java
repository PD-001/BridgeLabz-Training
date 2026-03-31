class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int in=-1;
        for(int i=0;i<ransomNote.length();i++){
            in=magazine.indexOf(ransomNote.charAt(i));
            if(in>=0){
                magazine=magazine.substring(0,in)+magazine.substring(in+1,magazine.length());
            }
            else{
                return false;
            }
        }
        return true;
    }
}