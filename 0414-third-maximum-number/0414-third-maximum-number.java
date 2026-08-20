class Solution {
    public int thirdMax(int[] nums) {
      int n=nums.length;
      long max = Long.MIN_VALUE;
      long frist_max=Long.MIN_VALUE;
      long second_max=Long.MIN_VALUE;

      for(int i=0;i<n;i++){
        if(nums[i] == max || nums[i] == frist_max || nums[i] == second_max){
         continue;
            }
            if(nums[i]>max){
              second_max=frist_max;
              frist_max=max;
              max=nums[i];
            }else if(nums[i]>frist_max){
               second_max=frist_max;
               frist_max=nums[i];
            }else if(nums[i]>second_max){
              second_max=nums[i];
            }
        }
         if(second_max == Long.MIN_VALUE){
         return (int)max;
        }
         return (int)second_max; 
    }
}