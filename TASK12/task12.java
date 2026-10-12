package TASK12;
import java.util.*;
public class task12 {
    public int findjudge(int n,int[][] trust){
        int[] trustedBy=new int[n+1];
        int[] trusts=new int[n+1];
        for(int[] relation:trust){
            trusts[relation[0]]++;
            trustedBy[relation[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(trusts[i]==0 && trustedBy[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]trust=new int[m][2];
         for (int i = 0; i < m; i++) {
            trust[i][0] = sc.nextInt();
            trust[i][1] = sc.nextInt();
        }

        task12 obj = new task12();
        int answer = obj.findjudge(n, trust);

        System.out.println(answer);

        sc.close();
    }
}
