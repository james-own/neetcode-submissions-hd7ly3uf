class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();

        for(int i : nums) {
            if (!hash.add(i)) {
                return true;
            }
        }
        return false;
    }
}