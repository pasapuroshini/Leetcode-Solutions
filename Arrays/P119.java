


class P119 {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        List<Integer> answer=new ArrayList<>();
        answer.add((int)ans);
        for(int i=1;i<=rowIndex;i++)
        {
             ans=ans*(rowIndex-i+1);
             ans=ans/i;

          answer.add((int)ans);

        }
        return answer;
    }
}
