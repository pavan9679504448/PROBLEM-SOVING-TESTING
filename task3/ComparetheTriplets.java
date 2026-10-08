package task3;

public class ComparetheTriplets {
    static int[] triple(int[]a,int[]b){
        int alice=0;
        int bob=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i]){
                alice++;
            }else if(a[i]<b[i]){
                bob++;
            }
        }
        return new int[]{bob, alice};
    }
    public static void main(String[] args) {
        int[] a = {5, 6, 7};
        int[] b = {3, 6, 10};
        int[] result = triple(a, b);
        System.out.println("Bob's score: " + result[0]);
        System.out.println("Alice's score: " + result[1]);
    }
}
