import java.util.Arrays;

public class Solution_8 {
    private int[] stream;
    private int value;
    private int k;
    private int count;
    private int front;

    public Solution_8(int value, int k) {
        stream = new int[k];
        this.value = value;
        this.k = k;
        count = 0;
        front = 0;
    }

    public boolean consec(int num) {
        stream[front] = num;
        front = (front + 1) % k;
        count++;

        if (count < k) {
            return false;
        }

        for (int i = 0; i < k; i++) {
            if (stream[i] != value) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution_8 ds = new Solution_8(5, 3);
        System.out.println(ds.consec(1));  // Output: false
        System.out.println(ds.consec(5));  // Output: false
        System.out.println(ds.consec(5));  // Output: true
        System.out.println(ds.consec(5));  // Output: true
        System.out.println(ds.consec(2));  // Output: false
        System.out.println(ds.consec(5));  // Output: false
    }
}
