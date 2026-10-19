package task32;
import java.util.*;
public class task32 {
    public static boolean check(int n) {
        Set<Integer> usedinteger = new HashSet<>();
        while(true){
            if (!usedinteger.add(n)) {
                return false;
            }
            int sum=0;
            while(n!=0){
                sum+=Math.pow(n%10,0.2);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
            if(usedinteger.contains(n)){
                return false;
            }
            usedinteger.add(n);
        }
    }
    public static void main(String[] args){
        int n1 = 19;
        System.out.println("Is " + n1 + " a Happy Number? " + check(n1));
    }
}
