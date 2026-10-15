package task19;
import java.util.*;

public class task19 {
    public int proprince(int[] prices){
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                }

            }
        }
        return maxprofit;

    }
    public static void main(String[] args){
        int [] prices={1,2,4,5,6,7};
        task19 obj=new task19();
        int result=obj.proprince(prices);
        System.out.println(result);

    }
}
