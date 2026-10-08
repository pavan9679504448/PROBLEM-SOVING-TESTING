package task4;
import java.util.*;
public class cantainduplicate {
    static boolean cantaindulicate(int[] nums){
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        boolean result=cantaindulicate(nums);
        if(result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
