package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Adventurers_guild {
    public static void main(String[] args) {
        Adventurers_guild ag = new Adventurers_guild();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ag.solution(n, arr);
    }

    public void solution(int n, int[] arr) {
        /**
         * 1. 공포도가 적은 인원순부터 오른차순으로 정렬하기
         * 2. 인원을 순회하며 공포도를 확인하기
         * 3. 현재 팀원의 수가 자신의 공포도보다 크거나 같으면 길드원으로 결성하기
         */
        int result = 0;
        int cnt = 0;

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            cnt++;

            if(cnt >= arr[i]) {
                result++;
                cnt = 0;
            }
        }

        System.out.println(result);
    }
}
