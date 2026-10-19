package task35;

public class task35 {

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n = n >>> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 43261596;

        task35 obj = new task35();
        int result = obj.reverseBits(n);

        System.out.println("Reversed bits: " + Integer.toUnsignedLong(result));
    }
}
