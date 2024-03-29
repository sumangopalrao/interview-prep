//Leetcode: Given a number find all the primes that are strictly less than the given number

package math;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(isPrime(10));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
    }

    private static int isPrime(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
