package task21;

import java.util.Scanner;

public class task21 {
   public static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maximumSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        return maximumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubarraySum(arr));

        sc.close();
    }
    }

