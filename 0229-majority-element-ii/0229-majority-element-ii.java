class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer>ans=new ArrayList<>();
       int candidate1=0;
       int count1=0;
       int candidate2=0;
       int count2=0;
       for(int i=0;i<nums.length;i++){
        if(count1==0 && nums[i]!=candidate2){
            candidate1=nums[i];
            count1=1;
        }else if(count2==0 && nums[i]!=candidate1){
            candidate2=nums[i];
            count2=1;
        }else if(candidate1==nums[i]){
             count1++;
        }else if(candidate2==nums[i]){
             count2++;
        }else{
            count1--;
            count2--;
        }
    }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }if(nums[i]==candidate2){
                count2++;
            }
        }    
            int min=nums.length/3+1;
            if(count1>=min){
                ans.add(candidate1);
            }if(count2>=min  && candidate2 != candidate1){
                ans.add(candidate2);
            }
       return ans;
 }
}