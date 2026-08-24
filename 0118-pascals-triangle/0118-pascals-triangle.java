class Solution {

    List<Integer> generate_Row(int row){
        int ans=1;
        List<Integer>ans_row=new ArrayList<>();
        ans_row.add(1);
        for(int col=1;col<row;col++){
          ans=ans*(row-col);
          ans=ans/col;
          ans_row.add(ans);
        }
        return ans_row;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>answer=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
         answer.add(generate_Row(i));
        }
        return answer;
    }
}