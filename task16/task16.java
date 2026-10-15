package task16;
import java.util.*;
public class task16 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter how many number you want to enter");
        int n=sc.nextInt();
        System.out.println("enter the number ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashSet<Integer> window=new HashSet<>();
        boolean containsNearbyDuplicate=false;
        if(k>0){
            for(int i=0;i<nums.length;i++){
                if(i>k){
                    window.remove(nums[i-k-1]);
                }
                if(!window.add(nums[i])){
                    containsNearbyDuplicate=true;
                    break;
                }
            }
        }
        System.out.println(containsNearbyDuplicate);
        sc.close();
    }
}
