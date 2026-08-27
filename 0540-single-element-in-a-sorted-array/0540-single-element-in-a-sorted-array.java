class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<e){
            int  m=s+(e-s)/2;
             // if m is even 
             if(m%2==0){
                if(nums[m]==nums[m+1]){
                 s=m+2;
                }else{
                    e=m;
                }
             }
             // if m is odd
             else{
                if(nums[m]==nums[m-1]){
                  s=m+1;
                }else{
                    e=m;
                }
             }
        }
        return nums[s];
    }
}