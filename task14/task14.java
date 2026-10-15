package task14;
import java.util.HashMap;
public class task14 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int mostFrequent = nums[0];
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }
        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Greatest count: " + maxCount);

        if (maxCount > nums.length / 2) {
            System.out.println("Majority element: " + mostFrequent);
        } else {
            System.out.println("No majority element");
        }
    }
}

