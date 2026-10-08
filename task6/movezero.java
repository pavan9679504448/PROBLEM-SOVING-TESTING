package task6;
import java.util.Arrays;
import java.util.Scanner;
public class movezero {
        public static void moveZeroes(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }
        while (position < nums.length) {
            nums[position] = 0;
            position++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
