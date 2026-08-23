class Solution {
    public void nextPermutation(int[] nums) {
     int n=nums.length; 
     int index=-1;
     // break point pata karo
     for(int i=n-2;i>=0;i--){
      if(nums[i]<nums[i+1]){
        index=i;
        break;
      }
     }
     // koi break point na hoo edge case 
     if(index==-1){
        reverse(nums,0,n-1);
        return;
     }
     // number find karo from right side jo break point se just bada hoo
     for(int j=n-1;j>index;j--){
        if(nums[j]>nums[index]){
            int temp=nums[j];
            nums[j]=nums[index];
            nums[index]=temp;
            break;
        }
     }
     reverse(nums,index+1,n-1);
    }
    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        } 
    }       
}