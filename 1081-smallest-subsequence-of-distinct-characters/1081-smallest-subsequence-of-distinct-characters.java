class Solution {
    public String smallestSubsequence(String s) {
       int[]last=new int[26];
       for(int i=0;i<s.length();i++){
        last[s.charAt(i)-'a']=i;
       } 
       boolean[]seen=new boolean[26];
       Stack<Character>st=new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(seen[ch-'a'])continue;
        while(!st.isEmpty() && st.peek()>ch && last[st.peek()-'a']>i)
        seen[st.pop()-'a']=false;
        st.push(ch);
        seen[ch-'a']=true;
       }
       String ans="";
       while(!st.isEmpty())
       ans=st.pop()+ans;
       return ans; 
    }
}