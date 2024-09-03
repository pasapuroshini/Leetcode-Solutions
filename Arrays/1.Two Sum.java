class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        int num=nums[i];
        int diff= target-num;
        if(mp.containsKey(diff))
        {
            ans[0]=mp.get(diff);
            ans[1]=i;
              return ans;
        }
        mp.put(nums[i],i);


        }
        return ans;
    }
}
