import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits were 9, we need to add an extra digit at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example usages:
        int[] result1 = sol.plusOne(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(result1));  // Output: [1, 2, 4]

        int[] result2 = sol.plusOne(new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString(result2));  // Output: [4, 3, 2, 2]

        int[] result3 = sol.plusOne(new int[]{9});
        System.out.println(Arrays.toString(result3));  // Output: [1, 0]
    }
}
