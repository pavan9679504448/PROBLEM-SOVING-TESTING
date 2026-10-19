package task34;
import java.util.*; // Assuming the intended import is for utility classes
public class task34 {
    public static int vli(int[] num){
        int count=0;
        int candidate=0;
        for(int nums:num){
            if(count==0){
                candidate=nums;
            }
            if(candidate==nums){
                count++;
            }
            else{
                count--;
            }

        }
        return candidate;
    }
    public static void main(String[] args){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        task34 obj = new task34();
        int result = obj.vli(nums);
        System.out.println("Majority Element: " + result);

    }
}
