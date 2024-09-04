class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ls = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum= nums[i]+nums[left]+nums[right];
                           if (sum == 0) {
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip the same elements to avoid duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // We need a larger sum, so move the left pointer to the right
                } else {
                    right--; // We need a smaller sum, so move the right pointer to the left
                }
            }
        }

        return ls;
    }
}
