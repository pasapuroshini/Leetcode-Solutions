class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length-1;
        int minHeight = Math.min(height[l], height[r]);
        int area = 0;

        while (r>l) {

            area = Math.max(area, (r-l)*minHeight);

            while (l<r && height[l] <= minHeight) l++;
            while (l<r && height[r] <= minHeight) r--;

            minHeight = Math.min(height[l], height[r]);

        }

        return area;
    }
}
