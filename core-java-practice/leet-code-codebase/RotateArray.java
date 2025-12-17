class Solution {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;// for k greater than length
        //reverse array using 3 swaps
        swap(nums, 0, nums.length-1);
        swap(nums, 0, k-1);
        swap(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int[] arr, int start, int end){
        //reverse logic
        while(start<end){
            int t=arr[start];
            arr[start] =arr[end];
            arr[end]=t;
            start++;
            end--;
        }
    }
}