class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=nums[0]+nums[1]+nums[2];
        int diff= Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
        int j=i+1;
        int k=nums.length-1;
        while(j<k)
        {

                int sum = nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return target;
                else if(sum<target)
                   j++;
                else
                   k--;

                int difftotarget= Math.abs(target-sum);
                if(difftotarget< diff)
                {
                    diff=difftotarget;
                    result=sum;
                }




        }


        }
        return result;

    }
}
