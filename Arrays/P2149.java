class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
        int[] ans=new int[n];
        int posIdx=0;
        int negIdx=1;
        for (int num : nums) {
            if (num > 0) {
                ans[posIdx] = num;  // Assign the positive number
                posIdx += 2; // Move to the next position for positive
            } else {
                ans[negIdx] = num;  // Assign the negative number
                negIdx += 2; // Move to the next position for negative
            }
        }
        return ans;
        
    }
}
