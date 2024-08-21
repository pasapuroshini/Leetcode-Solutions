






class PascalTriangle119{

    // Method to generate a specific row of Pascal's Triangle
    public static List<Integer> generateRow(int row) {
        Long ans = 1L; // Use Long to avoid overflow in large calculations
        List<Integer> ansR = new ArrayList<>();
        ansR.add(1); // The first element of each row is always 1

        // Generate elements of the row
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans /= col;
            ansR.add(ans.intValue()); // Convert Long to Integer before adding to the list
        }

        return ansR;
    }

    // Method to generate the full Pascal's Triangle with numRows rows
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // Generate each row and add it to the final list
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        
        return ans;
    }
}
