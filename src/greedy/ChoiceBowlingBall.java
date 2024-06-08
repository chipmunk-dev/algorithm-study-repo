package greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChoiceBowlingBall {
    public static void main(String[] args) {
        ChoiceBowlingBall cbl = new ChoiceBowlingBall();
        Scanner sc = new Scanner(System.in);

        int bowlingCount = sc.nextInt();
        int bowlSize = sc.nextInt();
        int[] bowling = new int[bowlingCount];

        for(int i=0; i<bowlingCount; i++) {
            bowling[i] = sc.nextInt();
        }

        cbl.solution(bowlingCount, bowlSize, bowling);
    }

    public void solution(int bowlingCount, int bowlSize, int[] bowling) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<bowling.length; i++) {
            if(map.get(bowling[i]) != null) {
                map.put(bowling[i], map.get(bowling[i]) + 1);
            } else {
                map.put(bowling[i], 1);
            }
        }

        for(int i=1; i<=bowlSize; i++) {
            bowlingCount-=map.get(i);

            result += map.get(i) * bowlingCount;
        }

        System.out.println(result);
    }
}
