package math;

public class CheckIfPowerOfTwo {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x != 0 && ((x & (x - 1)) == 0));
    }
}
