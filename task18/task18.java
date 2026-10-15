package task18;

import java.util.Scanner;
import java.util.Arrays;

public class task18 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter how many number you want to enter");
        int n=sc.nextInt();
        System.out.println("enter the number ");
        int[] nums=new int[n];
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+Math.abs(nums[i]-nums[j]);
            }
            result[i]=sum;
        }
        System.out.println(Arrays.toString(result));
    }
}
