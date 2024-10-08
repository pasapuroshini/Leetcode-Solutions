class P3{
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}
/*This solution finds the length of the longest substring without repeating characters in a given string s. It uses a sliding window technique with two pointers, left and right, to explore potential substrings. As the right pointer moves through the string, characters are added to a HashSet. If a duplicate character is found, the left pointer is moved to the right until the duplicate is removed, ensuring the substring remains unique. The maximum length of such substrings is tracked using maxLength. The time complexity is O(n), where n is the length of the string, since each character is processed at most twice. The space complexity is O(min(n, m)), where m is the size of the character set (e.g., 26 for lowercase English letters), due to the storage of characters in the HashSet.






*/
