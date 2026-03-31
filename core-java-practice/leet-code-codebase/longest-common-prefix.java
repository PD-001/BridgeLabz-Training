class Solution {
    public String longestCommonPrefix(String[] strs) {
        //sort the array
	Arrays.sort(strs);
        String out="";
        for(int i=0;i<strs[0].length();i++){
	    //if the current char of smallest matches with current char of largest then add in out
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                out=out+strs[0].charAt(i);
            }
            else{
                return out;
            }
        }
        return out;
    }
}