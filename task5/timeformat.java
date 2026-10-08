package task5;
import java.util.*;
public class timeformat {
    static String timecober(String time){
        int hour=Integer.parseInt(time.substring(0,2));
        String minutesSecound=time.substring(2,8);
        String period=time.substring(8,10);
        if(period.equals("AM")){
            if(hour==12){
                hour=0;
            }else{
                if(hour!=12){
                    hour=hour+12;
                }
            }
            
        }
        return String.format("%02d",hour)+minutesSecound;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String time = sc.next();
        String result = timecober(time);
        System.out.println(result);

        sc.close();
    }
}
