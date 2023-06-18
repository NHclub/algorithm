package _06_18;

import java.util.ArrayList;

public class Problem28 {
    public boolean solution(int x) {
        ArrayList<Integer> numList = new ArrayList<>();
        int sum = 0;
        int equlsNumber = x;
        while (x > 0) {
            numList.add(x % 10);
            x /= 10;
        }

        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
        }

        if (equlsNumber % sum == 0) {
            return true;
        } else {
            return false;
        }

    }

}
