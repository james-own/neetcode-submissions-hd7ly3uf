class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // [1,2,2,3,3,3], k = 2

        // use a map to find most repeated

        Map<Integer, Integer> map = new HashMap();
        int[] result = new int[k];

        for(int num : nums) {
        
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // sort map entries 

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        for(int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
