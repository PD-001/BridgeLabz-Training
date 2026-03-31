class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int mask=1;
        for(int i=0;i<31;i++){// loop for 32 bits
            if((n&mask)==1){// compare last bit with 1
                count++;//if 1 then increase count
            }
            n=n>>1;// right shift n by 1
        }
        return count; 
    }
}