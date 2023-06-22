import java.util.Arrays;

public class Solution_4 {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();

        int n = nums.length;
        int bucketSize = Math.max((maxNum - minNum) / (n - 1), 1);
        int bucketCount = (maxNum - minNum) / bucketSize + 1;

        int[] minBucket = new int[bucketCount];
        int[] maxBucket = new int[bucketCount];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int num : nums) {
            int bucketIndex = (num - minNum) / bucketSize;
            minBucket[bucketIndex] = Math.min(minBucket[bucketIndex], num);
            maxBucket[bucketIndex] = Math.max(maxBucket[bucketIndex], num);
        }

        int maxGap = 0;
        int prevMax = minNum;

        for (int i = 0; i < bucketCount; i++) {
            if (minBucket[i] != Integer.MAX_VALUE) {
                maxGap = Math.max(maxGap, minBucket[i] - prevMax);
                prevMax = maxBucket[i];
            }
        }

        return maxGap;
    }
}
