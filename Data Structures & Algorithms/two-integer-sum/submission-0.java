class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int pivot = target - nums[i]; // 7 - 4 = 3

            if (map.containsKey(pivot)) {
                return new int[]{map.get(pivot), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
