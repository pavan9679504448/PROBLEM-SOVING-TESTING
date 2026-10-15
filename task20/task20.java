package task20;

import java.util.Arrays;

public class task20 {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        task20 obj = new task20();

        System.out.println("Before Moving Zeroes:");
        System.out.println(Arrays.toString(nums));

        obj.moveZeroes(nums);

        System.out.println("After Moving Zeroes:");
        System.out.println(Arrays.toString(nums));
    }
}
