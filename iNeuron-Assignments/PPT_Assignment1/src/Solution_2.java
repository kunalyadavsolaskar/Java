import java.util.Arrays;

public class Solution_2 {
	public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        Solution_2 removeElement = new Solution_2();
        int k = removeElement.removeElement(nums, val);
        System.out.println("k = " + k + ", nums = " + Arrays.toString(nums));
    }
}
