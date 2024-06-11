package greedy;


import java.util.*;
public class GymClothes {
    public static void main(String[] args) {
        GymClothes gc = new GymClothes();
        int result1 = gc.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        System.out.println(result1);
        int result2 = gc.solution(5, new int[]{2, 4}, new int[]{3});
        System.out.println(result2);
        int result3 = gc.solution(3, new int[]{3}, new int[]{1});
        System.out.println(result3);

    }

    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int l : lost) {
            lostSet.add(l);
        }

        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
            } else {
                reserveSet.add(r);
            }
        }

        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }

        return n - lostSet.size();
    }
}
