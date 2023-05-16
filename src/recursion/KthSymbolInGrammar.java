// Find the kth symbol in the nth row, if each row starts with 0 and they follow the rules based on the problem for subsequent rows.
// https://leetcode.com/explore/learn/card/recursion-i/253/conclusion/1675/

package recursion;

public class KthSymbolInGrammar {
    public static int kthGrammar(int n, int k) {

        if (n == 1) {
            return 0;
        }
        
        int mid = (int) Math.pow(2, (n - 2)); 
        if ( k <= mid / 2) {
            return kthGrammar(n-1, k);
        } else {
            return 1 - kthGrammar(n-1, k-1);
        }
        
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(2, 2));
        System.out.println(kthGrammar(4, 5));
    }
}
