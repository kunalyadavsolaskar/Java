public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        Solution_1 twoSum = new Solution_1();
        int[] indices = twoSum.twoSum(nums, target);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }
}
