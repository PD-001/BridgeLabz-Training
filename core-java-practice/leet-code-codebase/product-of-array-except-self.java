class Solution {
    public int[] productExceptSelf(int[] arr) {

        int mul=1, flag=0;
        int [] out=new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                mul*=arr[i];
            }
            else{
                flag++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(flag==0){
                out[i]=mul/arr[i];
            }
            else{
                 if(arr[i]!=0 || flag!=1){
                     out[i]=0;
                 }   
                 else{
                     out[i]=mul;
                 }
            }
        }
        return out;
        
    }
}