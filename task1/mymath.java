package task1;

import java.util.Scanner;
public class mymath {
    interface PerformOperation {
        boolean check(int number);
    }
    static class MyMath {
        public PerformOperation isOdd() {
            return number -> number % 2 != 0;
        }
        public PerformOperation isPrime() {
            return number -> {
                if (number < 2) {
                    return false;
                }
                for (int i = 2; i <= number / i; i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            };
        }
        public PerformOperation isPalindrome() {
            return number -> {
                if (number < 0) {
                    return false;
                }
                int original = number;
                long reverse = 0;
                while (number > 0) {
                    int digit = number % 10;
                    reverse = reverse * 10 + digit;
                    number = number / 10;
                }
                return original == reverse;
            };
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMath math = new MyMath();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int choice = sc.nextInt();
            int number = sc.nextInt();
            PerformOperation operation;
            boolean result;
            switch (choice) {
                case 1:
                    operation = math.isOdd();
                    result = operation.check(number);
                    if (result) {
                        System.out.println("ODD");
                    } else {
                        System.out.println("EVEN");
                    }
                    break;
                case 2:
                    operation = math.isPrime();
                    result = operation.check(number);
                    if (result) {
                        System.out.println("PRIME");
                    } else {
                        System.out.println("COMPOSITE");
                    }
                    break;
                case 3:
                    operation = math.isPalindrome();
                    result = operation.check(number);
                    if (result) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NOT PALINDROME");
                    }
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
        sc.close();
    }
}