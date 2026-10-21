class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder ans = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && count++ > 0) ans.append(c);
            if (c == ')' && --count > 0) ans.append(c);
        }
        return ans.toString(); 
    }
}