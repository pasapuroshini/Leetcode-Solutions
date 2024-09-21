class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mpp= new HashMap<>();
        for(String word: strs)
        {
            char [] chars= word.toCharArray();
            Arrays.sort(chars);
            String sortedWord= new String(chars);
            if( !mpp.containsKey(sortedWord))
            {
                mpp.put(sortedWord,new ArrayList<>());
            }
            mpp.get(sortedWord).add(word);
        }
        return new ArrayList<>(mpp.values());
    }
}
