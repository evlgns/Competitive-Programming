class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twosum = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++)
                if (nums[i] + nums[j] == target && i != j) {
                    twosum[0] = i;
                    twosum[1] = j;
                    break;
                }
        }
        return twosum;
    }
}