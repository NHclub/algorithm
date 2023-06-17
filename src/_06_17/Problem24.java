package _06_17;

import java.util.Arrays;
import java.util.Collections;

public class Problem24 {
    public long solution(long n) {
        long answer = 0;
        long count = 0;
        String[] nString = Long.toString(n).split("");
        Arrays.sort(nString, Collections.reverseOrder());
        String sortArray = "";

        for (int i = 0; i < nString.length; i++) {
            sortArray += nString[i];
        }
        answer = Long.parseLong(sortArray);

        return answer;

    }
}
