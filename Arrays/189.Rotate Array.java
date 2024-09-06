class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Ensure k is within the bounds of the array length
        
        // Step 1: Reverse the last k elements
        reverse(nums, n - k, n - 1);
        
        // Step 2: Reverse the first n - k elements
        reverse(nums, 0, n - k - 1);
        
        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
