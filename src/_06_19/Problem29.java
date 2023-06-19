package _06_19;

import java.util.ArrayList;

public class Problem29 {
    public long solution(int n) {
        long answer = 0;
        int index = 0;
        ArrayList<Integer> three = new ArrayList<>();
        while (n >= 3) {
            three.add(n % 3);
            n /= 3;
        }
        three.add(n);
        for (int i = three.size()-1; i >= 0 ; i--) {
            answer += three.get(index++) * (long) Math.pow(3, i);
        }

        return answer;
    }

}
