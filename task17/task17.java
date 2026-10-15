package task17;
import java.util.*;
public class task17 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter how many number you want to enter");
        int n=sc.nextInt();
        System.out.println("enter the number ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
