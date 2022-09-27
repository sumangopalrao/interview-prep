/*** Program to find number of coins required to make sum **/

package dynamicprogramming;

import java.util.Scanner;

public class CoinChange {
    
    public static int makeChange(int[] coins, int money) {
        int[] coinsMap = new int[money+1];
        coinsMap[0] = 0;
        
        for(int i=1; i<coinsMap.length; i++) {
            coinsMap[i] = Integer.MAX_VALUE;
        }
        
        for(int i=0; i<=money; i++) {
            for(int j=0; j<coins.length; j++) {
                if(coins[j] <= i) {
                    coinsMap[i] = Math.min(coinsMap[i], 1+coinsMap[i-coins[j]]);
                }
            }
        }
        return coinsMap[money];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] coins = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
        in.close();
    }
}

