package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ImpossibleAmounts {
    public static void main(String[] args) {
        ImpossibleAmounts ia = new ImpossibleAmounts();
        Scanner sc = new Scanner(System.in);

        int coinCount = sc.nextInt();
        int[] coins = new int[coinCount];

        for(int index=0; index<coinCount; index++) {
            coins[index] = sc.nextInt();
        }

        ia.solution(coins);
    }

    public void solution(int[] coins) {
        Arrays.sort(coins);

        int target = 1;

        for(int i=0; i<coins.length; i++) {
            int currentValue = coins[i];

            if(target < currentValue) {
                break;
            }

            target += currentValue;
        }

        System.out.println(target);
    }
}
