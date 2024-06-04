package greedy;

import java.util.Scanner;

public class MultiplyOrAdd {
    public static void main(String[] args) {
        MultiplyOrAdd ma = new MultiplyOrAdd();
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        ma.soution(data);
    }

    public void soution(String data) {
        int result = Integer.parseInt(String.valueOf(data.charAt(0)));

        for(int i=1; i<data.length(); i++) {
            int currentData = Integer.parseInt(String.valueOf(data.charAt(i)));
            if(result == 0 || currentData == 0) {
                result += currentData;
            } else {
                result *= currentData;
            }
        }

        System.out.println(result);
    }
}
