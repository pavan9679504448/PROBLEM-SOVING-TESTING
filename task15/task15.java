package task15;

import java.util.*;
public class task15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] nums={1,2,4,3,5};
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}