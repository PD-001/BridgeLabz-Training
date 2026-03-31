class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();// make a hashset so that we can put unique elements only
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){// check if element already present then return true
                return true;
            }
            hs.add(nums[i]);// else add element to hashset
        }
        return false;// if no duplicate found return false
    }
}