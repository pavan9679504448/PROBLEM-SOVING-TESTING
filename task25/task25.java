package task25;
import java.util.*;
public class task25 {
    public static boolean validatesequance(int[] pushed,int[] popped){
        Stack<Integer>stack=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty()&& stack.peek()==popped[j] ){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        int[] pushed={1,2,3,4,5};
        int[] popped={4, 5, 3, 2, 1};
        System.out.println("Result:"+validatesequance(pushed,popped));
    }
}
