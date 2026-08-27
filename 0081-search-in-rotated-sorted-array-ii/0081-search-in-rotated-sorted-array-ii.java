class Solution {
    static int Pivotindx(int[]nums){
        int n=nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
    public boolean binary_search(int[]nums,int s,int e , int target){
        while(s<=e){
          int mi=s+(e-s)/2;
          if(nums[mi]==target){
          return true;
          }else if(nums[mi]>target){
          e=mi-1;
          }else{
          s=mi+1;
          }
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        if(n==0){
            return false;
        }
        // pivot index find karo
        int ans=Pivotindx(nums); 
        // binary search in right sorted part
        if(target>=nums[ans]&&target<=nums[n-1]){
        return binary_search(nums,ans,n-1,target);
        }// binary search in left part
        return binary_search(nums,0,ans-1 ,target);
    }
}
        
    
