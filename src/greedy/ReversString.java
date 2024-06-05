package greedy;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        ReversString rs = new ReversString();
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        rs.solution(data);
    }

    public void solution(String data) {
        int count = 0;
        char firstChar = data.charAt(0); // 첫번쨰 요소(기준 데이터)
        char prev = data.charAt(0); // 전 요소를 기억하는 변수

        for(int i=1; i<data.length(); i++) {
            char currentChar = data.charAt(i); // 현재 요소

            // 1. 전의 요소가 첫번째와 같다 -> 뒤집는 대상에 포함되어있었다.
            // 2. 현재 요소가 첫번쨰 요소가 다르다 -> 같은 요소의 반복이 끝났기에 뒤집는 카운트를 증가시킨다.
            // 즉, 전에 요소가 첫번쨰요소의 데이터와 같으면서 현재요소가 첫번째 요소가 다르다면, 뒤집는 카운트 증가
            if(prev == firstChar && firstChar != currentChar) {
                count++;
                prev = currentChar;
            }
        }

        System.out.println(count);
    }
}
