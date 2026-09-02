class Solution {
    public String reverseWords(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        int i=0;
        int j=0;
        while(j<n){
        while(j<n && arr[j]!=' '){
            j++;
        }
        int left=i;
        int right=j-1;
        while(left<right){
            char temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            left++;
            right--;
        }
        j++;
        i=j;
        }
        return new String(arr);  
    }
}