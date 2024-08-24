class P338 {
    public int[] countBits(int n) {
        // Create an array of size n + 1
        int[] ans = new int[n + 1];

        // Base case: if n is 0, return the empty array
        if (n == 0) {
            return ans;
        }

        // Base cases:
        // Set the first two elements of the array
        ans[0] = 0;
        if (n >= 1) {
            ans[1] = 1;
        }

        // Iterate from 2 to n
        for (int x = 2; x <= n; ++x) {
            // If 'x' is even, set the x-th element of the array to 
            // the (x / 2)-th element
            if (x % 2 == 0) {
                ans[x] = ans[x / 2];
            }
            // If x is odd, set the x-th element of the array to 
            // the (x / 2)-th element + 1
            else {
                ans[x] = ans[x / 2] + 1;
            }
        }

        // Return the final array
        return ans;
    }
}