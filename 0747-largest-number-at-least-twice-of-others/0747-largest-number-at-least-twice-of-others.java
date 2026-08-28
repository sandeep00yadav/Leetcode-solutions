class Solution {
    public int dominantIndex(int[] nums) {
       int max=nums[0];
       int maxIndex=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
           if(nums[i]>max){
            max=nums[i];
            maxIndex=i;
            }
        }
        for(int i=0;i<n;i++){
           if(i!=maxIndex && max<2*nums[i]){
            return -1;
            }
        } 
        return maxIndex;
    }
}