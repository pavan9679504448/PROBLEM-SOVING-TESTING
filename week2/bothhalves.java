package week2;
import java.util.Scanner;
public class bothhalves {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            int n=s.length();
            int[]left=new int[26];
            int[]right=new int[26];
            for(int j=0;j<n/2;j++){
                int index=s.charAt(j)-'a';
                left[index]++;
            }
            int start=n/2;
            if(n%2!=0){
                start++;
            }
            for(int j=start;j<n;j++){
                int index=s.charAt(j)-'a';
                right[index]++;
            }
            boolean same=true;
            for(int k=0;k<26;k++ ){
                if(left[k]!=right[k]){
                    same=false;
                    break;
                }   
            }
            if(same){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
