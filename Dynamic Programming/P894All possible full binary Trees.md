# Intuition

A full binary tree (FBT) is a binary tree where every node has either 0 or 2 children. To generate all possible full binary trees with n nodes, we need to consider that every full binary tree with n nodes can be constructed by choosing a root node and dividing the remaining n - 1 nodes into two groups to form the left and right subtrees, both of which must also be full binary trees.

Since full binary trees can only be constructed with an odd number of nodes, if n is even, there are no full binary trees possible.

# Approach
Base Case:

If n is even, return an empty list because a full binary tree cannot have an even number of nodes.
If n is 1, return a list containing a single-node tree.
Recursive Case:

Use recursion to generate all possible full binary trees.
For each possible number of nodes i in the left subtree (1, 3, 5, ... up to n-2), compute all full binary trees for the left subtree with i nodes and for the right subtree with n - i - 1 nodes.
Combine each left and right subtree with a new root node to form a new full binary tree.
Memoization:

Use a HashMap (saved) to store results for each number of nodes n to avoid redundant computations and improve efficiency.


# Complexity
- Time complexity:

$$𝑂(2^𝑛)$$

The time complexity is exponential because we generate all combinations of full binary trees recursively, and the number of possible trees grows rapidly with n.
Space Complexity:



- Space complexity:

$$𝑂(2^𝑛)$$

The space complexity is also exponential due to the recursive call stack and the storage of all possible trees.


# Code
```java []
class Solution {
    static Map<Integer, List<TreeNode>> saved = new HashMap<>();
    
    public List<TreeNode> allPossibleFBT(int n) {
        if (n%2==0)
            return new ArrayList<>();

        if (!saved.containsKey(n)) {
            List<TreeNode> list = new ArrayList<>();
            
            if (n==1)
                list.add(new TreeNode(0));
            else {
                for (int i=1; i<=n-1; i+=2) {
                    List<TreeNode> lTrees = allPossibleFBT(i);
                    List<TreeNode> rTrees = allPossibleFBT(n-i-1);

                    for (TreeNode lt: lTrees) {
                        for (TreeNode rt: rTrees) {
                            list.add(new TreeNode(0, lt, rt));
                        }
                    }
                }
            }

            saved.put(n, list);
        }
        return saved.get(n);
    }
}
```
