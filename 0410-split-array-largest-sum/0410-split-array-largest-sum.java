class Solution {
    public boolean valid(int[]nums,int k,int mid){
        int sum=0;
        int parts=1;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                parts++;
                sum=nums[i];
            }
        }
        return parts<=k;
    }
    public int splitArray(int[] nums, int k) {
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            e=e+nums[i];
            if(nums[i]>s){
                s=nums[i];
            }
        }
        while(s<=e){
            int m=s+(e-s)/2;
            if(valid(nums,k,m)){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return s;
    }
}